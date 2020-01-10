package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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

    override fun onCleared() {
        super.onCleared()
        Timber.i("$_setOfTrainers")
        Timber.i("$_setOfGroups")
        Timber.i("$_setOfPlaces")
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