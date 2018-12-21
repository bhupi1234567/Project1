package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class six extends AppCompatActivity {

    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        t1 = (TextView)findViewById(R.id.maint1);
        b1 = (Button)findViewById(R.id.mainb1);
        r1 = (RadioButton)findViewById(R.id.mainr1);
        r2 = (RadioButton)findViewById(R.id.mainr2);
        r3 = (RadioButton)findViewById(R.id.mainr3);
        r4 = (RadioButton)findViewById(R.id.mainr4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;

                if(r3.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }
                Intent i = new Intent(six.this,six1.class);
                startActivity(i);
                finish();
            }

        });
    }
}

