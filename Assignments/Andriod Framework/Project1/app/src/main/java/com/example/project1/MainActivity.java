package com.example.project1;

import static com.example.project1.R.*;
import com.example.project1.R;
import com.example.project1.R.id;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btnR;
    EditText name, pass;
    private android.widget.Toast Toast;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layout.activity_main);
        btn = findViewById(id.butn1);
        btnR = findViewById(id.butnR);
        btn.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnR.setOnClickListener(e ->startActivity(new Intent(MainActivity.this, register.class)));
        name = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

    }
    //    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if(view == btn) {
            String nt = name.getText().toString();
            String pt = pass.getText().toString();

            if(nt.equals("kiran") && pt.equals("123")) {
                // logged in successfully
                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        }
    }
}