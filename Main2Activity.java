package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2 = (Button)findViewById(R.id.mainb2);
        b1 = (Button)findViewById(R.id.mainb1);
        e1 = (EditText)findViewById(R.id.maine1);
        e2 = (EditText)findViewById(R.id.maine2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this,second.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(Main2Activity.this, "First Fill All", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    SQLiteDatabase data = openOrCreateDatabase("gh",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(name varchar ,password varchar ,email varchar)");
                    String s3 = "select * from student where email ='"+s1+"'and password ='"+s2+"' ";
                    Cursor cursor = data.rawQuery(s3,null);

                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Main2Activity.this, "moving ", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(Main2Activity.this,third.class);
                        startActivity(j);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(Main2Activity.this, "Register First", Toast.LENGTH_SHORT).show();
                    }

                }


            }
        });

    }
}
