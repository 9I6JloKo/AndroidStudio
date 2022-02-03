package com.example.powel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button1 = findViewById(R.id.knopka6);
        button2 = findViewById(R.id.knopka7);
        image1 = findViewById(R.id.android2);
        Intent intent2 = new Intent(MainActivity4.this, MainActivity3.class);
        Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
        button1.setOnClickListener(v -> {
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}