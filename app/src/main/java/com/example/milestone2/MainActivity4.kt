package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    private lateinit var button3 : Button
    private lateinit var textView3 : TextView
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button8 : Button

    private lateinit var next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        button3 = findViewById(R.id.Return)
        textView3 = findViewById(R.id.textView3)
        button4 = findViewById(R.id.ChildMinding)
        button5 = findViewById(R.id.Cooking)
        button8 = findViewById(R.id.Garden)
        next = findViewById(R.id.ButtonNext)

        button3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        next.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }




    }
}