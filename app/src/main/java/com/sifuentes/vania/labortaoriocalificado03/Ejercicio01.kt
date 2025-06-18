package com.sifuentes.vania.labortaoriocalificado03

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope

class Ejercicio01 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TeacherAdapter
    private lateinit var teachers: List<Teacher>
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        progressBar = findViewById(R.id.progressBar)
        progressBar.visibility = View.VISIBLE

        // Llamada a la API
        lifecycleScope.launch {
            try {
                val response = RetrofitInstance.api.getTeachers()
                if (response.isSuccessful) {
                    teachers = response.body()?.teachers ?: emptyList()
                    adapter = TeacherAdapter(teachers) { teacher ->
                        // Acción al hacer clic: Llamar al número del profesor
                        val intent = Intent(Intent.ACTION_DIAL).apply {
                            data = Uri.parse("tel:${teacher.phone}")
                        }
                        startActivity(intent)
                    }
                    recyclerView.adapter = adapter
                } else {
                    // Manejar error de la respuesta
                    Toast.makeText(this@Ejercicio01, "Error en la respuesta", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                // Manejar error de red
                Toast.makeText(this@Ejercicio01, "Error de conexión: ${e.message}", Toast.LENGTH_SHORT).show()
            } finally {
                // Ocultar el ProgressBar cuando termine la carga
                progressBar.visibility = View.GONE
            }
        }
    }
}
