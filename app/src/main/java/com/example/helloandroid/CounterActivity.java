package com.example.helloandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity{
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final TextView tvCount = findViewById(R.id.text_counter);
        Button btnJump = (Button) findViewById(R.id.btn_count);
        Button btnJump2 = (Button) findViewById(R.id.btn_count2);
        Button btnJump3 = (Button) findViewById(R.id.btn_count3);

        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvCount.setText("The current number is "+Integer.toString(++count));
            }
        });
        btnJump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvCount.setText("The current number is "+Integer.toString(--count));
            }
        });
        btnJump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvCount.setText("The current number is 0");
            }
        });
    }
}

