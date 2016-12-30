package com.example.mari.himymappv10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Season extends AppCompatActivity {

    ImageView s1;
    ImageView s2;
    ImageView s3;
    ImageView s4;
    ImageView s5;
    ImageView s6;
    ImageView s7;
    ImageView s8;
    ImageView s9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season);


        s1 = (ImageView) findViewById(R.id.s1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season1.class);
                startActivity(e);


                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);
            }


        });


        s2 = (ImageView) findViewById(R.id.s2);

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season2.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s3 = (ImageView) findViewById(R.id.s3);

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season3.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s4 = (ImageView) findViewById(R.id.s4);

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season4.class);
                startActivity(e);
            }
        });

        s5 = (ImageView) findViewById(R.id.s5);

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season5.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s6 = (ImageView) findViewById(R.id.s6);

        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season6.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s7 = (ImageView) findViewById(R.id.s7);

        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season7.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s8 = (ImageView) findViewById(R.id.s8);

        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season8.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });

        s9 = (ImageView) findViewById(R.id.s9);

        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Season.this, Season9.class);
                startActivity(e);

                overridePendingTransition(R.anim.slide_s1, R.anim.slide_s1_2);

            }
        });
    }
}