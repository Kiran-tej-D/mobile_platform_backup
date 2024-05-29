package com.example.smarthome

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val btn1 = findViewById<Button>(R.id.register2)
        val btn2 = findViewById<Button>(R.id.login)

        btn1.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Register Successful", Toast.LENGTH_LONG).show()
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}