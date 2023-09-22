package examen2p2_haroldcamas;

import java.util.Date;

public class Lanzamiento {
    String titulo;
    Date lanzamiento;
    int likes;

    public Lanzamiento(String titulo, Date lanzamiento) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.likes = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
