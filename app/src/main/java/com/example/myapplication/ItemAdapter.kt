package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.DataSource
import com.example.myapplication.databinding.FragmentLoginBinding


class ItemAdapter (
    val dataset: List<DataSource>
    ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
    {

        inner class ItemViewHolder(binding: FragmentLoginBinding) : RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val binding =
                FragmentLoginBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ItemViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return dataset.size
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataset[position]



        }}
