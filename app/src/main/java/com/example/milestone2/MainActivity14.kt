package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main14)
    // declarations
        val nameEt = findViewById<EditText>(R.id.editTextText4)
        val mobileEt = findViewById<EditText>(R.id.editTextText5)
        val emailEt = findViewById<EditText>(R.id.editTextText6)
        val submitBtn = findViewById<Button>(R.id.button15)
        val returnBtn = findViewById<Button>(R.id.button14)

        returnBtn.setOnClickListener {
            finish() // goes back to previous activity
        }
        // save contact details to shared preferences
        submitBtn.setOnClickListener {
            val name = nameEt.text.toString().trim()
            val mobile = mobileEt.text.toString().trim()
            val email = emailEt.text.toString().trim()

            if (name.isEmpty() || mobile.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        // save contact details to shared preferences
            val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("NAME", name)
            editor.putString("MOBILE", mobile)
            editor.putString("EMAIL", email)
            editor.apply()

            Toast.makeText(this, "Contact saved", Toast.LENGTH_SHORT).show()

            // go to campus selection (page 15)
            startActivity(Intent(this, MainActivity15::class.java))
        }
    }
}