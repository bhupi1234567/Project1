package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eight1 extends AppCompatActivity  implements SensorEventListener { //how to implement a method
    Button b1;
    MediaPlayer mp;
    Sensor s;
    SensorManager sm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight1);
        b1 = (Button) findViewById(R.id.eight1b1);
        mp = MediaPlayer.create(this, R.raw.m);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Intent i = new Intent(eight1.this,eight.class);
                startActivity(i);
                finish();
            }
        });
        //we have to implement sensor package4
        mp.start();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {//here event is the object;
        if(event.values[0]<5)//0 is predefined value
        {
            mp.pause();
        }
        else
        {
            mp.start();
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

}





