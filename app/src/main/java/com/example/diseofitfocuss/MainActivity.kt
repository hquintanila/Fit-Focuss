package com.example.diseofitfocuss

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartWorkout = findViewById<Button>(R.id.btnStartWorkout)
        val cardCalendar = findViewById<LinearLayout>(R.id.cardCalendar)
        val cardRoutines = findViewById<LinearLayout>(R.id.cardRoutines)
        val cardHistory = findViewById<LinearLayout>(R.id.cardHistory)

        btnStartWorkout.setOnClickListener {
            Toast.makeText(this, "Iniciando Entrenamiento...", Toast.LENGTH_SHORT).show()
        }

        cardCalendar.setOnClickListener {
            Toast.makeText(this, "Abriendo Calendario", Toast.LENGTH_SHORT).show()
        }

        cardRoutines.setOnClickListener {
            Toast.makeText(this, "Abriendo Gestión de Rutinas", Toast.LENGTH_SHORT).show()
        }

        cardHistory.setOnClickListener {
            Toast.makeText(this, "Abriendo Historial de Entrenamientos", Toast.LENGTH_SHORT).show()
        }
    }
}

