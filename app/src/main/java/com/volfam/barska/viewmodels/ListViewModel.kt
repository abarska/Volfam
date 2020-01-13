package com.volfam.barska.viewmodels

import android.app.Application
import android.view.View
import androidx.lifecycle.*
import com.volfam.barska.data.TrainingDao
import kotlinx.coroutines.*

class ListViewModel(
    private val trainingDao: TrainingDao,
    val app: Application
) :
    AndroidViewModel(app) {

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val trainings = trainingDao.getAllTrainings()

    val listHasNoData: LiveData<Int> = Transformations.map(trainings) {
        it?.let { if (it.isEmpty()) View.VISIBLE else View.INVISIBLE }
    }

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

    fun onFilterMenuItemClicked() {
        uiScope.launch { _navigateToFilterFragment.value = getMaxPriceInBackground() }
    }

    private suspend fun getMaxPriceInBackground() = withContext(Dispatchers.IO) {
        trainingDao.getMaxPrice()
    }

    fun onFilterFragmentNavigated() {
        _navigateToFilterFragment.value = null
    }

    fun clearData() {
        uiScope.launch {
            clearInBackground()
        }
    }

    private suspend fun clearInBackground() {
        withContext(Dispatchers.IO) {
            trainingDao.clearAll()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
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