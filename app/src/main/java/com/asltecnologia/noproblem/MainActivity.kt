package com.asltecnologia.noproblem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnTelaInicial = findViewById<Button>(R.id.btnTelaInicial)

        btnTelaInicial.setOnClickListener {
            val intent = Intent(this, PerguntaUmActivity::class.java)
            startActivity(intent)
        }
    }
}