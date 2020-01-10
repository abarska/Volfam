package com.volfam.barska.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val TRAINING_TABLE_NAME = "volfam_training_table"
const val TRAINING_COLUMN_ID = "volfam_training_column_id"
const val TRAINING_COLUMN_GROUP = "volfam_training_column_group"
const val TRAINING_COLUMN_TRAINER = "volfam_training_column_trainer"
const val TRAINING_COLUMN_PLACE = "volfam_training_column_place"
const val TRAINING_COLUMN_DATE = "volfam_training_column_date"
const val TRAINING_COLUMN_PRICE = "volfam_training_column_price"

@Entity(tableName = TRAINING_TABLE_NAME)
data class Training(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = TRAINING_COLUMN_ID)
    val trainingId: Long,

    @NonNull
    @ColumnInfo(name = TRAINING_COLUMN_GROUP)
    var group: String,

    @NonNull
    @ColumnInfo(name = TRAINING_COLUMN_TRAINER)
    var trainer: String,

    @NonNull
    @ColumnInfo(name = TRAINING_COLUMN_PLACE)
    var place: String,

    @NonNull
    @ColumnInfo(name = TRAINING_COLUMN_DATE)
    var date: Long,

    @NonNull
    @ColumnInfo(name = TRAINING_COLUMN_PRICE)
    var price: Int
)
