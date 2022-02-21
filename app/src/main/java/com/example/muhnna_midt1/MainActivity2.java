package com.example.muhnna_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn1;
    MediaPlayer mediaplayer1;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = (Button) findViewById(R.id.button);
        mediaplayer1 = new MediaPlayer();
        mediaplayer1 = MediaPlayer.create(this,R.raw.track1);
        playing = 0;

    }
    Button.OnClickListener bttn1 = new Button.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mediaplayer1.start();
                    playing = 1;
                    btn1.setText("Pause Music");

                    break;
            }}
    };}
