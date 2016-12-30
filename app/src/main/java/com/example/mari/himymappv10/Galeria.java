package com.example.mari.himymappv10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Galeria extends AppCompatActivity implements View.OnClickListener {


    ImageView btnsiguiente, btnanterior;
    ImageView imagen;

    int []fotoId= {
            R.drawable.g1,
            R.drawable.g2,
            R.drawable.g3,
            R.drawable.g4,
            R.drawable.g5,
            R.drawable.g6,
            R.drawable.g7,
            R.drawable.g8,
            R.drawable.g9,
            R.drawable.g10,
            R.drawable.g11,
            R.drawable.g12,
            R.drawable.g13,
            R.drawable.g14,
            R.drawable.g15,
            R.drawable.g16,
            R.drawable.g17,
            R.drawable.g18,
            R.drawable.g19,
            R.drawable.g20,
            R.drawable.g21,
            R.drawable.g22,
            R.drawable.g23,
            R.drawable.g24,
            R.drawable.g25,
            R.drawable.g26,
            R.drawable.g27,
            R.drawable.g28,
            R.drawable.g29,
            R.drawable.g30,
            R.drawable.g31,
            R.drawable.g32,
            R.drawable.g33,
            R.drawable.g34,
            R.drawable.g35,
            R.drawable.g36,
    };

    int i =0;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galery);


        btnsiguiente = (ImageView) findViewById(R.id.btnsiguiente);
        btnanterior = (ImageView) findViewById(R.id.btnanterior);
        imagen = (ImageView) findViewById(R.id.imagen);

        btnsiguiente.setOnClickListener(this);
        btnanterior.setOnClickListener(this);


        total = fotoId.length;
    }

    @Override
    public void onClick(View v) {
            int id =  v.getId();
            if(id == R.id.btnsiguiente){
                i++;
                if(i==total) i =0;

            }
        if (id == R.id.btnanterior){
            i--;
            if(i==-1) i =total-1;
        }

        imagen.setImageResource(fotoId[i]);
    }
}