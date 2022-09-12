package com.zybooks.morseactivity0831;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    private static final String TAG = SendActivity.class.getSimpleName();
    Button lookupButton;
    TextView lookupText;
    Intent data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lookupText = (TextView) findViewById(R.id.lookupText);
        lookupButton = (Button) findViewById(R.id.lookupButton);
        lookupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lookup = new Intent(getApplicationContext(), LookUpActivity.class);
                lookup.putExtra("key","value");
                startActivityForResult(lookup, REQUEST_CODE);

            }

        });
    }
    @Override
        protected void onActivityResult(int requestcode,int resultcode, Intent data) {
            super.onActivityResult(requestcode, resultcode,data);

            if (requestcode == REQUEST_CODE && resultcode == RESULT_OK) {
                    if (data.hasExtra("key1") && data.hasExtra("key2")) {
                        Toast.makeText(
                                this,
                                "Your reult is : "+ data.getExtras().getString("key1") + " " + data.getExtras().getString("key2"),
                                Toast.LENGTH_SHORT).show();
                    }
                    String myStr = data.getStringExtra("MyData");
                    TextView lookupText = (TextView) findViewById(R.id.lookupText);

                    lookupText.getText();

                    Log.i(TAG, "onActivityResult: message >>" + myStr);
                }
            }
        }





