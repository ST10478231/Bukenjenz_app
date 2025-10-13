package com.example.milestone2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main16)

        // Get references to the TextViews and Button
        val selectedCoursesTextView = findViewById<TextView>(R.id.textView25)
        val discountTextView = findViewById<TextView>(R.id.discount)
        val calculateButton = findViewById<Button>(R.id.button20)

        // Receive the list of selected courses from Page 13
        val selectedCourses = intent.getStringArrayListExtra("selectedCourses") ?: arrayListOf()

        // Display the selected courses
        if (selectedCourses.isEmpty()) {
            selectedCoursesTextView.text = "No courses selected"
        } else {
            selectedCoursesTextView.text =
                "Selected Courses:\n" + selectedCourses.joinToString("\n")
        }

        // When the user clicks the Calculate button
        calculateButton.setOnClickListener {
            val courseCount = selectedCourses.size

            // Calculate discount based on number of courses
            val discountPercentage = when (courseCount) {
                1 -> 0
                2 -> 10
                3 -> 15
                else -> 20
            }

            // Show the discount in the TextView
            discountTextView.text = "You have a discount of $discountPercentage%."
        }
    }
}