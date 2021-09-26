package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnHola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = (EditText)findViewById(R.id.TxtNombre);
        btnHola = (Button)findViewById(R.id.BtnHola);
    }

    //Implementamos el evento click del botón
    public void clickBotonHola(View v) {
        //Creamos el intent
        Intent intent = new Intent(MainActivity.this, SaludoActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);

        //Iniciamos la nueva actividad
        startActivity(intent);
    }
}