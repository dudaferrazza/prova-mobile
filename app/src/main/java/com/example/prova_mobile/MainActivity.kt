package com.example.prova_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtLinha: EditText
    private lateinit var edtOperador: EditText
    private lateinit var txtContador: TextView
    private lateinit var btnIniciar: Button
    private lateinit var btnRegistrar: Button
    private lateinit var btnFinalizar: Button

    private var contador = 0
    private var inicio = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLinha = findViewById(R.id.edtLinha)
        edtOperador = findViewById(R.id.edtOperador)
        txtContador = findViewById(R.id.txtContador)
        btnIniciar = findViewById(R.id.btnIniciar)
        btnRegistrar = findViewById(R.id.btnRegistrar)
        btnFinalizar = findViewById(R.id.btnFinalizar)

        btnRegistrar.isEnabled = false
    }
}