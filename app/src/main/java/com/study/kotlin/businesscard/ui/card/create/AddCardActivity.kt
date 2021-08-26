package com.study.kotlin.businesscard.ui.card.create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.material.textfield.TextInputLayout
import com.study.kotlin.businesscard.App
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.data.entity.BusinessCard
import com.study.kotlin.businesscard.databinding.ActivityAddCardBinding
import com.study.kotlin.businesscard.ui.viewmodel.MainViewModel
import com.study.kotlin.businesscard.ui.viewmodel.factory.MainViewModelFactory

class AddCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddCardBinding.inflate(layoutInflater) }

    private val mainViewModel:  MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

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

            val businessCard = BusinessCard(

                name = textOf(binding.inputName),
                email = textOf(binding.inputEmail),
                company = textOf(binding.inputCompany),
                phone = textOf(binding.inputPhone),
                background = textOf(binding.inputColor)

            )

          mainViewModel.insert(businessCard)
          Toast.makeText(
            this,
            R.string.lblsuccess,
            Toast.LENGTH_LONG
          ).show()

          finish()
        }
    }

    fun textOf(textInput: TextInputLayout): String{

        return textInput.editText?.text.toString()
    }
}
