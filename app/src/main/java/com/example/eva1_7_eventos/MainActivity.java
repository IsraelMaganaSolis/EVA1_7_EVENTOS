package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //implements View.OnClickListener
Button btnInListener;
Button btnPorClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInListener = findViewById(R.id.btnInListener);
        btnPorClaseAnonima = findViewById(R.id.btnPorClaseAnonima);
        btnInListener.setOnClickListener(this);

        Context context = getApplicationContext();
        btnPorClaseAnonima.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Evento clase anonima", Toast.LENGTH_SHORT).show();
                        }
                }
        );


    }
    //Evento Click
    public void miClick(View v){

        Toast.makeText(this, "Hola mundo", Toast.LENGTH_SHORT).show();

        Log.wtf("Mensaje","Falla catastrofica");

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Evento por interfaz", Toast.LENGTH_SHORT).show();
    }
}