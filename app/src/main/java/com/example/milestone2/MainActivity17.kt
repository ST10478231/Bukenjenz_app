package com.example.milestone2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main17)
        val Return = findViewById<Button>(R.id.btnReturn)
        val Finish = findViewById<Button>(R.id.btnFinish)

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtMobile = findViewById<TextView>(R.id.txtMobile)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val txtCourse = findViewById<TextView>(R.id.txtCourse)
        val txtTotalFee = findViewById<TextView>(R.id.txtTotalFee)
        val txtCampus = findViewById<TextView>(R.id.txtCampus)
        val txtCampusAddress = findViewById<TextView>(R.id.txtCampusAddress)
        val txtCampusContact = findViewById<TextView>(R.id.txtCampusContact)

        val name = intent.getStringExtra("name")
        val mobile = intent.getStringExtra("mobile")
        val email = intent.getStringExtra("email")
        val course = intent.getStringExtra("course")
        val totalFee = intent.getStringExtra("totalFee")
        val campus = intent.getStringExtra("campus")
        val campusAddress = intent.getStringExtra("campusAddress")
        val campusContact = intent.getStringExtra("campusContact")

        txtName.text = "Name: $name"
        txtMobile.text = "Mobile: $mobile"
        txtEmail.text = "Email: $email"
        txtCourse.text = "Course name/names: $course"
        txtTotalFee.text = "Total Fee: $totalFee"
        txtCampus.text = "Campus: $campus"
        txtCampusAddress.text = "Address: $campusAddress"
        txtCampusContact.text = "Contact: $campusContact"

        Return.setOnClickListener {
            finish()
        }

        Finish.setOnClickListener {
            finish()
        }

    }
}