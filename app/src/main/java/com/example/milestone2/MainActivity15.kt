package com.example.milestone2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import android.view.View
import android.widget.Toast

class MainActivity15 : AppCompatActivity() {
    private lateinit var btnRosebank: Button
    private lateinit var btnSandton: Button
    private lateinit var btnAlberton: Button
    private lateinit var btnNext: Button
    private lateinit var btnReturn: Button
    private lateinit var tvSelectedDetails: TextView

    private var selectedCampusName: String? = null
    private var selectedCampusAddress: String? = null
    private var selectedCampusPhone: String? = null
    private var selectedCampusEmail: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main15)

                btnRosebank = findViewById(R.id.btnRosebank)
                btnSandton = findViewById(R.id.btnSandton)
                btnAlberton = findViewById(R.id.btnAlberton)
                btnNext = findViewById(R.id.buttonNext)
                btnReturn = findViewById(R.id.buttonReturn)
                tvSelectedDetails = findViewById(R.id.tvSelectedCampusDetails)

                btnRosebank.setOnClickListener {
                    selectedCampusName = "Rosebank Campus"
                    selectedCampusAddress = "20 Main Rd, Rosebank, Cape Town, 7700"
                    selectedCampusPhone = "+27 01 657 8878"
                    selectedCampusEmail = "info@empoweringthenation.co.za"
                    showCampusDetails()
                }

                btnSandton.setOnClickListener {
                    selectedCampusName = "Sandton Campus"
                    selectedCampusAddress = "207 Bree St, Cape Town City Centre, Cape Town, 8000"
                    selectedCampusPhone = "+27 01 657 8878"
                    selectedCampusEmail = "info@empoweringthenation.co.za"
                    showCampusDetails()
                }

                btnAlberton.setOnClickListener {
                    selectedCampusName = "Alberton Campus"
                    selectedCampusAddress = "25 Lake Arthur St, Brackendowns, Alberton, 1448"
                    selectedCampusPhone = "+27 01 657 8878"
                    selectedCampusEmail = "info@empoweringthenation.co.za"
                    showCampusDetails()
                }

                btnNext.setOnClickListener {
                    if (selectedCampusName == null) {
                        Toast.makeText(this, "Please select a campus", Toast.LENGTH_SHORT).show()
                    } else {
                        val intent = Intent(this, MainActivity16::class.java)
                        intent.putExtra("CAMPUS_NAME", selectedCampusName)
                        intent.putExtra("CAMPUS_ADDRESS", selectedCampusAddress)
                        intent.putExtra("CAMPUS_PHONE", selectedCampusPhone)
                        intent.putExtra("CAMPUS_EMAIL", selectedCampusEmail)
                        startActivity(intent)
                    }
                }

                btnReturn.setOnClickListener {
                    finish() // go back to previous page
                }
            }

            private fun showCampusDetails() {
                tvSelectedDetails.text = """
            ✅ Selected: $selectedCampusName
            
            📍 Address: $selectedCampusAddress
            ☎ Phone: $selectedCampusPhone
            ✉ Email: $selectedCampusEmail
        """.trimIndent()
                tvSelectedDetails.visibility = View.VISIBLE
            }
        }
