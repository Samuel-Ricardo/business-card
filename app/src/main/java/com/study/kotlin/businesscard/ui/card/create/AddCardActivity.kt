package com.study.kotlin.businesscard.ui.card.create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityAddCardBinding

class AddCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setup()
    }

    fun setup(){

        setuplistener()
    }

    fun setuplistener() {

        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener{

        }
    }
}
