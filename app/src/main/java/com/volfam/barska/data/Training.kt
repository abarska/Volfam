package com.volfam.barska.data

import androidx.annotation.NonNull
import androidx.annotation.Nullable
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

const val TRAINING_COLUMN_NUMBER_OF_PLAYERS = "volfam_training_column_number_of_players"
const val TRAINING_COLUMN_AMOUNT_COLLECTED = "volfam_training_column_amount_collected"
const val TRAINING_COLUMN_PAID_TRAINER = "volfam_training_column_paid_to_trainer"
const val TRAINING_COLUMN_PAID_GYM = "volfam_training_column_paid_for_gym"
const val TRAINING_COLUMN_EXTRA_INCOMES_AMOUNT = "volfam_training_column_extra_incomes_amount"
const val TRAINING_COLUMN_EXTRA_INCOMES_COMMENT = "volfam_training_column_extra_incomes_comment"
const val TRAINING_COLUMN_EXTRA_EXPENSES_AMOUNT = "volfam_training_column_extra_expenses_amount"
const val TRAINING_COLUMN_EXTRA_EXPENSES_COMMENT = "volfam_training_column_extra_expenses_comment"

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
) {

    @ColumnInfo(name = TRAINING_COLUMN_NUMBER_OF_PLAYERS)
    @Nullable
    var numberOfPlayers: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_AMOUNT_COLLECTED)
    @Nullable
    var amountCollected: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_PAID_TRAINER)
    @Nullable
    var paidToTrainer: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_PAID_GYM)
    @Nullable
    var paidForGym: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_EXTRA_INCOMES_AMOUNT)
    @Nullable
    var extraIncomesAmount: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_EXTRA_INCOMES_COMMENT)
    @Nullable
    var extraIncomesComment: String? = ""

    @ColumnInfo(name = TRAINING_COLUMN_EXTRA_EXPENSES_AMOUNT)
    @Nullable
    var extraExpensesAmount: Int? = -1

    @ColumnInfo(name = TRAINING_COLUMN_EXTRA_EXPENSES_COMMENT)
    @Nullable
    var extraExpensesComment: String? = ""


}
