package com.study.kotlin.businesscard.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.study.kotlin.businesscard.data.database.dao.BusinessCardDAO
import com.study.kotlin.businesscard.data.entity.BusinessCard

@Database(entities = [BusinessCard::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

  abstract fun businessCardDAO(): BusinessCardDAO

  companion object{

    // Singleton prevents multiple instances of database opening at the
    // same time.

    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context):AppDatabase {

      // if the INSTANCE is not null, then return it,
      // if it is, then create the database

      return INSTANCE ?: synchronized(this) {
        val instance = Room.databaseBuilder(
          context.applicationContext,
          AppDatabase::class.java,
          "businesscard_db"
        ).build()
        INSTANCE = instance

        // return instance
        instance
      }
    }
  }
}