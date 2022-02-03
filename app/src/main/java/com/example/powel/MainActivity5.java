package com.example.powel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button1 = findViewById(R.id.knopka8);
        button2 = findViewById(R.id.knopka9);
        image1 = findViewById(R.id.android3);
        Intent intent2 = new Intent(MainActivity5.this, MainActivity4.class);
        Intent intent = new Intent(MainActivity5.this, MainActivity.class);
        button1.setOnClickListener(v -> {
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}