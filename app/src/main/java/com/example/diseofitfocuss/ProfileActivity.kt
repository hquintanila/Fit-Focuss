package com.example.diseofitfocuss

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


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

        // Navegación Inferior
        findViewById<LinearLayout>(R.id.bottomNav).apply {
            findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
                startActivity(Intent(this@ProfileActivity, MainActivity::class.java))
                finish()
            }
        }
    }
}