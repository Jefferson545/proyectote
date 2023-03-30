package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_inicio extends AppCompatActivity {

    EditText mes1_editText ,mes2_editText,mes3_editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button button = (Button)findViewById(R.id.bnt_meses);
        EditText mes1 = (EditText)findViewById(R.id.mes1_editText);
        EditText mes2 = (EditText)findViewById(R.id.mes2_editText);
        EditText mes3 = (EditText)findViewById(R.id.mes3_editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity_calc_panels.class);
                intent.putExtra("mes1P", mes1.getText().toString());
                intent.putExtra("mes2P", mes2.getText().toString());
                intent.putExtra("mes3P", mes3.getText().toString());
                startActivity(intent);
            }
        });

    }


}