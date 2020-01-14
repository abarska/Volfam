package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.volfam.barska.data.Training
import com.volfam.barska.data.TrainingDao

class FilteredListViewModel(
    trainingDao: TrainingDao,
    val app: Application,
    groups: List<String>?,
    trainers: List<String>?,
    places: List<String>?
) : AndroidViewModel(app) {

    val selectedTrainings =
        if (groups != null && trainers != null && places != null) trainingDao.getAllTrainingsWithArgs(
            groups,
            trainers,
            places
        ) else trainingDao.getAllTrainings()
}

class FilteredListViewModelFactory(
    private val trainingDao: TrainingDao,
    private val application: Application,
    private val groups: List<String>?,
    private val trainers: List<String>?,
    private val places: List<String>?
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FilteredListViewModel::class.java)) {
            return FilteredListViewModel(trainingDao, application, groups, trainers, places) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}