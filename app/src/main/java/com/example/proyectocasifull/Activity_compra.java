package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_compra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
        // Obtener la información del Intent
        Intent intent = getIntent();
        String informacion = intent.getStringExtra("textSeleccionado");

// Mostrar la información en un TextView u otro componente
        TextView textView = (TextView) findViewById(R.id.textseleccionado);
        textView.setText(informacion);

    }
}