package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity11 : AppCompatActivity() {
    private lateinit var Return : Button
    private lateinit var next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main11)

        // declare buttons
        Return = findViewById(R.id.button10)
        next = findViewById(R.id.Button13)

        // Set click listeners
        Return.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        next.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

    }
}