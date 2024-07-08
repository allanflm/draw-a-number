package com.allanfelipe.meuprimeiroprojeto

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View) {
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = Random().nextInt(10)// 0..10
        textoResultado.setText("Numero gerado: $numero")
    }

}