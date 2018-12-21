package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class six1 extends AppCompatActivity {

    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six1);
        t1 = (TextView)findViewById(R.id.sect1);
        b1 = (Button)findViewById(R.id.secb1);
        r1 = (RadioButton)findViewById(R.id.secr1);
        r2 = (RadioButton)findViewById(R.id.secr2);
        r3 = (RadioButton)findViewById(R.id.secr3);
        r4 = (RadioButton)findViewById(R.id.secr4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                {
                    ++six.score;
                }
                else
                {
                    --six.score;
                }
                Intent i = new Intent(six1.this,six2.class);
                startActivity(i);
                finish();
            }
        });
    }
}
