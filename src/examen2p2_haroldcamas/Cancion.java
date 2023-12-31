package examen2p2_haroldcamas;

import java.io.Serializable;

public class Cancion implements Serializable{
    String titulo;
    double duracion;
    Lanzamiento referencia;

    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Lanzamiento getReferencia() {
        return referencia;
    }

    public void setReferencia(Lanzamiento referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return titulo + "[" + duracion + "]";
    }
}
