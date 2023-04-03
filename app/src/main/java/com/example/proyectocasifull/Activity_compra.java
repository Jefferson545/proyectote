package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Activity_compra extends AppCompatActivity {
    Button btn_compra;
   // String driveFileUrl = "https://drive.google.com/uc?id=123456abcdefg&export=download";
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_compra.this);
                        builder.setMessage("Descargar pdf de terminos y condiciones.");
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