package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main16)
    // declarations
        val tvSelectedCourses = findViewById<TextView>(R.id.textView25) //
        val tvDiscount = findViewById<TextView>(R.id.discount)
        val btnCalculate = findViewById<Button>(R.id.button20)
        val btnReturn = findViewById<Button>(R.id.button19)
        val btnNext = findViewById<Button>(R.id.button21)

    // retrieve data from shared preferences
        val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
        val coursesString = sharedPref.getString("COURSES", "")

        if (coursesString.isNullOrEmpty()) {
            tvSelectedCourses.text = "No courses selected"
        } else {
            tvSelectedCourses.text = "Selected Courses:\n" + coursesString.replace(",", "\n")
        }
    // calculate discount based on course count
        btnCalculate.setOnClickListener {
            val count = if (coursesString.isNullOrEmpty()) 0 else coursesString.split(",").size
            val discount = when (count) {
                0 -> 0
                1 -> 0
                2 -> 10
                else -> 15
            }
    // save discount to shared preferences
            val editor = sharedPref.edit()
            editor.putInt("DISCOUNT", discount)
            editor.putString("COURSES", coursesString ?: "")
            editor.apply()

            tvDiscount.text = "You have a discount of $discount%."
            Toast.makeText(this, "Discount saved", Toast.LENGTH_SHORT).show()
        }

        btnReturn.setOnClickListener {
            finish()
        }

        btnNext.setOnClickListener {
            // go to summary page
            startActivity(Intent(this, MainActivity17::class.java))
        }
    }
}