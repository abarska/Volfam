package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao
import com.volfam.barska.data.TrainingRepository
import com.volfam.barska.data.VolfamDatabase
import kotlinx.coroutines.*

class DetailViewModel(app: Application, private val key: Long) : AndroidViewModel(app) {

    private val trainingDao = VolfamDatabase.getInstance(app).trainingDao
    private val repository: TrainingRepository = TrainingRepository(trainingDao)
    val training: LiveData<Training> = repository.getTraining(key)

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
        viewModelScope.launch {
            repository.update(updatedTraining)
        }
        return updatedTraining
    }

    fun deleteTraining() {
        viewModelScope.launch {
            repository.delete(key)
        }
    }
}

class DetailViewModelFactory(
    private val app: Application,
    private val trainingId: Long
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(app, trainingId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}