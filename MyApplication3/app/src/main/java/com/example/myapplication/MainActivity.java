package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        EditText text1 = findViewById(R.id.text1);
        EditText text2 = findViewById(R.id.text2);
        Button button = findViewById(R.id.button);
        TextView fatma = findViewById(R.id.fatma);
    }
}