package com.volfam.barska.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TrainingDao {

    @Insert
    fun insert(training: Training)

    @Update
    fun update(training: Training)

    @Query("SELECT * FROM $TRAINING_TABLE_NAME WHERE $TRAINING_COLUMN_ID = :key")
    fun getTraining(key: Long): LiveData<Training>

    @Query("SELECT * FROM $TRAINING_TABLE_NAME ORDER BY $TRAINING_COLUMN_DATE DESC")
    fun getAllTrainings(): LiveData<List<Training>>

    @Query(
        "SELECT * FROM $TRAINING_TABLE_NAME " +
                "WHERE $TRAINING_COLUMN_GROUP IN (:groups) " +
                "AND $TRAINING_COLUMN_TRAINER IN (:trainers) " +
                "AND $TRAINING_COLUMN_PLACE IN (:places) " +
                "AND $TRAINING_COLUMN_PRICE BETWEEN (:minPrice) AND (:maxPrice)" +
                "AND $TRAINING_COLUMN_DATE BETWEEN (:startDate) AND (:endDate)" +
                "ORDER BY $TRAINING_COLUMN_DATE DESC"
    )
    fun getFilteredTrainings(
        groups: List<String>,
        trainers: List<String>,
        places: List<String>,
        minPrice: Int,
        maxPrice: Int,
        startDate: Long,
        endDate: Long
    ): LiveData<List<Training>>

    @Query("SELECT COUNT ($TRAINING_COLUMN_ID) FROM $TRAINING_TABLE_NAME")
    fun getRows(): Int

    @Query("SELECT MAX ($TRAINING_COLUMN_PRICE) FROM $TRAINING_TABLE_NAME")
    fun getMaxPrice(): Int

    @Query("DELETE FROM $TRAINING_TABLE_NAME")
    fun clearAll()

    @Query("DELETE FROM $TRAINING_TABLE_NAME WHERE $TRAINING_COLUMN_ID = :key")
    fun delete(key: Long)
}
