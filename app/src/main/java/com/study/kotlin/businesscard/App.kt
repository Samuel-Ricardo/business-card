package com.study.kotlin.businesscard

import android.app.Application
import com.study.kotlin.businesscard.data.database.AppDatabase
import com.study.kotlin.businesscard.data.repository.BusinessCardRepository

class App: Application() {

  val database by lazy {AppDatabase.getDatabase(this)}
  val repository by lazy {BusinessCardRepository(database.businessCardDAO())}
}