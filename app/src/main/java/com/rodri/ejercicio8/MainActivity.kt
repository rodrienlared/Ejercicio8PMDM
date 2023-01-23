package com.rodri.ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rodri.ejercicio8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imagen.setBackgroundResource(R.drawable.inicio)

        binding.elfoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.elfo)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.humanoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.humano)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.enanoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.enano)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.goblinBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.goblin)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.aceptarBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}