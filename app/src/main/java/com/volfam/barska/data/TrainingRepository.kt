package com.volfam.barska.data

import androidx.lifecycle.LiveData

class TrainingRepository(private val trainingDao: TrainingDao) {

    suspend fun insert(training: Training) = trainingDao.insert(training)

    suspend fun update(training: Training) = trainingDao.update(training)

    fun getTraining(key: Long): LiveData<Training> = trainingDao.getTraining(key)

    fun getAllTrainings(): LiveData<List<Training>> = trainingDao.getAllTrainings()

    fun getFilteredTrainings(
        groups: List<String>,
        trainers: List<String>,
        places: List<String>,
        minPrice: Int,
        maxPrice: Int,
        startDate: Long,
        endDate: Long
    ): LiveData<List<Training>> = trainingDao.getFilteredTrainings(
        groups,
        trainers,
        places,
        minPrice,
        maxPrice,
        startDate,
        endDate
    )

    suspend fun getMaxPrice(): Int = trainingDao.getMaxPrice()

    suspend fun clearAll() = trainingDao.clearAll()

    suspend fun delete(key: Long) = trainingDao.delete(key)
}