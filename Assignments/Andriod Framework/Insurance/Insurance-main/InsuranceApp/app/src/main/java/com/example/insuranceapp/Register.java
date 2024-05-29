package com.example.insuranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Register extends AppCompatActivity implements View.OnClickListener  {

    Button butn1,butn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        butn1 = findViewById(R.id.loginbackbtn);
        butn1.setOnClickListener(this);
        butn1.setOnClickListener(e ->startActivity(new Intent(Register.this, MainActivity.class)));

    }

    @Override
    public void onClick(View view) {

    }
}