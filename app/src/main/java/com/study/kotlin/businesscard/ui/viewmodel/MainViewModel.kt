package com.study.kotlin.businesscard.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.study.kotlin.businesscard.data.entity.BusinessCard
import com.study.kotlin.businesscard.data.repository.BusinessCardRepository

class MainViewModel (
  private val businessCardRepository: BusinessCardRepository
): ViewModel(){

  fun insert(businessCard: BusinessCard) {
    businessCardRepository.insert(businessCard)
  }

  fun getAll():LiveData<List<BusinessCard>>{
    return businessCardRepository.getAll()
  }
}