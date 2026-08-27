package com.example.diseofitfocuss

import android.os.Bundle
import android.content.Intent
import android.widget.CalendarView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


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

        // Navegación Inferior
        findViewById<LinearLayout>(R.id.bottomNav).apply {
            findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
                startActivity(Intent(this@CalendarActivity, MainActivity::class.java))
                finish()
            }
        }
    }
}