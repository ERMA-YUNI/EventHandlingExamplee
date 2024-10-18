package com.example.ermayuni.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ermayuni.eventhandlingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext, "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}