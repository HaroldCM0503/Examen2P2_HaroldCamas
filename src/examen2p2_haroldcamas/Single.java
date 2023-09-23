package examen2p2_haroldcamas;

import java.io.Serializable;
import java.util.Date;

public class Single extends Lanzamiento implements Serializable{
    private static final long serialVersionUID = 333L;
    Cancion cancion;

    public Single(Cancion cancion, String titulo, Date lanzamiento, int likes) {
        super(titulo, lanzamiento);
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
