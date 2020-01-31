package com.volfam.barska.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

const val DATABASE_NAME = "volfam_training_database"

// need to change the export schema to true when migrating the database
@Database(entities = [Training::class], version = 1, exportSchema = false)
abstract class VolfamDatabase : RoomDatabase() {

    abstract val trainingDao: TrainingDao

    companion object {

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
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}