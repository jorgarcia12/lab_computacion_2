package ej8;

public class TipoAvion {
    private int numeroModelo;
    private int capacidad;
    private double peso;

    public TipoAvion(int numeroModelo, int capacidad, double peso) {
        this.numeroModelo = numeroModelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public void setNumeroModelo(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
