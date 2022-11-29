package dev.miguelmachado.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val listView: RecyclerView = findViewById(R.id.lista)

    listView.layoutManager = LinearLayoutManager(this)
    listView.adapter = ListAdapter()
  }
}
