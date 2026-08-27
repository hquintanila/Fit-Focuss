package com.example.diseofitfocuss

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class RoutinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routines)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val bottomNav = findViewById<LinearLayout>(R.id.bottomNav)

        bottomNav.findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        bottomNav.findViewById<LinearLayout>(R.id.navRutina).setOnClickListener {
            // Ya estás en RoutinesActivity
        }

        bottomNav.findViewById<LinearLayout>(R.id.navCalendario).setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
            finish()
        }

        bottomNav.findViewById<LinearLayout>(R.id.navPerfil).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}