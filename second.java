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

public class second extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1 = (Button)findViewById(R.id.secb1);
        b2 = (Button)findViewById(R.id.secb2);
        e1 = (EditText)findViewById(R.id.sece1);
        e2 = (EditText)findViewById(R.id.sece2);
        e3 = (EditText)findViewById(R.id.sece3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(second.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s3 = e2.getText().toString();
                String s2 = e3.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals(""))

                {
                    Toast.makeText(second.this, "Plz fill All", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    SQLiteDatabase data = openOrCreateDatabase("gh",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student (name varchar,email varchar,password varchar)");
                    String s4 = "select * from student where name ='"+s1+"' and email ='"+s2+"'and password='"+s3+"' ";
                    Cursor cursor = data.rawQuery(s4,null);

                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(second.this, "user exits", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(second.this, "Reigister successful", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(second.this,MainActivity.class);
                        startActivity(j);
                        finish();
                    }



                }

            }
        });
    }
}
