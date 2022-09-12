package com.zybooks.morseactivity0831;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button sendButton, receiveButton, aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button)findViewById(R.id.sendButton);
        receiveButton = (Button)findViewById(R.id.receiveButton);
        aboutButton = (Button)findViewById(R.id.aboutButton);



        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, SendActivity.class);
                startActivity(send);

            }
        });
        receiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receive = new Intent(MainActivity.this, RecieveActivity.class);
                startActivity(receive);

            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);

            }
        });

    }
}