package com.example.smarthome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.password)
        val btn = findViewById<Button>(R.id.button)
        val btn1 = findViewById<Button>(R.id.register)

        btn1.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        btn.setOnClickListener() {
            val user = email.text.toString()
            val pin = pass.text.toString()

            if(user == "kiran" && pin == "123"){
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, DashActivity::class.java))
                finish()
            } else {
                Toast.makeText(this@MainActivity, "Invalid Credentails..!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}