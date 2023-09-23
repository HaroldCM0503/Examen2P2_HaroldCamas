package examen2p2_haroldcamas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    JProgressBar barra;
    Cancion cancion;
    boolean vive = true;
    boolean seguir = true;
    double paso;

    public Hilo(JProgressBar barra, Cancion cancion) {
        this.barra = barra;
        this.cancion = cancion;

        int minutos = (int) cancion.getDuracion();
        double segundo = cancion.getDuracion() - minutos;
        int segundos = (minutos * 60) + (int) (segundo * 100);
        this.paso = 100 / segundos;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getPaso() {
        return paso;
    }

    public void setPaso(double paso) {
        this.paso = paso;
    }

    public boolean isSeguir() {
        return seguir;
    }

    public void setSeguir(boolean seguir) {
        this.seguir = seguir;
    }

    @Override
    public void run() {
        while (vive) {
            while (seguir) {
                barra.setValue((int) (barra.getValue() + paso));

                if (barra.getValue() == 100) {
                    barra.setValue(0);
                    this.setSeguir(false);
                    this.setVive(false);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
