package com.volfam.barska.viewmodels

import android.app.Application
import android.view.View
import androidx.lifecycle.*
import com.volfam.barska.data.TrainingDao
import kotlinx.coroutines.*
import timber.log.Timber

class ListViewModel(
    private val trainingDao: TrainingDao,
    val app: Application,
    groups: List<String>?,
    trainers: List<String>?,
    places: List<String>?
) :
    AndroidViewModel(app) {

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val trainings =
        if (groups != null && trainers != null && places != null) {
            trainingDao.getAllTrainingsWithArgs(groups, trainers, places)
        } else {
            trainingDao.getAllTrainings()
        }

    // the observer should check isFiltered boolean only when rows initialized
    val rowsInTable = trainingDao.getRows()
    var isFiltered = false

    fun updateIsFiltered(newValue: Boolean) {
        Timber.i("isFiltered = $isFiltered")
        isFiltered = newValue
    }

    fun clearFilters() {
        // code here
    }

    // the error is somewhere above this code
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
    private val application: Application,
    private val groups: List<String>?,
    private val trainers: List<String>?,
    private val places: List<String>?
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            return ListViewModel(trainingDao, application, groups, trainers, places) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}