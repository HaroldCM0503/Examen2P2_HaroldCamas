package examen2p2_haroldcamas;

import java.util.ArrayList;

public class Cliente extends Usuario{
    ArrayList<Cancion> favoritas = new ArrayList();
    ArrayList<Lista_Reproduccion> creadas = new ArrayList();
    ArrayList<Lista_Reproduccion> gustadas = new ArrayList();

    public Cliente(String username, String contraseña, int edad) {
        super(username, contraseña, edad);
    }

    public ArrayList<Cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> favoritas) {
        this.favoritas = favoritas;
    }

    public ArrayList<Lista_Reproduccion> getCreadas() {
        return creadas;
    }

    public void setCreadas(ArrayList<Lista_Reproduccion> creadas) {
        this.creadas = creadas;
    }

    public ArrayList<Lista_Reproduccion> getGustadas() {
        return gustadas;
    }

    public void setGustadas(ArrayList<Lista_Reproduccion> gustadas) {
        this.gustadas = gustadas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean isMayorEdad() {
        if(this.edad >= 12){
            return true;
        }
        else{
            return false;
        }
    }
}
