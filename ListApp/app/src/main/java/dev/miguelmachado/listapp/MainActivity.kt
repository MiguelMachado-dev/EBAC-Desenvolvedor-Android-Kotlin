package dev.miguelmachado.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import dev.miguelmachado.listapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {
  // ActivityMainBinding is a class generated by the Android Gradle plugin. It is the layout name
  private lateinit var binding: ActivityMainBinding
  private val itemList: MutableList<ListItem> = mutableListOf()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val listView: RecyclerView = binding.lista

    createMockData()

    listView.layoutManager = LinearLayoutManager(this)
    listView.adapter = ListAdapter(listItems = itemList, listener = this)
  }

  private fun createMockData() {
    itemList.add(ListItem("São Paulo", "SP"))
    itemList.add(ListItem("Rio de Janeiro", "RJ"))
    itemList.add(ListItem("Belo Horizonte", "MG"))
    itemList.add(ListItem("Salvador", "BA"))
    itemList.add(ListItem("Fortaleza", "CE"))
    itemList.add(ListItem("Brasília", "DF"))
    itemList.add(ListItem("Curitiba", "PR"))
    itemList.add(ListItem("Manaus", "AM"))
    itemList.add(ListItem("Recife", "PE"))
  }

  override fun onItemClicked(content: String) {
    Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
  }
}