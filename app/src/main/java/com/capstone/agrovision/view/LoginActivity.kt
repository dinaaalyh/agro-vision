package com.capstone.agrovision.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.capstone.agrovision.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.loginButton) // Initialize the login button
        val btnSignUp = findViewById<Button>(R.id.signupTab)

        btnLogin.setOnClickListener {
            // Logika untuk memeriksa kredensial pengguna
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}