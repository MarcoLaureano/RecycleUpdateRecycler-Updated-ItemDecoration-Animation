package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class checkboxMenu extends AppCompatActivity {
    RadioButton chocolate, fresa, vainilla, menta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_boxes_layout);
        CheckBox cheddar = findViewById(R.id.cboxCheddar);
        CheckBox burger = findViewById(R.id.cboxBurger);
        CheckBox verdura = findViewById(R.id.cboxVerdura);
        Button btn = findViewById(R.id.getBtn);
        btn.setOnClickListener(v -> {
            Intent recibo = new Intent(checkboxMenu.this, Heladeria.class);

            String reciboValor = "";

            if (cheddar.isChecked()) {
                reciboValor = "+Cheedar";
                if (burger.isChecked()) {
                   reciboValor = "+Cheedar\n+1Burger";
                }
                if ( verdura.isChecked()) {
                    reciboValor = "+Cheedar\n+Verdura";
                }
                if (burger.isChecked() && verdura.isChecked()) {
                    reciboValor = "+Cheedar\n+1Burger\n+Verdura";
                }
            } else if (burger.isChecked()) {
                reciboValor = "+1Burger";
                if (verdura.isChecked()) {
                    reciboValor = "+1Burger\n+Verdura";
                }
            } else if (verdura.isChecked()) {
                reciboValor =  "+Verdura";
            }
            recibo.putExtra("recibo", reciboValor);
            startActivity(recibo);
        });
    }
}