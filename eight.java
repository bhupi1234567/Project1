package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eight extends AppCompatActivity {
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        b1 = (Button)findViewById(R.id.eightb1);
        b2 = (Button)findViewById(R.id.eightb2);
        b3 = (Button)findViewById(R.id.eightb3);
        b4 = (Button)findViewById(R.id.eightb4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(eight.this,eight1.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(eight.this,eight2.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(eight.this,eight3.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(eight.this,third.class);
                startActivity(l);
                finish();
            }
        });
    }
}
