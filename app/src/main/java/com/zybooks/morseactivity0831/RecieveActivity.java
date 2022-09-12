package com.zybooks.morseactivity0831;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}