package com.example.noproblem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PerguntasFinaisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas_finais)

        val txtProblemaDefinido = findViewById<TextView>(R.id.txtProblemaDefinido)
        val btnTelaPerguntasFinais = findViewById<Button>(R.id.btnTelaPerguntasFinais)
        val problema = intent.getStringExtra("problema")
        txtProblemaDefinido.setText("SOBRE O PROBLEMA:\n ${problema}")

        btnTelaPerguntasFinais.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}