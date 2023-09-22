package examen2p2_haroldcamas;

import java.util.Date;

public class Single extends Lanzamiento{
    Cancion cancion;

    public Single(Cancion cancion, String titulo, Date lanzamiento, int likes) {
        super(titulo, lanzamiento, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + cancion + "]";
    }
}
