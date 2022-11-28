package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.formulario.Classes.Adapter;
import com.example.formulario.Entities.Titular;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {
    ArrayList<Titular> titulars = new ArrayList<>();
    RecyclerView rView;
    Button insertar, eliminar, mover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        titulars.add(new Titular("Marco","Gutierrez"));
        titulars.add(new Titular("Bing","Chilling"));
        titulars.add(new Titular("A","132"));
        titulars.add(new Titular("B","123"));
        titulars.add(new Titular("C","231"));
        titulars.add(new Titular("D","321"));

        rView = findViewById(R.id.lista);

        Adapter adaptador = new Adapter(titulars);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this ,3));
        rView.setAdapter(adaptador);

        insertar = findViewById(R.id.insertar);
        eliminar = findViewById(R.id.eliminar);
        mover = findViewById(R.id.mover);

        insertar.setOnClickListener(v -> {
            titulars.add(1,new Titular("Nuevo Titular","Nuevo Subtitulo"));
            adaptador.notifyItemInserted(1);
        });

        eliminar.setOnClickListener(v -> {
            titulars.remove(1);
            adaptador.notifyItemRemoved(1);
        });

        mover.setOnClickListener(v -> {
            titulars.set(1,titulars.get(2));
            titulars.set(2,titulars.get(1));
            adaptador.notifyItemMoved(1,2);
        });

        rView.addItemDecoration(new DividerItemDecoration(this ,DividerItemDecoration.HORIZONTAL));
        rView.addItemDecoration(new DividerItemDecoration(this ,DividerItemDecoration.VERTICAL));
    }
}