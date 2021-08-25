package com.study.kotlin.businesscard.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BussinesCard (

    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name:String,
    val company:String,
    val phone:String,
    val email:String,
    val background: String,
)