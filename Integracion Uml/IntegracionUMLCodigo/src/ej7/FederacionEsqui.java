package ej7;

public class FederacionEsqui {
    private String nombre;
    private int numeroFederados;

    public FederacionEsqui(String nombre, int numeroFederados) {
        this.nombre = nombre;
        this.numeroFederados = numeroFederados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroFederados() {
        return numeroFederados;
    }

    public void setNumeroFederados(int numeroFederados) {
        this.numeroFederados = numeroFederados;
    }
}
