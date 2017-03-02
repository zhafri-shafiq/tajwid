package com.example.zoro175.tajwid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayIzharContoh1 extends AppCompatActivity {

    Button button14, button15, button18, button19, button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_izhar_contoh1);
//        final MediaPlayer mp = new MediaPlayer();
//        boolean playing = false;
//        button14 = (Button) findViewById(R.id.button14);
//        button14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            boolean playing = false;
//                if(playing) {
//                    mp.stop();
//                    mp.pause();
//
//                    playing = false;
//                } else {
//                    MediaPlayer mp = MediaPlayer.create(DisplayIzharContoh1.this, R.raw.canon);
//
//                    mp.start();
//                    playing = true;
//                    //mp.release();
//                }
//            }
//        });
        button14 = (Button) findViewById(R.id.button14);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.a6_1);
//        @Override
//        public void onPause {
//            super.onPause();
//            mp.stop();
//            mp.release();
//        }
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
            }
        });
        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
                Intent intent3 = new Intent(DisplayIzharContoh1.this, DisplayIzharContoh.class);
                startActivity(intent3);
                finish();
            }
        });
        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
                Intent intent2 = new Intent(DisplayIzharContoh1.this, DisplayNunActivity.class);
                startActivity(intent2);
                finish();
            }
        });
        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
                Intent intent = new Intent(DisplayIzharContoh1.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent4 = getIntent();

    }
}
