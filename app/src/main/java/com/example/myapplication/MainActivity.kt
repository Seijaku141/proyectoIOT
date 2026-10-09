package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val correo = intent.getStringExtra("correo")
        findViewById<TextView>(R.id.tvBienvenida).text = "Bienvenido\n$correo"

        findViewById<Button>(R.id.btnSalir).setOnClickListener {
            startActivity(Intent(this, loginactivity::class.java))
            finish()
        }
    }
}