package ej3;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private List<Impuesto> impuestos;
    private double gastoMantenimiento;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.impuestos = new ArrayList<>();
    }

    public void agregarImpuesto(Impuesto impuesto) {
        impuestos.add(impuesto);
    }

    public void setGastoMantenimiento(double gastoMantenimiento) {
        this.gastoMantenimiento = gastoMantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Impuesto> getImpuestos() {
        return impuestos;
    }


    public double getGastoMantenimiento() {
        return gastoMantenimiento;
    }

    // Método para verificar si la ciudad está en déficit
    public boolean estáEnDeficit() {
        double totalRecaudado = 0;
        for (Impuesto impuesto : impuestos) {
            totalRecaudado += impuesto.getMontoRecaudado();
        }
        return totalRecaudado < gastoMantenimiento;
    }
}