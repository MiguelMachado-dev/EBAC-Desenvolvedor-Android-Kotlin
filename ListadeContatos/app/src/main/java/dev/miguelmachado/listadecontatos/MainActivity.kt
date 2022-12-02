package dev.miguelmachado.listadecontatos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import dev.miguelmachado.listadecontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {
  private lateinit var binding: ActivityMainBinding
  private val itemList: MutableList<ContactInfo> = mutableListOf()

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
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
    itemList.add(ContactInfo("Miguel", "22 99999-9999"))
    itemList.add(ContactInfo("João", "22 99999-9999"))
    itemList.add(ContactInfo("Maria", "22 99999-9999"))
    itemList.add(ContactInfo("José", "22 99999-9999"))
    itemList.add(ContactInfo("Ana", "22 99999-9999"))
    itemList.add(ContactInfo("Pedro", "22 99999-9999"))
    itemList.add(ContactInfo("Paulo", "22 99999-9999"))
    itemList.add(ContactInfo("Joaquim", "22 99999-9999"))
    itemList.add(ContactInfo("Júlia", "22 99999-9999"))
  }

  override fun onItemClicked(content: String) {
    Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
  }
}
