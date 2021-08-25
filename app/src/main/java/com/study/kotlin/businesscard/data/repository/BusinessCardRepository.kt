package com.study.kotlin.businesscard.data.repository

import com.study.kotlin.businesscard.data.database.dao.BusinessCardDAO
import com.study.kotlin.businesscard.data.entity.BusinessCard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val DAO: BusinessCardDAO) {

  fun insert(businessCard: BusinessCard) = runBlocking {
    launch(Dispatchers.IO){
      DAO.insert(businessCard)
    }
  }

}