package examen2p2_haroldcamas;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    ArrayList<Cancion> canciones = new ArrayList();
    int n_canciones;

    public Album(int n_canciones, String titulo, Date lanzamiento, int likes) {
        super(titulo, lanzamiento);
        this.n_canciones = n_canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getN_canciones() {
        return n_canciones;
    }

    public void setN_canciones(int n_canciones) {
        this.n_canciones = n_canciones;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
