package com.example.danielmelo.myappnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textNombre = (TextView) findViewById(R.id.NombreShow);
        textApellido = (TextView) findViewById(R.id.ApellidoShow);
        textCorreo = (TextView) findViewById(R.id.correoShow);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){

            String  nombre = extras.getString("Nombre");
            textNombre.setText(nombre);

            String  apellido = extras.getString("Apellido");
            textApellido.setText(apellido);

            String  correo = extras.getString("Correo");
            textCorreo.setText(correo);

        }
    }
    TextView textNombre,textApellido,textCorreo;
}
