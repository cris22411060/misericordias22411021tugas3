package com.example.loginpage  // Pastikan sesuai dengan package kamu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity_Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register) // Ganti dengan nama file layout kamu

        val etEmail = findViewById<EditText>(R.id.etRegisterEmail)
        val etPassword = findViewById<EditText>(R.id.etRegisterPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            // Di sini kamu bisa tambahkan validasi atau simpan ke database

            // Contoh intent ke halaman login setelah register
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // supaya halaman register tidak bisa dikembaliin dengan tombol back
        }
    }
}
