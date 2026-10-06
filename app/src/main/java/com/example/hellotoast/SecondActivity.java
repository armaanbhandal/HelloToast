package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView countText = findViewById(R.id.text_count);

        Intent intent = getIntent();
        int count = intent.getIntExtra(getString(R.string.extra_count), 0);

        countText.setText(String.valueOf(count));
    }
}