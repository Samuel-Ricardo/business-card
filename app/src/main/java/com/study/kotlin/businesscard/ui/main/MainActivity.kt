package com.study.kotlin.businesscard.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityMainBinding
import com.study.kotlin.businesscard.ui.card.create.AddCardActivity

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

        binding.fabAdd.setOnClickListener{
            val intent = Intent(this@MainActivity, AddCardActivity::class.java)
            startActivity(intent)
        }
    }
}
