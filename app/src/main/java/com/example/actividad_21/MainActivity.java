package com.example.actividad_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button BTAceptar;
    EditText ETNombreFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BTAceptar =(Button) findViewById(R.id.BTAceptar);
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombreFoto =(EditText) findViewById(R.id.ETNombreFoto);
                String StNombre= ETNombreFoto.getText().toString();

                Intent sIntent = new Intent(MainActivity.this, Activity2.class);
                sIntent.putExtra("STNombre",StNombre);
                startActivity(sIntent);

            }
        });


    }

}