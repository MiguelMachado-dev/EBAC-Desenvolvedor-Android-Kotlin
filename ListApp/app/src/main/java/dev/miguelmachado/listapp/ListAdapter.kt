package dev.miguelmachado.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)

    return ListItemViewHolder(view)
  }

  override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
    holder.position.text = position.toString()
    holder.content.text = "Item $position"
  }

  override fun getItemCount(): Int {
    return 1
  }

  class ListItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var position: TextView = view.findViewById(R.id.posicao)
    var content: TextView = view.findViewById(R.id.conteudo)
  }
}
