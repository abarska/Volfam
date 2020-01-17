package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao
import kotlinx.coroutines.*
import timber.log.Timber

class DetailViewModel(
    private val trainingDao: TrainingDao,
    app: Application,
    private val key: Long
) :
    AndroidViewModel(app) {

    val training: LiveData<Training> = trainingDao.getTraining(key)

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val _trainingDateTime = MutableLiveData<Long>()
    val trainingDateTime: LiveData<Long>
        get() = _trainingDateTime

    private val _trainingGroup = MutableLiveData<String>()
    val trainingGroup: LiveData<String>
        get() = _trainingGroup

    private val _trainingTrainer = MutableLiveData<String>()
    val trainingTrainer: LiveData<String>
        get() = _trainingTrainer

    private val _trainingPlace = MutableLiveData<String>()
    val trainingPlace: LiveData<String>
        get() = _trainingPlace

    private val _trainingPrice = MutableLiveData<Int>()
    val trainingPrice: LiveData<Int>
        get() = _trainingPrice

    fun initObservableValues() {
        if (_trainingDateTime.value == null) _trainingDateTime.value = training.value?.date
        if (_trainingGroup.value == null) _trainingGroup.value = training.value?.group
        if (_trainingTrainer.value == null) _trainingTrainer.value = training.value?.trainer
        if (_trainingPlace.value == null) _trainingPlace.value = training.value?.place
        if (_trainingPrice.value == null) _trainingPrice.value = training.value?.price
    }

    fun updateTrainingTime(timeInMillis: Long) {
        _trainingDateTime.value = timeInMillis
    }

    fun updateTrainingGroup(group: String) {
        _trainingGroup.value = group
    }

    fun updateTrainingTrainer(trainer: String) {
        _trainingTrainer.value = trainer
    }

    fun updateTrainingPlace(place: String) {
        _trainingPlace.value = place
    }

    fun addFiveToPrice() {
        _trainingPrice.value = _trainingPrice.value!!.plus(5)
    }

    fun substractFiveFromPrice() {
        _trainingPrice.value = _trainingPrice.value!!.minus(5)
    }

    fun updateTraining(): Training {
        val updatedTraining = Training(
            key,
            _trainingGroup.value!!,
            _trainingTrainer.value!!,
            _trainingPlace.value!!,
            _trainingDateTime.value!!,
            _trainingPrice.value!!
        )
        uiScope.launch {
            updateInBackground(updatedTraining)
        }
        return updatedTraining
    }

    private suspend fun updateInBackground(training: Training) {
        withContext(Dispatchers.IO) {
            trainingDao.update(training)
        }
    }

    fun deleteTraining() {
        uiScope.launch {
            deleteInBackgroung()
        }
    }

    private suspend fun deleteInBackgroung() {
        withContext(Dispatchers.IO) {
            trainingDao.delete(key)
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}

class DetailViewModelFactory(
    private val trainingDao: TrainingDao,
    private val application: Application,
    private val trainingId: Long
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(trainingDao, application, trainingId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}