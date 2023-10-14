package com.example.ejercicio_12_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonApretado = findViewById<Button>(R.id.button)

        botonApretado.setOnClickListener{
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }
    }

}