package com.example.prova_mobile

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class RelatorioActivity : AppCompatActivity() {

    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        txtResultado = findViewById(R.id.txtResultado)

        val linha = intent.getStringExtra("linha") ?: ""
        val operador = intent.getStringExtra("operador") ?: ""
        val contador = intent.getIntExtra("contador", 0)
        val tempoTotal = intent.getLongExtra("tempoTotal", 0)
        val taktTime = intent.getDoubleExtra("taktTime", 0.0)

        val minutos = tempoTotal / 1000 / 60
        val segundos = (tempoTotal / 1000) % 60
    }
}