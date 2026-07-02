package com.example.prova_mobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class RelatorioActivity : AppCompatActivity() {

    private lateinit var txtResultado: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        txtResultado = findViewById(R.id.txtResultado)
        btnVoltar = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }

        val linha = intent.getStringExtra("linha") ?: ""
        val operador = intent.getStringExtra("operador") ?: ""
        val contador = intent.getIntExtra("contador", 0)
        val tempoTotal = intent.getLongExtra("tempoTotal", 0)
        val taktTime = intent.getDoubleExtra("taktTime", 0.0)

        val minutos = tempoTotal / 1000 / 60
        val segundos = (tempoTotal / 1000) % 60

        val relatorio = """
            RELATÓRIO ESTATÍSTICO OEE
            
            Linha:
            ${linha.uppercase()}
            
            Operador:
            ${operador.uppercase()}
            
            Quantidade de peças:
            $contador
            
            Tempo Total:
            ${minutos} min ${segundos} s
            
            Takt Time:
            ${String.format(Locale.US, "%.2f", taktTime)} segundos/peça
        """.trimIndent()

        txtResultado.text = relatorio
    }
}