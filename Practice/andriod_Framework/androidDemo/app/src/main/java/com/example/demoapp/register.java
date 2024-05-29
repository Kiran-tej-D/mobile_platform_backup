package com.example.demoapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button btn;
        btn = findViewById(R.id.butnL);
        //btn.setOnClickListener(this);
        //startActivity(new Intent(MainActivity.this, home.class));
        btn.setOnClickListener(e ->startActivity(new Intent(register.this, MainActivity.class)));
    }

    @Override
    public void onClick(View v) {

    }
}
