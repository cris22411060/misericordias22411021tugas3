package com.example.loginpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class TugasAdapter(private val items: List<TugasItem>) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {

    inner class TugasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgFoto: ImageView = itemView.findViewById(R.id.imgFoto)
        val tvNama: TextView = itemView.findViewById(R.id.tvNama)
        val tvDeskripsi: TextView = itemView.findViewById(R.id.tvDeskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TugasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tugas, parent, false)
        return TugasViewHolder(view)
    }

    override fun onBindViewHolder(holder: TugasViewHolder, position: Int) {
        val item = items[position]
        holder.imgFoto.setImageResource(item.fotoResId)
        holder.tvNama.text = item.nama
        holder.tvDeskripsi.text = item.deskripsi
    }

    override fun getItemCount(): Int = items.size
}
