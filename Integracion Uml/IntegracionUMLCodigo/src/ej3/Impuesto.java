package ej3;

import java.util.ArrayList;

public class Impuesto {
    private String tipo;
    private double montoRecaudado;

    public Impuesto(String tipo, double montoRecaudado) {
        this.tipo = tipo;
        this.montoRecaudado = montoRecaudado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(double montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
}

