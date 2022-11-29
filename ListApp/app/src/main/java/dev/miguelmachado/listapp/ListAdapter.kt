package dev.miguelmachado.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.miguelmachado.listapp.databinding.ItemBinding

class ListAdapter(
  val listItems: MutableList<ListItem>,
  val listener: ListAdapterListener
) :
  RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

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
    val item = listItems[position]
    holder.position.text = position.toString()
    holder.content.text = item.city

    holder.root.setOnClickListener {
      listener.onItemClicked(item.city)
    }
  }

  override fun getItemCount(): Int {
    return listItems.size
  }

  // binding.root é a raiz do layout item.xml - que é a view que o RecyclerView vai usar para exibir
  class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
    var position: TextView = binding.posicao
    var content: TextView = binding.conteudo
    var root: View = binding.root
  }

  interface ListAdapterListener {
    fun onItemClicked(content: String);
  }
}
