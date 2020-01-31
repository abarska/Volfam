package com.volfam.barska.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.volfam.barska.data.TrainingDao
import com.volfam.barska.data.TrainingRepository

class FilteredListViewModel(
    trainingDao: TrainingDao,
    val app: Application,
    groups: List<String>?,
    trainers: List<String>?,
    places: List<String>?,
    minPrice: Int,
    maxPrice: Int,
    startDate: Long,
    endDate: Long
) : AndroidViewModel(app) {

    private val repository: TrainingRepository = TrainingRepository(trainingDao)

    val selectedTrainings =
        if (groups != null && trainers != null && places != null)
            repository.getFilteredTrainings(
                groups,
                trainers,
                places,
                minPrice,
                maxPrice,
                startDate,
                endDate
            )
        else repository.getAllTrainings()
}

class FilteredListViewModelFactory(
    private val trainingDao: TrainingDao,
    private val application: Application,
    private val groups: List<String>?,
    private val trainers: List<String>?,
    private val places: List<String>?,
    private val minPrice: Int,
    private val maxPrice: Int,
    private val startDate: Long,
    private val endDate: Long

) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FilteredListViewModel::class.java)) {
            return FilteredListViewModel(
                trainingDao,
                application,
                groups,
                trainers,
                places,
                minPrice,
                maxPrice,
                startDate,
                endDate
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}