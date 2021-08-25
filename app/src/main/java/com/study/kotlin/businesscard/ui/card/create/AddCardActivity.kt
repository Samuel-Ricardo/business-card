package com.study.kotlin.businesscard.ui.card.create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.businesscard.R
import com.study.kotlin.businesscard.databinding.ActivityAddCradBinding

class AddCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddCardBinding }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)
    }
}
