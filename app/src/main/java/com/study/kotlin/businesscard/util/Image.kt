package com.study.kotlin.businesscard.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View

class Image {

  companion object {

    fun share(context: Context, view: View){
      val bitmap = getScreenShotFromView(view)
      bitmap?.let {
        saveMediaStorage(context, bitmap)
      }
    }

    private fun getScreenShotFromView(view: View):Bitmap? {

      var screenshot: Bitmap? = null

      try {
        screenshot = Bitmap.createBitmap(
          view.measuredWidth,
          view.measuredHeight,
          Bitmap.Config.ARGB_8888
        )

        val canvas = Canvas(screenshot)

        view.draw(canvas)

      }catch (e: Exception) {
        Log.e("GFG",  "Failed to capture screenshot because: ${e.message}")
      }

      return screenshot
    }
  }

}