package com.study.kotlin.businesscard.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View
import android.os.Build
import android.provider.MediaStore
import java.io.OutputStream

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

    private fun saveMediaStorage(context: Context, bitmap: Bitmap) {

      val FILE_NAME = "${System.currentTimeMillis()}.jpg"

      var fos: OutputStream? = null

      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {

        context.contentResolver?.also {
          put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
          put(MediaStore.MediaColumns.MIME_TYPE, "image/jpg")
          put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
        }

        val imageURI: Uri? = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
      }
    }
  }

}