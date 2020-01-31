package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.data.TrainingDao
import com.volfam.barska.data.TrainingRepository
import kotlinx.coroutines.*

class ListViewModel(trainingDao: TrainingDao, val app: Application) : AndroidViewModel(app) {

    private val repository: TrainingRepository = TrainingRepository(trainingDao)
    val trainings = repository.getAllTrainings()

    private val _navigateToDetailFragment = MutableLiveData<Long>()
    val navigateToDetailFragment: LiveData<Long>
        get() = _navigateToDetailFragment

    private val _navigateToFilterFragment = MutableLiveData<Int>()
    val navigateToFilterFragment: LiveData<Int>
        get() = _navigateToFilterFragment

    fun onTrainingClicked(trainingId: Long) {
        _navigateToDetailFragment.value = trainingId
    }

    fun onTrainingDetailNavigated() {
        _navigateToDetailFragment.value = null
    }

    fun onFilterMenuItemClicked() =
        viewModelScope.launch { _navigateToFilterFragment.value = repository.getMaxPrice() }

    fun onFilterFragmentNavigated() {
        _navigateToFilterFragment.value = null
    }

    fun clearData() = viewModelScope.launch { repository.clearAll() }
}

class ListViewModelFactory(
    private val trainingDao: TrainingDao,
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            return ListViewModel(trainingDao, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}