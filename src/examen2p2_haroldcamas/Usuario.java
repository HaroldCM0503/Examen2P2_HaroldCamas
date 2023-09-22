package examen2p2_haroldcamas;

import java.io.Serializable;

public abstract class Usuario implements Serializable{
    String username;
    String contraseña;
    int edad;

    public Usuario(String username, String contraseña, int edad) {
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return username;
    }
    
    public abstract boolean isMayorEdad();
}
