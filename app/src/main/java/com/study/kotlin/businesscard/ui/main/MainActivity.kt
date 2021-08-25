package com.study.kotlin.businesscard.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun setup(){

        setuplistener()
    }

    fun setuplistener() {


    }
}
