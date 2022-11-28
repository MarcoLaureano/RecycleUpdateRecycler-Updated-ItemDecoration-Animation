package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class checkBox_Recibo extends AppCompatActivity {
    String txt;
    TextView txtView1;
    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_recibo);

        Bundle getRecibo = getIntent().getExtras();

        txtView1 = (TextView)findViewById(R.id.textRecibo);
        if (getRecibo != null){
            txt = getRecibo.getString("recibo");
        }
        txtView1.setText(txt);

        txtView2 = (TextView)findViewById(R.id.heladoRecibo);
        if (getRecibo != null){
            txt = getRecibo.getString("reciboHelado");
        }
        txtView2.setText(txt);

        Button btnNext = (Button) findViewById(R.id.nextPage);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(checkBox_Recibo.this, Formulari.class));
            }
        });
    }
}//heladoRecibo