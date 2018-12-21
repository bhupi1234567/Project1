package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;

public class six4 extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5;
    TextView t1;
    public static String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six4);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button7);
        b3=(Button)findViewById(R.id.button8);
        b4=(Button)findViewById(R.id.button9);
        b5=(Button)findViewById(R.id.six4b1);
        t1=(TextView)findViewById(R.id.six4e1);


       t1.setText("Your Score is "+six.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s="https://www.google.com";
                Intent i = new Intent(six4.this,six5.class);
                startActivity(i);

                onPause();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://www.twitter.com";
                Intent j = new Intent(six4.this,six5.class);
                startActivity(j);
                onPause();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s="https://www.amazon.com";
                Intent k = new Intent(six4.this,six5.class);
                startActivity(k);
                onPause();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s="https://www.facebook.com";
                Intent l = new Intent(six4.this,six5.class);
                startActivity(l);
                onPause();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n = new Intent(six4.this,third.class);
                startActivity(n);
                onPause();

            }
        });
    }

}
