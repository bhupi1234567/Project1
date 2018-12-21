package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class five extends AppCompatActivity {
    MediaPlayer mp;
    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        b1=(Button)findViewById(R.id.fiveb1);
        b2=(Button)findViewById(R.id.fiveb2);
        b3=(Button)findViewById(R.id.fiveb3);
        mp=MediaPlayer.create(this,R.raw.m);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(five.this,third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
