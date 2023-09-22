package examen2p2_haroldcamas;

import java.util.ArrayList;

public class Lista_Reproduccion {
    String nombre;
    int likes;
    ArrayList<Cancion> canciones = new ArrayList();

    public Lista_Reproduccion(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre + canciones;
    }
    
    
}
