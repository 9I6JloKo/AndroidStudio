package com.example.powel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1 = findViewById(R.id.knopka4);
        button2 = findViewById(R.id.knopka5);
        imageView1 = findViewById(R.id.android);
        Intent intent2 = new Intent(MainActivity3.this, MainActivity2.class);
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        button1.setOnClickListener(v -> {
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}