package com.volfam.barska.viewmodels

import android.app.Application
import android.view.View
import androidx.lifecycle.*
import com.volfam.barska.data.Training
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

    private var _trainings =
        if (groups != null && trainers != null && places != null) {
            trainingDao.getAllTrainingsWithArgs(groups, trainers, places)
        } else {
            trainingDao.getAllTrainings()
        }
    val trainings: LiveData<List<Training>>
        get() = _trainings

    private var rows = 0

    init {
        uiScope.launch {
            rows = getRowsInBackground()
        }
    }

    private suspend fun getRowsInBackground() =
        withContext(Dispatchers.IO) { trainingDao.getRows() }

    val isFiltered: Boolean
        get() {
            Timber.i("list size is ${_trainings.value?.size}")
            Timber.i("rows number is $rows")
            return rows == _trainings.value?.size
        }

    fun clearFilters() {
        _trainings = trainingDao.getAllTrainings()
    }

    // don't change further code
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