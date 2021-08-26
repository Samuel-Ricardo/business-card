package com.study.kotlin.businesscard.util

import android.content.Context
import android.view.View

class Image {

  companion object {

    fun share(context: Context, view: View){
      val bitmap = getScreenChotFromView(view)
      bitmap?.let {
        saveMediaStorage(context, bitmap)
      }
    }
  }

}