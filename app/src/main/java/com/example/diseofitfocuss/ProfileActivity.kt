package com.example.diseofitfocuss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnEditProfile = findViewById<LinearLayout>(R.id.btnEditProfile)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        btnEditProfile.setOnClickListener {
            Toast.makeText(this, "Editar Perfil", Toast.LENGTH_SHORT).show()
        }

        // Cierre de sesión y retorno a Login
        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
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
            Toast.makeText(this, "Sección de Rutinas", Toast.LENGTH_SHORT).show()
        }

        // CALENDARIO
        bottomNav.findViewById<LinearLayout>(R.id.navCalendario).setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
            finish()
        }

        // PERFIL
        bottomNav.findViewById<LinearLayout>(R.id.navPerfil).setOnClickListener {
            // Ya estás en ProfileActivity
        }
    }
}