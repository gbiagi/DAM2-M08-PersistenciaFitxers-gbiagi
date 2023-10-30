package com.example.persistenciafitxers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Jose");
        listaNombres.add("Jose");
        listaNombres.add("Jose");

        ArrayList<String> listaApellidos = new ArrayList<>();
        listaNombres.add("Gonzalez");
        listaNombres.add("Perez");
        listaNombres.add("Lopez");

        ArrayList<String> listatelefonos = new ArrayList<>();
        listaNombres.add("555-551");
        listaNombres.add("666-662");
        listaNombres.add("777-773");

        ArrayList<String> listaemails = new ArrayList<>();
        listaNombres.add("master1@gmail.es");
        listaNombres.add("javaenjoyer34@gmail.es");
        listaNombres.add("listviewer56@gmail.e-s");

        Button botonGuardar = findViewById(R.id.botonGuardar);

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "J3J3J3J3J3J3J3J3J3J3J3J3J");

            }
        });

    }
}