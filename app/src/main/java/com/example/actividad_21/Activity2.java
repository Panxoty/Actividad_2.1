package com.example.actividad_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView3 = findViewById(R.id.textView3);

        Intent intento = getIntent();

        String nombrefoto = intento.getExtras().getString("nombre");
        textView3.setText(nombrefoto);

    }
}