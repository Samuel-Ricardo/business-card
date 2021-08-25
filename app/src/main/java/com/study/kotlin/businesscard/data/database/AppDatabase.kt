package com.study.kotlin.businesscard.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.study.kotlin.businesscard.data.database.dao.BusinessCardDAO
import com.study.kotlin.businesscard.data.entity.BusinessCard

@Database(entities = [BusinessCard::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

  abstract fun businessCardDAO(): BusinessCardDAO

}