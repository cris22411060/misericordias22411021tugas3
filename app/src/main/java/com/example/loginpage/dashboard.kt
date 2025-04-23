package com.example.loginpage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {
            val nomorWA = "6281234567890"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$nomorWA")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, TugasRecycleviewActivity::class.java)
            startActivity(intent)
        }
    }
}
