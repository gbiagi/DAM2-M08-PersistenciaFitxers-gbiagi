package com.example.persistenciafitxers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Jose");
        listaNombres.add("Pepe");
        listaNombres.add("Isidro");

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

        TextView textNom = findViewById(R.id.textNom);
        TextView textCognom = findViewById(R.id.textCognom);
        TextView textTelefon = findViewById(R.id.textTelefon);
        TextView textEmail = findViewById(R.id.textEmail);

        EditText editNom = findViewById(R.id.inputNom);
        EditText editCognom = findViewById(R.id.inputCognom);
        EditText editTelefon = findViewById(R.id.inputTelefon);
        EditText editEmail = findViewById(R.id.inputEmail);

        Button botonGuardar = findViewById(R.id.botonGuardar);
        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = editNom.getText().toString();
                String cognom = editCognom.getText().toString();
                String telefon = editTelefon.getText().toString();
                String email = editEmail.getText().toString();

                Log.i("Nombre", nom);
                listaNombres.add(nom);
                Log.i("Apellido", cognom);
                listaApellidos.add(cognom);
                Log.i("Telefono", telefon);
                listatelefonos.add(telefon);
                Log.i("Email", email);
                listaemails.add(email);

                String data = "\n"+ nom + ";" + cognom + ";" + telefon + ";" + email;

                try (FileOutputStream fileOut = openFileOutput("contactes.txt", Context.MODE_APPEND)) {
                    fileOut.write(data.getBytes());
                    Toast.makeText(MainActivity.this, "Contacte guardat correctament", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Error al desar el contacte", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
    }
}