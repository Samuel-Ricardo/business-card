package com.study.kotlin.businesscard.ui.adapter

import android.graphics.Color
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.study.kotlin.businesscard.data.entity.BusinessCard
import com.study.kotlin.businesscard.databinding.CardBinding

class CardAdapter: ListAdapter<
    BusinessCard,
    CardViewHolder
    >(DiffCallback) {
}

class CardViewHolder(
  private val binding: CardBinding
) : RecyclerView.ViewHolder(binding.root) {

  fun bind(item:BusinessCard) {

    binding.tvCardName.text = item.name
    binding.tvCardMail.text = item.email
    binding.tvCardPhone.text = item.phone
    binding.tvCardEmpresa.text = item.company

    binding.cdContent.setBackgroundColor(
      Color.parseColor(item.background)
    )
    binding.cardview.setOnClickListener {
      listenerShare(it)
    }
  }
}

class DiffCallback: DiffUtil.ItemCallback<BusinessCard>() {

  override fun areItemsTheSame(oldItem: BusinessCard, newItem: BusinessCard) = oldItem == newItem
  override fun areContentsTheSame(oldItem: BusinessCard, newItem: BusinessCard): Boolean {
    return oldItem.id == newItem.id
  }
}