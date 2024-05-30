package ej1;

public class Circulo extends Elipse {
    private double radio;

    public Circulo(double radio) {
        super(radio, radio);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
