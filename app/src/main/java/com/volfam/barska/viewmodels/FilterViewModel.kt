package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.R
import java.util.*

const val ACTION_ADD = 100
const val ACTION_REMOVE = 200

class FilterViewModel(val app: Application) :
    AndroidViewModel(app) {

    private val _setOfTrainers = mutableSetOf<Int>()
    val arrayOfTrainers: IntArray
        get() = _setOfTrainers.toIntArray()

    private val _setOfGroups = mutableSetOf<Int>()
    val arrayOfGroups: IntArray
        get() = _setOfGroups.toIntArray()

    private val _setOfPlaces = mutableSetOf<Int>()
    val arrayOfPlaces: IntArray
        get() = _setOfPlaces.toIntArray()

    fun modifySet(tag: String, value: String, action: Int) {
        when (action) {
            ACTION_ADD -> addValue(tag, value)
            ACTION_REMOVE -> removeValue(tag, value)
        }
    }

    private fun addValue(tag: String, value: String) {
        val context = app.applicationContext
        when (tag) {
            context.getString(R.string.group_label) -> _setOfGroups.add(
                context.resources.getStringArray(
                    R.array.groups
                ).indexOf(value)
            )
            context.getString(R.string.trainer_label) -> _setOfTrainers.add(
                context.resources.getStringArray(
                    R.array.trainers
                ).indexOf(value)
            )
            context.getString(R.string.place_label) -> _setOfPlaces.add(
                context.resources.getStringArray(
                    R.array.places
                ).indexOf(value)
            )
        }
    }

    private fun removeValue(tag: String, value: String) {
        val context = app.applicationContext
        when (tag) {
            context.getString(R.string.group_label) -> _setOfGroups.remove(
                context.resources.getStringArray(
                    R.array.groups
                ).indexOf(value)
            )
            context.getString(R.string.trainer_label) -> _setOfTrainers.remove(
                context.resources.getStringArray(
                    R.array.trainers
                ).indexOf(value)
            )
            context.getString(R.string.place_label) -> _setOfPlaces.remove(
                context.resources.getStringArray(
                    R.array.places
                ).indexOf(value)
            )
        }
    }

    private val prices = mutableListOf(Int.MIN_VALUE, Int.MAX_VALUE)
    fun getPrices() = Pair(prices[0], prices[1])

    private val _priceRangeText = MutableLiveData<String>(app.getString(R.string.price_label))
    val priceRangeText: LiveData<String>
        get() = _priceRangeText

    fun updatePrice(left: Int, right: Int) {
        _priceRangeText.value = app.getString(R.string.price_range, left, right)
        prices[0] = left
        prices[1] = right
    }

    private val dates = mutableListOf<Long>()

    fun addDate(millis: Long) = dates.add(millis)
    fun removeDate(millis: Long) = dates.remove(millis)

    fun getDates(): Pair<Long, Long> {
        return when (dates.size) {
            2 -> Pair(dates.min()!!, getEndOfDay(dates.max()!!))
            1 -> Pair(dates[0], getEndOfDay(dates[0]))
            else -> Pair(Long.MIN_VALUE, Long.MAX_VALUE)
        }
    }

    private fun getEndOfDay(millis: Long): Long {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = millis
        val nextDay = calendar.get(Calendar.DATE) + 1
        calendar.set(Calendar.DATE, nextDay)
        return calendar.timeInMillis - 1
    }
}


class FilterViewModelFactory(private val app: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FilterViewModel::class.java)) {
            return FilterViewModel(app) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}