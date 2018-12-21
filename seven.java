package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class seven extends AppCompatActivity {
    ImageView v1;
    ImageButton b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        b1 = (ImageButton) findViewById(R.id.button);
        b2 = (ImageButton)findViewById(R.id.sevenib1);
        v1 = (ImageView)findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(seven.this,third.class);
                startActivity(j);
                finish();
            }
        });



        //here on right click select generate Override method OnActivityResult and select it
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);


        Bitmap b = (Bitmap)data.getExtras().get("data");
        v1.setImageBitmap(b);

    }
}

