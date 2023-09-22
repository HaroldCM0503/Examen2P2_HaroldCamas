package examen2p2_haroldcamas;

import java.util.ArrayList;

public class Artista extends Usuario{
    String nombeArtistico;
    ArrayList<Cancion> canciones = new ArrayList();
    ArrayList<Album> albumes = new ArrayList();
    ArrayList<Single> singles = new ArrayList();

    public Artista(String nombeArtistico, String username, String contraseña, int edad) {
        super(username, contraseña, edad);
        this.nombeArtistico = nombeArtistico;
    }

    public String getNombeArtistico() {
        return nombeArtistico;
    }

    public void setNombeArtistico(String nombeArtistico) {
        this.nombeArtistico = nombeArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return nombeArtistico;
    }

    @Override
    public boolean isMayorEdad() {
        if(this.edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    public ArrayList<Single> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Single> singles) {
        this.singles = singles;
    }
    
    
}
