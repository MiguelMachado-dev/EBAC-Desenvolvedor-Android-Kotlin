package dev.miguelmachado.listapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.miguelmachado.listapp.databinding.ItemBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
    return ListItemViewHolder(
      ItemBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
      )
    )
  }

  override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
    holder.position.text = position.toString()
    holder.content.text = "Item $position"
  }

  override fun getItemCount(): Int {
    return 1
  }

  // binding.root é a raiz do layout item.xml - que é a view que o RecyclerView vai usar para exibir
  class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
    var position: TextView = binding.posicao
    var content: TextView = binding.conteudo
  }
}
