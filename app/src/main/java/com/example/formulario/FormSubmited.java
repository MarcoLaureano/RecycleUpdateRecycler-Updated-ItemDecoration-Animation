package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class FormSubmited extends AppCompatActivity {

    Spinner cinema, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submited_form);

        cinema = findViewById(R.id.spinnerCinema);
        gender = findViewById(R.id.spinnerGender);

        ArrayAdapter<CharSequence> generos = ArrayAdapter.createFromResource(
                this,R.array.gender_arrays, android.R.layout.simple_spinner_item);
        generos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        gender.setAdapter(generos);

        ArrayAdapter<CharSequence> generosCinematograficos = ArrayAdapter.createFromResource(
                this,R.array.cinema_arrays, android.R.layout.simple_spinner_item);
        generosCinematograficos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        cinema.setAdapter(generosCinematograficos);

        Button btn = (Button) findViewById(R.id.buttonNextActivity);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormSubmited.this, Recycle.class));
            }
        });
    }
}
