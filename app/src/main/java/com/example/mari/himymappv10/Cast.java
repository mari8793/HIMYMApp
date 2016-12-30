package com.example.mari.himymappv10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Cast extends AppCompatActivity {

    ImageView ted;
    ImageView robin;
    ImageView barney;
    ImageView marshall;
    ImageView lily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cast);


        ted = (ImageView) findViewById(R.id.tedProfile);

        ted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Cast.this, Ted.class);
                startActivity(e);
            }
        });


        robin = (ImageView) findViewById(R.id.robinProfile);
        robin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Cast.this, Robin.class);
                startActivity(e);
            }
        });


        barney = (ImageView) findViewById(R.id.barneyProfile);
        barney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Cast.this, Barney.class);
                startActivity(e);
            }
        });

        marshall = (ImageView) findViewById(R.id.marshallProfile);
        marshall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Cast.this, Marshall.class);
                startActivity(e);
            }
        });

        lily = (ImageView) findViewById(R.id.lilyProfile);
        lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Cast.this, Lily.class);
                startActivity(e);
            }
        });
    }
}