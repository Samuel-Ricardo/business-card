package com.study.kotlin.businesscard.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.study.kotlin.businesscard.App
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityMainBinding
import com.study.kotlin.businesscard.ui.adapter.CardAdapter
import com.study.kotlin.businesscard.ui.card.create.AddCardActivity
import com.study.kotlin.businesscard.ui.viewmodel.MainViewModel
import com.study.kotlin.businesscard.ui.viewmodel.factory.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainViewModel:MainViewModel by viewModels{
        MainViewModelFactory((application as App).repository)
    }

    private val adapter by lazy { CardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setup()
    }

    fun setup(){

        binding.rcCards
        setuplistener()
    }

    fun setuplistener() {

        binding.fabAdd.setOnClickListener{
            val intent = Intent(this@MainActivity, AddCardActivity::class.java)
            startActivity(intent)
        }
    }
}
