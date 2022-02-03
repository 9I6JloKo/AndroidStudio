package com.example.powel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.knopka);
        button2 = findViewById(R.id.knopka1);
        image1 = findViewById(R.id.guitar);
        Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        button1.setOnClickListener(v -> {
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}