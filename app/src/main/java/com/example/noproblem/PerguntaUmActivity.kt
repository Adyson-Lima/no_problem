package com.example.noproblem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PerguntaUmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_um)
        val txtPerguntaUm = findViewById<EditText>(R.id.txtPerguntaUm)
        val btnTelaPerguntaUm = findViewById<Button>(R.id.btnTelaPerguntaUm)

        btnTelaPerguntaUm.setOnClickListener {
            val texto = txtPerguntaUm.text.toString()
            Toast.makeText(this,texto,Toast.LENGTH_SHORT).show()
        }

    }
}