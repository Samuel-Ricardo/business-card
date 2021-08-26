package com.study.kotlin.businesscard.ui.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.study.kotlin.businesscard.data.repository.BusinessCardRepository
import com.study.kotlin.businesscard.ui.viewmodel.MainViewModel

class MainViewModelFactory(private val repository: BusinessCardRepository): ViewModelProvider.Factory {

  override fun <T : ViewModel?> create(modelClass: Class<T>): T {

    if(modelClass.isAssignableFrom(MainViewModel::class.java)){
      @Suppress("UNCHECKED_CAST")
      return MainViewModel(repository) as T
    }

    throw IllegalArgumentException("<Me> Unknow ViewModel Class")
  }
}