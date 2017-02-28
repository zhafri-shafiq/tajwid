package com.example.zoro175.tajwid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayIzharActivity extends AppCompatActivity {

    Button button13, button16, button17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_izhar);
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(DisplayIzharActivity.this, DisplayIzharContoh.class);
                startActivity(intent3);
                finish();
            }
        });
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayIzharActivity.this, DisplayNunActivity.class);
                startActivity(intent);
                finish();
            }
        });
        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayIzharActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent2 = getIntent();
    }
}
