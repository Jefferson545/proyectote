package com.example.proyectocasifull;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.ktx.Firebase;

public class activity_login extends AppCompatActivity {
    EditText nombre;
    EditText apellidos;
    EditText  numero;
    EditText  correo;
    EditText contrasena;
    Button btn_registro;
    FirebaseAuth mAuth;
    FirebaseFirestore mFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nombre=findViewById(R.id.nombre);
        apellidos=findViewById(R.id.ape);
        correo=findViewById(R.id.Correo);
        numero=findViewById(R.id.num);
        contrasena=findViewById(R.id.contra);
        btn_registro=findViewById(R.id.btn_iniciar);
        mAuth = FirebaseAuth.getInstance();
        mFirestore= FirebaseFirestore.getInstance();
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {
        String name= nombre.getText().toString().toUpperCase();
        String ape= apellidos.getText().toString().toUpperCase();
        String number= numero.getText().toString().toUpperCase();
        String co= correo.getText().toString();
        String pas= contrasena.getText().toString();

        if(!name.isEmpty()&& !ape.isEmpty() && !number.isEmpty() && !co.isEmpty() && !pas.isEmpty()){
            if(isEmailValid(co)){
                if(pas.length()>= 5){
                    createUser(name, co, pas);
                }else{
                    Toast.makeText(activity_login.this, "La contraseña debe ser mayor a 4 caracteres", Toast.LENGTH_SHORT).show();
                }


            }else{
                Toast.makeText(activity_login.this, "El correo no es valido", Toast.LENGTH_SHORT).show();
            }

        }else{

            Toast.makeText(activity_login.this, "Ingrese todos los datos", Toast.LENGTH_SHORT).show();
        }


    }

    private void createUser(String name, String co, String pass) {
        mAuth.createUserWithEmailAndPassword(co,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    String id= mAuth.getCurrentUser().getUid();
                    Map<String, Object> map= new HashMap<>();
                    map.put("name",name);
                    map.put("email",co);
                    map.put("password",pass);
                    mFirestore.collection("Users").document(id).set(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Intent i=new Intent(activity_login.this,activity_inicioseci.class);
                                startActivity(i);

                                AlertDialog.Builder builder = new AlertDialog.Builder(activity_login.this);
                                builder.setMessage("Se ha iniciado sesión correctamente.");
                                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // Cierra el cuadro de diálogo
                                        dialog.dismiss();
                                    }
                                });
                                builder.setCancelable(false); // Evita que el usuario cierre el diálogo al presionar fuera de él
                                AlertDialog dialog = builder.create();
                                dialog.show();

                            }

                        }
                    });

                }else{
                    Toast.makeText(activity_login.this, "No se pudo registrar Intente de nuevo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean isEmailValid(String co){
        String expression ="^[\\w\\.-]+@([\\w\\-].)+[A-Z]{2,4}$";
        Pattern pattern= Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(co);
        return matcher.matches();
    }

    public void siguiente(View view){
        Intent siguiente= new Intent(this,activity_inicioseci.class);
        startActivity(siguiente);

    }


}