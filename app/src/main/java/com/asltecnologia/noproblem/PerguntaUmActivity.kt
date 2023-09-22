package com.asltecnologia.noproblem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerguntaUmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_um)
        val txtPerguntaUm = findViewById<EditText>(R.id.txtPerguntaUm)
        val btnTelaPerguntaUm = findViewById<Button>(R.id.btnTelaPerguntaUm)

        btnTelaPerguntaUm.setOnClickListener {
            val intent = Intent(this, PerguntasFinaisActivity::class.java)
            val problema = txtPerguntaUm.text.toString()
            if (problema != "" && problema.length > 5) {
                intent.putExtra("problema", problema)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Digite um problema.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}