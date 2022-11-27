package dev.miguelmachado.modulo8

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
  var textTitle: TextView? = null
  var textFieldValue: TextView? = null
  var editText: EditText? = null
  var tela: ConstraintLayout? = null
  private var numClicks = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    textTitle = findViewById<TextView>(R.id.textView)
    textFieldValue = findViewById<TextView>(R.id.textViewFieldValue)
    editText = findViewById(R.id.inputText)
    tela = findViewById(R.id.tela)
    val button = findViewById<Button>(R.id.button)

    textTitle?.text = "Hello World!"

    button.setOnClickListener {
      changeTitle()
      numClicks++
    }

    editText?.addTextChangedListener {
      textFieldValue?.text = it?.toString()
    }
  }

  private fun changeTitle() {
    textTitle?.text = "Clicou no botão"

    when {
      numClicks % 2 == 0 -> tela?.setBackgroundColor(getColor(R.color.purple_500))
      numClicks % 3 == 0 -> tela?.setBackgroundColor(getColor(R.color.black))
      else -> tela?.setBackgroundColor(getColor(R.color.teal_700))
    }
  }
}
