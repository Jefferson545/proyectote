package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_compra extends AppCompatActivity {
    Button btn_compra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn_compra=findViewById(R.id.button);
       // btn_compra.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View view) {
         //       compra();
        //    }
       // });
        setContentView(R.layout.activity_compra);
        // Obtener la información del Intent
        Intent intent = getIntent();
        String informacion = intent.getStringExtra("textSeleccionado");

// Mostrar la información en un TextView u otro componente
        TextView textView = (TextView) findViewById(R.id.textseleccionado);
        textView.setText(informacion);

    }
    public void compra(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_compra.this);
        builder.setTitle("Confirmar compra");
        builder.setMessage("¿Desea comprar este producto?");

// Configuración de los botones
        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Si el usuario presiona "Sí", mostramos mensaje de compra exitosa
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity_compra.this);
                builder.setMessage("Felicidades por tu compra, en los próximos 3 días se te enviará más detalles sobre tu compra, a\n" +
                        "continuación, te invitamos a que leas sobre los términos y condiciones acerca de la instalación\n" +
                        "de paneles solares.");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cierra el cuadro de diálogo
                        dialog.dismiss();
                    }
                });
                AlertDialog dialo = builder.create();
                dialo.show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Si el usuario presiona "No", mostramos mensaje de cancelación
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity_compra.this);
                builder.setMessage("Compra cancelada");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cierra el cuadro de diálogo
                        dialog.dismiss();
                    }
                });
                AlertDialog dialg = builder.create();
                dialg.show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();



    }
}