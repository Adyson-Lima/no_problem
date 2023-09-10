package com.example.noproblem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

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