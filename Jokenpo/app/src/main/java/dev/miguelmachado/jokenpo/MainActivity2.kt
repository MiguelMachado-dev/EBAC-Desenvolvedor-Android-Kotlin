package dev.miguelmachado.jokenpo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.miguelmachado.jokenpo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMain2Binding.inflate(layoutInflater)
    setContentView(binding.root)

    if (intent?.extras?.isEmpty == false) {
      val name = intent.getStringExtra("name")
      val age = intent.getIntExtra("age", 0)
    }

    val result = Intent()
    result.putExtra("result", "Hello from Activity 2")
    setResult(RESULT_OK, result)

    binding.finishActivity2.setOnClickListener {
      finish()
    }
  }
}
