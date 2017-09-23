package com.example.danielmelo.myappnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButtonEnviar = (Button)findViewById(R.id.ButtonEnviar);
        editNombre = (EditText)findViewById(R.id.EditNombre);
        editApellido = (EditText)findViewById(R.id.EditApellido);
        editcorreo = (EditText)findViewById(R.id.EditCorreo);

        ButtonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = editNombre.getText().toString();
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("Nombre",nombre);

                String apellido = editApellido.getText().toString();
                Intent intent2 = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("Apellido",apellido);

                String correo = editcorreo.getText().toString();
                Intent intent3 = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("Correo",correo);

                startActivity(intent);

            }
        });
    }
    Button ButtonEnviar;
    EditText editNombre , editApellido, editcorreo;
}
