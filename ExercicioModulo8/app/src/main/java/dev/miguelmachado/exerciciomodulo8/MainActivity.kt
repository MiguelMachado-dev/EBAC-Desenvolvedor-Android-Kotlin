package dev.miguelmachado.exerciciomodulo8

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
  var numClicks: Int = 0
  var textFieldValue: TextView? = null
  var button: Button? = null
  var input: EditText? = null
  var screen: ConstraintLayout? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button = findViewById(R.id.button)
    textFieldValue = findViewById(R.id.textView)
    input = findViewById(R.id.editTextTextPersonName)
    screen = findViewById(R.id.tela)

    button?.setOnClickListener {
      numClicks++

      changeTitle()
    }
  }

  private fun changeTitle() {
    if (input?.text == null) return

    textFieldValue?.text = "${input?.text} - Cliques no botão: $numClicks"

    when {
      numClicks % 2 == 0 -> screen?.setBackgroundColor(getColor(R.color.purple_500))
      numClicks % 3 == 0 -> screen?.setBackgroundColor(getColor(R.color.black))
      else -> screen?.setBackgroundColor(getColor(R.color.teal_700))
    }
  }
}
