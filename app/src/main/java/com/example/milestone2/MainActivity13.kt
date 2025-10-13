package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.wear.compose.material.Button
import android.widget.CheckBox
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main13)
        // 6-monnth courses
        val FirstAid = findViewById<CheckBox>(R.id.checkBox)
        val Landscaping = findViewById<CheckBox>(R.id.checkBox6)
        val Sewing = findViewById<CheckBox>(R.id.checkBox5)
        val Lifeskills = findViewById<CheckBox>(R.id.checkBox7)

        // 6 week courses
        val ChildMinding = findViewById<CheckBox>(R.id.checkBox2)
        val Cooking = findViewById<CheckBox>(R.id.checkBox3)
        val GardenMaintainence = findViewById<CheckBox>(R.id.checkBox4)

        val next = findViewById<Button>(R.id.button18)
        next.setOnClickListener {
            val selectedCourses = ArrayList<String>()

            if (FirstAid.isChecked) selectedCourses.add("Course 1 - 6 Months")
            if (Landscaping.isChecked) selectedCourses.add("Course 2 - 6 Months")
            if (Sewing.isChecked) selectedCourses.add("Course 3 - 6 Months")
            if (Lifeskills.isChecked) selectedCourses.add("Course 4 - 6 Months")
            if (ChildMinding.isChecked) selectedCourses.add("Course 1 - 6 Weeks")
            if (Cooking.isChecked) selectedCourses.add("Course 2 - 6 Weeks")
            if (GardenMaintainence.isChecked) selectedCourses.add("Course 3 - 6 Weeks")

            val intent = Intent(this, MainActivity16::class.java)
            intent.putStringArrayListExtra("selectedCourses", selectedCourses)
            startActivity(intent)



        }

    }
}