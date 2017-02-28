package com.example.zoro175.tajwid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayIzharContoh extends AppCompatActivity {

    Button button25, button26, button27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_izhar_contoh);
        button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(DisplayIzharContoh.this, DisplayIzharContoh1.class);
                startActivity(intent4);
                finish();
            }
        });
        button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DisplayIzharContoh.this, DisplayNunActivity.class);
                startActivity(intent2);
                finish();
            }
        });
        button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayIzharContoh.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent3 = getIntent();
    }
}
