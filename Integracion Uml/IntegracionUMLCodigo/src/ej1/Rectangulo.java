package ej1;

public class Rectangulo extends Cuadrilatero {
    private double ancho;
    private double alto;

    public Rectangulo(Punto[] lados, double ancho, double alto) {
        super(lados);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
