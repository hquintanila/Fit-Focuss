package com.example.diseofitfocuss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val tvGoToRegister = findViewById<TextView>(R.id.tvGoToRegister)

        btnEntrar.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty()) {
                etEmail.error = "Ingresa tu Correo o Usuario"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Ingresa tu contraseña"
                return@setOnClickListener
            }

            // Validación hardcodeada: Contraseña clave "123"
            if (password == "123") {
                Toast.makeText(this, "¡Inicio de Sesión Exitoso!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                etPassword.error = "Contraseña incorrecta (Usa: 123)"
                Toast.makeText(this, "Credencial Inválida. La clave es 123", Toast.LENGTH_SHORT).show()
            }
        }

        // Ir a Registro cerrando la vista actual de Login
        tvGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
