package ej1;

public abstract class Poligono extends Figura {
    private int numeroLados;
    private Punto[] lados;

    public Poligono(int numeroLados, Punto[] lados) {
        this.numeroLados = numeroLados;
        this.lados = lados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public Punto[] getLados() {
        return lados;
    }

    public void setLados(Punto[] lados) {
        this.lados = lados;
    }
}
