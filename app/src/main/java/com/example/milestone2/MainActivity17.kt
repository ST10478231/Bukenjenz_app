package com.example.milestone2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main17)
    // button declarations
        val returnBtn = findViewById<Button>(R.id.btnReturn)
        val finishBtn = findViewById<Button>(R.id.btnFinish)
    // text view declarations
        val txtName = findViewById<TextView>(R.id.txtName)
        val txtMobile = findViewById<TextView>(R.id.txtMobile)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val txtCourse = findViewById<TextView>(R.id.txtCourse)
        val txtTotalFee = findViewById<TextView>(R.id.txtTotalFee)
        val txtCampus = findViewById<TextView>(R.id.txtCampus)
        val txtCampusAddress = findViewById<TextView>(R.id.txtCampusAddress)
        val txtCampusContact = findViewById<TextView>(R.id.txtCampusContact)

        // retrieve data from shared preferences
        val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
        val name = sharedPref.getString("NAME", "N/A")
        val mobile = sharedPref.getString("MOBILE", "N/A")
        val email = sharedPref.getString("EMAIL", "N/A")
        val coursesString = sharedPref.getString("COURSES", "None Selected")
        val campus = sharedPref.getString("CAMPUS_NAME", "N/A")
        val campusAddress = sharedPref.getString("CAMPUS_ADDRESS", "N/A")
        val campusContact = sharedPref.getString("CAMPUS_CONTACT", "N/A")
        val discount = sharedPref.getInt("DISCOUNT", 0)

        // fee calculation (adjust feePerCourse to your real amount)
        val courseCount = if (coursesString == "None Selected" || coursesString.isNullOrEmpty()) 0
        else coursesString.split(",").size
        val feePerCourse = 1000
        val totalBeforeDiscount = courseCount * feePerCourse
        val totalAfterDiscount = totalBeforeDiscount - (totalBeforeDiscount * discount / 100)
    // display data
        txtName.text = "Name: $name"
        txtMobile.text = "Mobile: $mobile"
        txtEmail.text = "Email: $email"
        txtCourse.text = "Courses: ${if (coursesString.isNullOrEmpty()) "None Selected" else coursesString.replace(",", "\n")}"
        txtTotalFee.text = "Total Fee: R $totalAfterDiscount (Discount: $discount%)"
        txtCampus.text = "Campus: $campus"
        txtCampusAddress.text = "Address: $campusAddress"
        txtCampusContact.text = "Contact: $campusContact"

        returnBtn.setOnClickListener {
            finish()
        }

        finishBtn.setOnClickListener {
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()
            finishAffinity() // closes app (all activities)
        }
    }
}