package com.volfam.barska.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import timber.log.Timber

const val DATABASE_NAME = "volfam_training_database"

// need to change the export schema to true when migrating the database
@Database(entities = [Training::class], version = 2, exportSchema = false)
abstract class VolfamDatabase : RoomDatabase() {

    abstract val trainingDao: TrainingDao

    companion object {

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                Timber.i("migration_1_2")
                database.apply {
                    execSQL(
                        "CREATE TABLE temporary_table (" +
                                "$TRAINING_COLUMN_ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                                "$TRAINING_COLUMN_GROUP TEXT NOT NULL, " +
                                "$TRAINING_COLUMN_TRAINER TEXT NOT NULL, " +
                                "$TRAINING_COLUMN_PLACE TEXT NOT NULL, " +
                                "$TRAINING_COLUMN_DATE INTEGER NOT NULL, " +
                                "$TRAINING_COLUMN_PRICE INTEGER NOT NULL, " +
                                "$TRAINING_COLUMN_NUMBER_OF_PLAYERS INTEGER, " +
                                "$TRAINING_COLUMN_AMOUNT_COLLECTED INTEGER, " +
                                "$TRAINING_COLUMN_PAID_TRAINER INTEGER, " +
                                "$TRAINING_COLUMN_PAID_GYM INTEGER, " +
                                "$TRAINING_COLUMN_EXTRA_INCOMES_AMOUNT INTEGER, " +
                                "$TRAINING_COLUMN_EXTRA_INCOMES_COMMENT TEXT, " +
                                "$TRAINING_COLUMN_EXTRA_EXPENSES_AMOUNT INTEGER, " +
                                "$TRAINING_COLUMN_EXTRA_EXPENSES_COMMENT TEXT)"
                    )
                    execSQL(
                        "INSERT INTO temporary_table (" +
                                "$TRAINING_COLUMN_ID, " +
                                "$TRAINING_COLUMN_GROUP, " +
                                "$TRAINING_COLUMN_TRAINER, " +
                                "$TRAINING_COLUMN_PLACE, " +
                                "$TRAINING_COLUMN_DATE, " +
                                "$TRAINING_COLUMN_PRICE) " +
                                "SELECT $TRAINING_COLUMN_ID, " +
                                "$TRAINING_COLUMN_GROUP, " +
                                "$TRAINING_COLUMN_TRAINER, " +
                                "$TRAINING_COLUMN_PLACE, " +
                                "$TRAINING_COLUMN_DATE, " +
                                "$TRAINING_COLUMN_PRICE " +
                                "FROM $TRAINING_TABLE_NAME"
                    )
                    execSQL("DROP TABLE $TRAINING_TABLE_NAME")
                    execSQL("ALTER TABLE temporary_table RENAME TO $TRAINING_TABLE_NAME")
                }
            }
        }

        @Volatile
        private var INSTANCE: VolfamDatabase? = null

        fun getInstance(context: Context): VolfamDatabase {

            synchronized(this) {

                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        VolfamDatabase::class.java,
                        DATABASE_NAME
                    )
                        .addMigrations(MIGRATION_1_2)
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}