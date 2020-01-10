package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao
import kotlinx.coroutines.*

//Use AndroidViewModel to pass Application context that lives as long as the application does
class DetailViewModel(
    private val trainingDao: TrainingDao,
    app: Application,
    private val key: Long
) :
    AndroidViewModel(app) {

    val trainingDetails: LiveData<Training> = trainingDao.getTraining(key)

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

    fun initObservables(training: Training) {
        _trainingDateTime.value = training.date
        _trainingGroup.value = training.group
        _trainingTrainer.value = training.trainer
        _trainingPlace.value = training.place
        _trainingPrice.value = training.price
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