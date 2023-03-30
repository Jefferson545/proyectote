package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

public class activity_inicioseci extends AppCompatActivity {
    EditText txtcorreo ,txtcontra;
    Button btn_iniciars;
    private ProgressDialog mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioseci);
        txtcorreo= findViewById(R.id.Correo);
        txtcontra= findViewById(R.id.contra);
        btn_iniciars=findViewById(R.id.btn_iniciar);
        mProgressBar = new ProgressDialog(activity_inicioseci.this);
        btn_iniciars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarCredenciales();
            }
        });

    }
    public void verificarCredenciales(){
        String email = txtcorreo.getText().toString();
        String password = txtcontra.getText().toString();
        if(email.isEmpty() || !email.contains("@")){
            Toast.makeText(activity_inicioseci.this, "Este correo no esta registrado", Toast.LENGTH_SHORT).show();
        }else if(password.isEmpty()|| password.length()<7){
            Toast.makeText(activity_inicioseci.this, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
        }else{
            //Mostrar ProgressBar
            mProgressBar.setTitle("Login");
            mProgressBar.setMessage("Iniciando sesión, espere un momento..");
            AlertDialog.Builder builder = new AlertDialog.Builder(activity_inicioseci.this);
            builder.setMessage("Se ha iniciado sesión correctamente.");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // Cierra el cuadro de diálogo
                    dialog.dismiss();
                    mProgressBar.setCanceledOnTouchOutside(false);
                    mProgressBar.show();
                    //Registrar usuario
                    //Exitoso -> Mostrar toast
                    //redireccionar - intent a login
                    Intent intent = new Intent(activity_inicioseci.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    //ocultar progressBar
                    mProgressBar.dismiss();
                }
            });
            builder.setCancelable(false); // Evita que el usuario cierre el diálogo al presionar fuera de él
            AlertDialog dialog = builder.create();
            dialog.show();

        }
    }
}