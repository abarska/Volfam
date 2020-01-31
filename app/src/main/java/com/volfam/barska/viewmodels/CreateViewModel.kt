package com.volfam.barska.viewmodels

import android.app.Application
import android.text.TextUtils
import androidx.lifecycle.*
import com.volfam.barska.R
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao
import kotlinx.coroutines.*
import java.util.*

const val STANDARD_TRAINING_START_TIME_HOUR = 19
const val STANDARD_TRAINING_START_TIME_MINUTE = 0

//Don't keep a reference to a context that has a shorter lifecycle than ViewModel
//Use AndroidViewModel to pass Application context that lives as long as the application does
class CreateViewModel(private val trainingDao: TrainingDao, val app: Application) :
    AndroidViewModel(app) {

    private var group = ""
    private var trainer = ""
    private var place = ""
    private var price = ""

    private var calendar = Calendar.getInstance()
    private var currentTime = System.currentTimeMillis()

    private var viewModelJob = Job()

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

        val ioScope = CoroutineScope(Dispatchers.IO + viewModelJob)
        ioScope.launch {
            withContext(Dispatchers.IO) {
                trainingDao.insert(newTraining)
            }
        }
        _training.value = newTraining
    }

    fun doneNewTraining() {
        _training.value = null
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}

class CreateViewModelFactory(
    private val database: TrainingDao,
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateViewModel::class.java)) {
            return CreateViewModel(database, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}