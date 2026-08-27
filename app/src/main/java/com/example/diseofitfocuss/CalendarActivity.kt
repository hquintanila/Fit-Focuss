package com.example.diseofitfocuss

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        // Evento al seleccionar fecha en el calendario
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Fecha seleccionada: $selectedDate", Toast.LENGTH_SHORT).show()
        }

        // Configurar la navegación inferior completa
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val bottomNav = findViewById<LinearLayout>(R.id.bottomNav)

        // HOME
        bottomNav.findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // RUTINA
        bottomNav.findViewById<LinearLayout>(R.id.navRutina).setOnClickListener {
            startActivity(Intent(this, RoutinesActivity::class.java))
            finish()
        }

        // CALENDARIO
        bottomNav.findViewById<LinearLayout>(R.id.navCalendario).setOnClickListener {
        }

        // PERFIL
        bottomNav.findViewById<LinearLayout>(R.id.navPerfil).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}