package com.example.insuranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, Rbtn;
    EditText name, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.loginbtn);
        btn.setOnClickListener(this);

        Rbtn = findViewById(R.id.registerbtn);
        Rbtn.setOnClickListener(this);
        Rbtn.setOnClickListener(e ->startActivity(new Intent(MainActivity.this, Register.class)));

        name = findViewById(R.id.email);
        pass = findViewById(R.id.pass);


    }

    @Override
    public void onClick(View view) {
        if(view == btn) {
            String nt = name.getText().toString();
            String pt = pass.getText().toString();

            if(nt.equals("kiran") && pt.equals("123")) {
                // logged in successfully
                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this, Request.class));// Navigate to a new Page
            } else {
                Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        }

    }
}