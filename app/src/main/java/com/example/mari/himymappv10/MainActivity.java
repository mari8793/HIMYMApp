package com.example.mari.himymappv10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView elenco;
    ImageView temporadas;
    ImageView galeria;
    ImageView historia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        elenco = (ImageView) findViewById(R.id.cast);

        elenco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, Cast.class);
                startActivity(e);
            }
        });


        historia = (ImageView) findViewById(R.id.historia);

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, Sinopsis.class);
                startActivity(e);
            }
        });



        temporadas = (ImageView) findViewById(R.id.season);

        temporadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, Season.class);
                startActivity(e);
            }
        });


        galeria = (ImageView) findViewById(R.id.galery);

        galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, Galeria.class);
                startActivity(e);
            }
        });
    }
}
