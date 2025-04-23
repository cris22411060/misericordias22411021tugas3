package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.Activity_Register
import com.example.loginpage.ResetPassword
import com.example.loginpage.Dashboard  // Pastikan ini ada dan sesuai

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Sesuaikan dengan nama XML kamu

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvRegister = findViewById<TextView>(R.id.tvRegister)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        btnLogin.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)  // Perbaiki sesuai nama kelas
            startActivity(intent)
        }

        tvRegister.setOnClickListener {
            val intent = Intent(this, Activity_Register::class.java)
            startActivity(intent)
        }

        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, ResetPassword::class.java)
            startActivity(intent)
        }
    }
}
