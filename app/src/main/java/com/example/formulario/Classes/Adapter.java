package com.example.formulario.Classes;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formulario.Entities.Titular;
import com.example.formulario.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Titular> titulars;
    private int lastPos = -1;

    public Adapter(ArrayList titulars){
        this.titulars = titulars;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.xml_linearlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( Adapter.ViewHolder holder, int position) {
        final Titular Oscar = titulars.get(position);
        holder.titulo.setText(titulars.get(position).getTitulo());
        holder.subtitulo.setText(titulars.get(position).getSubtitol());
        holder.itemView.setOnClickListener(view -> Log.i("DemoRecView", "Pulsado el elemento:"
                + titulars.get(position).getTitulo().toString()));

        if(holder.getAdapterPosition() > lastPos){
            Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.right_to_left);
            ((ViewHolder)holder).itemView.startAnimation(animation);
        }
    }

    @Override
    public int getItemCount() {
        return titulars.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo;
        public TextView subtitulo;

        public ViewHolder(View itemView) {
            super(itemView);
            this.titulo = itemView.findViewById(R.id.lblTitulo);
            this.subtitulo = itemView.findViewById(R.id.lblSubtitulo);
        }
    }



}
