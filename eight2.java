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

public class eight2 extends AppCompatActivity implements SensorEventListener {
        MediaPlayer mp;
        Button b1;
        Sensor s;
        SensorManager sm;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eight2);
            b1=(Button)findViewById(R.id.eight2b1);
            mp=MediaPlayer.create(this,R.raw.m);
            sm=(SensorManager)getSystemService(SENSOR_SERVICE);
            s=sm.getDefaultSensor(Sensor.TYPE_GRAVITY);
            sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.stop();
                    Intent i = new Intent(eight2.this,eight.class);
                    startActivity(i);
                    finish();
                }
            });



        }

        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            if(sensorEvent.values[1]<5)
            {
                mp.start();
            }
            else
            {
                mp.pause();
            }


        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }

    }
