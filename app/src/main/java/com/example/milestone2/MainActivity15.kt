package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity15 : AppCompatActivity() {

    private var selectedCampusName: String? = null
    private var selectedCampusAddress: String? = null
    private var selectedCampusPhone: String? = null
    private var selectedCampusEmail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main15)
    // Declarations
        val btnRosebank = findViewById<Button>(R.id.btnRosebank)
        val btnSandton = findViewById<Button>(R.id.btnSandton)
        val btnAlberton = findViewById<Button>(R.id.btnAlberton)
        val btnNext = findViewById<Button>(R.id.buttonNext)
        val btnReturn = findViewById<Button>(R.id.buttonReturn)
        val tvSelected = findViewById<TextView>(R.id.tvSelectedCampusDetails)

    // Set click listeners for campus buttons

        btnRosebank.setOnClickListener {
            selectedCampusName = "Rosebank Campus"
            selectedCampusAddress = "20 Main Rd, Rosebank, Cape Town, 7700"
            selectedCampusPhone = "+27 01 657 8878"
            selectedCampusEmail = "info@empoweringthenation.co.za"
            showCampusDetails(tvSelected)
        }

        btnSandton.setOnClickListener {
            selectedCampusName = "Sandton Campus"
            selectedCampusAddress = "207 Bree St, Cape Town City Centre, Cape Town, 8000"
            selectedCampusPhone = "+27 01 657 8878"
            selectedCampusEmail = "info@empoweringthenation.co.za"
            showCampusDetails(tvSelected)
        }

        btnAlberton.setOnClickListener {
            selectedCampusName = "Alberton Campus"
            selectedCampusAddress = "25 Lake Arthur St, Brackendowns, Alberton, 1448"
            selectedCampusPhone = "+27 01 657 8878"
            selectedCampusEmail = "info@empoweringthenation.co.za"
            showCampusDetails(tvSelected)
        }
        // Set click listener for Next button
        btnNext.setOnClickListener {
            if (selectedCampusName == null) {
                Toast.makeText(this, "Please select a campus", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Save selected campus to shared preferences
            val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("CAMPUS_NAME", selectedCampusName)
            editor.putString("CAMPUS_ADDRESS", selectedCampusAddress)
            editor.putString("CAMPUS_CONTACT", selectedCampusPhone)
            editor.putString("CAMPUS_EMAIL", selectedCampusEmail)
            editor.apply()

            Toast.makeText(this, "Campus saved", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, MainActivity16::class.java))
        }

        btnReturn.setOnClickListener {
            finish()
        }
    }
    // Function to show campus details
    private fun showCampusDetails(tv: TextView) {
        tv.visibility = View.VISIBLE // Show the TextView
        tv.text = """ 
            ✅ Selected: $selectedCampusName

            📍 Address: $selectedCampusAddress 
            ☎ Phone: $selectedCampusPhone
            ✉ Email: $selectedCampusEmail
        """.trimIndent()
    }
}