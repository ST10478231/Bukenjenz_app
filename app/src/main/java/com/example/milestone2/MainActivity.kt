package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // declarations contain the businesses mission, details and about us
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val detailsText = findViewById<TextView>(R.id.detailsText)
        val aboutUsTitle = findViewById<TextView>(R.id.aboutUsTitle)
        val aboutUsText = findViewById<TextView>(R.id.aboutUsText)
        val discoverTitle = findViewById<TextView>(R.id.discoverTitle)
        val discoverText = findViewById<TextView>(R.id.discoverText)
        val discount1 = findViewById<TextView>(R.id.discount1)
        val discount2 = findViewById<TextView>(R.id.discount2)
        val discount3 = findViewById<TextView>(R.id.discount3)
        val discount4 = findViewById<TextView>(R.id.discount4)
        val startButton = findViewById<Button>(R.id.startButton)

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}