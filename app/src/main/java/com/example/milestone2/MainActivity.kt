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

class MainActivity : AppCompatActivity() {
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var login : Button
    lateinit var signup : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        username = findViewById (R.id.editTextText)
        password = findViewById(R.id.editTextText2)
        login = findViewById(R.id.button)
        signup = findViewById(R.id.button2)

        login.setOnClickListener {
            val usernameLogin = username.text.toString()
            val passwordLogin = password.text.toString()

            if (usernameLogin.isEmpty() || passwordLogin.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                username.text.clear()
                password.text.clear()

            }
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


        }

    }
}