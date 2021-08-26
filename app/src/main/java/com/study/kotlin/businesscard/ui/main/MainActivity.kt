package com.study.kotlin.businesscard.ui.main

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
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

        setupPermissions()

        binding.rcCards.adapter = adapter

        setuplistener()
    }

   fun setupPermissions(){
     ActivityCompat.requestPermissions(
       this,
       arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
       1
     )
     requestPermissions(
       arrayOf(
         Manifest.
          permission.
            READ_EXTERNAL_STORAGE
       ),
       1
     )
   }

    fun setuplistener() {

        binding.fabAdd.setOnClickListener{
            val intent = Intent(this@MainActivity, AddCardActivity::class.java)
            startActivity(intent)
        }
    }

  private fun getAllBusinessCard() {

    mainViewModel.getAll().observe((this, {businessCards ->

          adapter.submitList(businessCards)
        }
      )
    )
  }
}
