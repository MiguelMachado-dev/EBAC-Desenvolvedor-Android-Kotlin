package dev.miguelmachado.listadecontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.miguelmachado.listadecontatos.databinding.ItemBinding

class ListAdapter(
  val listItems: MutableList<ContactInfo>,
  val listener: MainActivity
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
    holder.name.text = item.name
    holder.phone.text = item.phone

    holder.root.setOnClickListener {
      listener.onItemClicked(item.name)
    }
  }

  override fun getItemCount(): Int {
    return listItems.size
  }

  class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
    var name: TextView = binding.contatoNome
    var phone: TextView = binding.contatoNumero
    var root: View = binding.root
  }

  interface ListAdapterListener {
    fun onItemClicked(content: String);
  }
}
