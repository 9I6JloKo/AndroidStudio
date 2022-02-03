package com.example.powel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = findViewById(R.id.knopka2);
        button2 = findViewById(R.id.knopka3);
        Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        button1.setOnClickListener(v -> {
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}