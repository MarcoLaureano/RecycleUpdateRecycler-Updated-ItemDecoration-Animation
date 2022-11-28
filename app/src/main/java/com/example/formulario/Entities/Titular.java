package com.example.formulario.Entities;

public class Titular {
    String titulo;
    String subtitol;

    public Titular(String titulo, String subtitol) {
        this.titulo = titulo;
        this.subtitol = subtitol;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitol() {
        return subtitol;
    }

    public void setSubtitol(String subtitol) {
        this.subtitol = subtitol;
    }
}
