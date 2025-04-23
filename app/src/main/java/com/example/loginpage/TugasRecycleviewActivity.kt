package com.example.loginpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TugasRecycleviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_recycleview)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            TugasItem("Andre", "Mahasiswa Teknik", R.drawable.ic_launcher_foreground),
            TugasItem("Jimi", "Mahasiswa Sistem Informasi", R.drawable.ic_launcher_foreground),
            TugasItem("Dede", "Mahasiswa Informatika", R.drawable.ic_launcher_foreground),
            TugasItem("Pablo", "Mahasiswa Komputer", R.drawable.ic_launcher_foreground)
        )

        val adapter = TugasAdapter(items)
        recyclerView.adapter = adapter
    }
}
