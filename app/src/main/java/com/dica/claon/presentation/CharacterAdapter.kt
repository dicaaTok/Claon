package com.dica.claon.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dica.claon.databinding.ItemSeriesBinding
import com.dica.claon.domain.model.Characters

class CharactersAdapter : RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    private val items = mutableListOf<Characters>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<Characters>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    inner class CharactersViewHolder(val binding: ItemSeriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(characters: Characters) {
            binding.apply {
                tvName.text = characters.name
                tvDead.text = characters.dead
                tvLocation.text = characters.location
                tvSeen.text = characters.seen
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val binding = ItemSeriesBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CharactersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}