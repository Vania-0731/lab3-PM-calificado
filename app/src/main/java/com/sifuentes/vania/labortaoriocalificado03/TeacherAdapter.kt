package com.sifuentes.vania.labortaoriocalificado03

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sifuentes.vania.labortaoriocalificado03.databinding.ItemTeacherBinding

class TeacherAdapter(private val teachers: List<Teacher>, private val onClick: (Teacher) -> Unit) : RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val binding = ItemTeacherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeacherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val teacher = teachers[position]
        holder.bind(teacher, onClick)
    }
    override fun getItemCount(): Int = teachers.size
    class TeacherViewHolder(private val binding: ItemTeacherBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(teacher: Teacher, onClick: (Teacher) -> Unit) {
            binding.name.text = "${teacher.name} ${teacher.last_name}"

            Glide.with(itemView.context)
                .load(teacher.imageUrl)
                .into(binding.imageView)

            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:${teacher.phone}")
                }
                itemView.context.startActivity(intent)
            }

            itemView.setOnLongClickListener {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:${teacher.email}")
                    putExtra(Intent.EXTRA_SUBJECT, "Consulta sobre la clase")
                }
                itemView.context.startActivity(intent)
                return@setOnLongClickListener true
            }
        }
    }
}
