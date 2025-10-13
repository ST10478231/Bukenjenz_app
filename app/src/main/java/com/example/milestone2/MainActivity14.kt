package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText

class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main14)

        val name = findViewById<EditText>(R.id.editTextText4)
        val mobile = findViewById<EditText>(R.id.editTextText5)
        val email = findViewById<EditText>(R.id.editTextText6)
        val submit = findViewById<Button>(R.id.button15)

        val returnButton = findViewById<Button>(R.id.button14)
        returnButton.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        submit.setOnClickListener {
            val nameText = name.text.toString()
            val mobileText = mobile.text.toString()
            val emailText = email.text.toString()

            val intent = Intent(this, MainActivity17::class.java)
            intent.putExtra("name", nameText)
            intent.putExtra("mobile", mobileText)
            intent.putExtra("email", emailText)
            startActivity(intent)
        }
    }
}