package com.volfam.barska.viewmodels

import android.app.Application
import android.text.TextUtils
import androidx.lifecycle.*
import com.volfam.barska.R
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao
import com.volfam.barska.data.TrainingRepository
import com.volfam.barska.data.VolfamDatabase
import kotlinx.coroutines.*
import java.util.*

const val STANDARD_TRAINING_START_TIME_HOUR = 19
const val STANDARD_TRAINING_START_TIME_MINUTE = 0

class CreateViewModel(val app: Application) : AndroidViewModel(app) {

    private val trainingDao = VolfamDatabase.getInstance(app).trainingDao
    private val repository: TrainingRepository = TrainingRepository(trainingDao)

    private var group = ""
    private var trainer = ""
    private var place = ""
    private var price = ""

    private var calendar = Calendar.getInstance()
    private var currentTime = System.currentTimeMillis()

    private val _error = MutableLiveData<Int?>()
    val error: LiveData<Int?>
        get() = _error

    private val _training = MutableLiveData<Training>()
    val training: LiveData<Training>
        get() = _training

    fun updateGroup(groupValue: String) {
        group = groupValue
    }

    fun updateTrainer(trainerValue: String) {
        trainer = trainerValue
    }

    fun updatePlace(placeValue: String) {
        place = placeValue
    }

    fun getCalendar(): Calendar = calendar

    fun updateDate(year: Int, month: Int, date: Int) {
        calendar.apply {
            set(Calendar.YEAR, year)
            set(Calendar.MONTH, month)
            set(Calendar.DAY_OF_MONTH, date)
        }
    }

    fun updateTime(hour: Int, minute: Int) {
        calendar.apply {
            set(Calendar.HOUR_OF_DAY, hour)
            set(Calendar.MINUTE, minute)
        }
    }

    fun updatePrice(chosenPrice: String) {
        price = chosenPrice
    }

    fun validateInput() {

        if (TextUtils.isEmpty(place) || TextUtils.isEmpty(group) || TextUtils.isEmpty(trainer)) {
            _error.value = R.string.incomplete_data_error
            return
        }

        if (calendar.timeInMillis <= currentTime) {
            _error.value = R.string.past_date_error
            return
        }

        if (TextUtils.isEmpty(price)) {
            _error.value = R.string.absent_price_error
            return
        }

        val intPrice = price.toInt()

        if (intPrice < 0) {
            _error.value = R.string.incorrect_price_error
            return
        }

        if (intPrice % 5 != 0) {
            _error.value = R.string.incorrect_price_error2
            return
        }

        val newTraining = Training(0, group, trainer, place, calendar.timeInMillis, intPrice)

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.insert(newTraining)
            }
        }
        _training.value = newTraining
    }

    fun doneNewTraining() {
        _training.value = null
    }
}

class CreateViewModelFactory(private val app: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateViewModel::class.java)) {
            return CreateViewModel(app) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}