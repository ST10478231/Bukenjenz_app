package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    private lateinit var Return : Button
    private lateinit var FirstAid : Button
    private lateinit var Sewing : Button
    private lateinit var Landscaping : Button
    private lateinit var LifeSkills : Button
    private lateinit var next : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        Return = findViewById(R.id.button3)
        FirstAid = findViewById(R.id.button4)
        Sewing = findViewById(R.id.button5)
        Landscaping = findViewById(R.id.button8)
        LifeSkills = findViewById(R.id.button9)
        next = findViewById(R.id.buttonNext)

        FirstAid.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        Sewing.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        Landscaping.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
        LifeSkills.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        Return.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        next.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }



    }
}