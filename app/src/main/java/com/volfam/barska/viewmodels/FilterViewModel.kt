package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.volfam.barska.R
import timber.log.Timber

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

    var minPrice: Int = 0
        private set(value) {
            field = value
        }

    var maxPrice: Int = 0
        private set(value) {
            field = value
        }

    private val _priceRangeText = MutableLiveData<String>(app.getString(R.string.price_label))
    val priceRangeText: LiveData<String>
        get() = _priceRangeText

    fun updatePrice(left: Int, right: Int) {
        minPrice = left
        maxPrice = right
        _priceRangeText.value = app.getString(R.string.price_range, left, right)
    }
}

class FilterViewModelFactory(private val application: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FilterViewModel::class.java)) {
            return FilterViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}