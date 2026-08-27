package com.example.diseofitfocuss

import android.content.Intent
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

        // 1. EVENTOS DE LAS TARJETAS DEL DASHBOARD
        btnStartWorkout.setOnClickListener {
            Toast.makeText(this, "Iniciando Entrenamiento...", Toast.LENGTH_SHORT).show()
        }

        cardCalendar.setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }

        cardRoutines.setOnClickListener {
            startActivity(Intent(this, RoutinesActivity::class.java))
        }

        cardHistory.setOnClickListener {
            Toast.makeText(this, "Abriendo Historial de Entrenamientos", Toast.LENGTH_SHORT).show()
        }

        // 2. EVENTOS DE LA BARRA DE NAVEGACIÓN INFERIOR
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val bottomNav = findViewById<LinearLayout>(R.id.bottomNav)

        // HOME
        bottomNav.findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
        }

        // RUTINA
        bottomNav.findViewById<LinearLayout>(R.id.navRutina).setOnClickListener {
            startActivity(Intent(this, RoutinesActivity::class.java))
        }

        // CALENDARIO
        bottomNav.findViewById<LinearLayout>(R.id.navCalendario).setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }

        // PERFIL
        bottomNav.findViewById<LinearLayout>(R.id.navPerfil).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
