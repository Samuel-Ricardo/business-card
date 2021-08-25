package com.study.kotlin.businesscard.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(lay)  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
