package com.example.milestone2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main13)

        // 6 month courses
        val firstAid = findViewById<CheckBox>(R.id.checkBox)
        val landscaping = findViewById<CheckBox>(R.id.checkBox6)
        val sewing = findViewById<CheckBox>(R.id.checkBox5)
        val lifeSkills = findViewById<CheckBox>(R.id.checkBox7)

        // 6 week courses
        val childMinding = findViewById<CheckBox>(R.id.checkBox2)
        val cooking = findViewById<CheckBox>(R.id.checkBox3)
        val gardenMaintenance = findViewById<CheckBox>(R.id.checkBox4)

        val btnReturn = findViewById<Button>(R.id.button13)
        val btnNext = findViewById<Button>(R.id.button18)

        btnReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
            // save selected courses to shared preferences
        btnNext.setOnClickListener {
            val selected = mutableListOf<String>()
            if (firstAid.isChecked) selected.add("First Aid - 6 Months")
            if (landscaping.isChecked) selected.add("Landscaping - 6 Months")
            if (sewing.isChecked) selected.add("Sewing - 6 Months")
            if (lifeSkills.isChecked) selected.add("Life Skills - 6 Months")
            if (childMinding.isChecked) selected.add("Child Minding - 6 Weeks")
            if (cooking.isChecked) selected.add("Cooking - 6 Weeks")
            if (gardenMaintenance.isChecked) selected.add("Garden Maintenance - 6 Weeks")

            // check if at least one course is selected
            if (selected.isEmpty()) {
                Toast.makeText(this, "Please select at least one course", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // save selected courses to shared preferences
            val coursesString = selected.joinToString(",")
            val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("COURSES", coursesString)
            editor.apply()

            Toast.makeText(this, "Courses saved", Toast.LENGTH_SHORT).show()

            // move to contact form (page 14)
            startActivity(Intent(this, MainActivity14::class.java))
        }
    }
}