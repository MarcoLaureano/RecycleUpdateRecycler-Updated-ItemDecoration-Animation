package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class checkBox_Recibo extends AppCompatActivity {
    String txt;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_recibo);

        Bundle getRecibo = getIntent().getExtras();

        txtView = (TextView)findViewById(R.id.textRecibo);
        if (getRecibo != null){
            txt = getRecibo.getString("recibo");
        }
        txtView.setText(txt);
    }
}