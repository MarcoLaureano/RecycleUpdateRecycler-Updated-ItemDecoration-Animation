package com.example.formulario;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


import androidx.appcompat.app.AppCompatActivity;


public class Heladeria extends AppCompatActivity {
    android.widget.RadioButton chocolate, fresa, vainilla, menta;

    @Override
    protected void onCreate(Bundle heladeria) {
        super.onCreate(heladeria);
        setContentView(R.layout.activity_heladeria);
        fresa = findViewById(R.id.Strawberry);
        menta = findViewById(R.id.Mint);
        chocolate = findViewById(R.id.Choco);
        vainilla = findViewById(R.id.Vanilla);

        Button btnHelado = findViewById(R.id.buttonHelado);

        btnHelado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reciboHelado = new Intent(Heladeria.this, checkBox_Recibo.class);
                String str = "";

                if (chocolate.isChecked()) {
                    str = "Helado de Chocolate: 1,99€";
                    reciboHelado.putExtra("reciboHelado", str);
                    reciboHelado.putExtra("recibo", getIntent().getExtras().getString("recibo"));
                    startActivity(reciboHelado);
                }else if((menta.isChecked())) {
                    str = "Helado de Menta: 1,99€";
                    reciboHelado.putExtra("reciboHelado", str);
                    reciboHelado.putExtra("recibo", getIntent().getExtras().getString("recibo"));
                    startActivity(reciboHelado);
                }else if((vainilla.isChecked())) {
                    str = "Helado de Vainilla: 1,99€";
                    reciboHelado.putExtra("reciboHelado", str);
                    reciboHelado.putExtra("recibo", getIntent().getExtras().getString("recibo"));
                    startActivity(reciboHelado);
                }else if((fresa.isChecked())) {
                    str = "Helado de Fresa: 1,99€";
                    reciboHelado.putExtra("reciboHelado", str);
                    reciboHelado.putExtra("recibo", getIntent().getExtras().getString("recibo"));
                    startActivity(reciboHelado);
                }
            }
        });
    }
}

