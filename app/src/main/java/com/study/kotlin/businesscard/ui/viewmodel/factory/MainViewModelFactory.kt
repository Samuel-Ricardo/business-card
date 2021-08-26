package com.study.kotlin.businesscard.ui.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.study.kotlin.businesscard.data.repository.BusinessCardRepository

class MainViewModelFactory(private val repository: BusinessCardRepository): ViewModelProvider.Factory {

  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    TODO("Not yet implemented")
  }
}