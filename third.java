package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {
   private Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1 = (Button)findViewById(R.id.button6);//calculator
        b2=(Button)findViewById(R.id.button5);//mediaplayer
        b3=(Button)findViewById(R.id.button3);//quiz
        b4=(Button)findViewById(R.id.button2);//magicalcmusicplayer
        b5=(Button)findViewById(R.id.button1);//cmera
        b6=(Button)findViewById(R.id.thirdb1);//home

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(third.this,four.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this,six.class);
                startActivity(j);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(third.this,five.class);
                startActivity(k);
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(third.this,seven.class);
                startActivity(l);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(third.this,Main2Activity.class);
                startActivity(m);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(third.this,eight.class);
                startActivity(n);
                finish();
            }
        });
    }

}
