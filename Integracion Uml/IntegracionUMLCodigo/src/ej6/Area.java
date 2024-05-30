package ej6;

import java.util.List;
import java.util.ArrayList;

public class Area {
    private String nombre;
    private double km2;
    private List<Especie> especies;
    // Otros atributos...

    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
        this.especies = new ArrayList<>();
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }

    public void agregarEspecie(Especie especie) {
        especies.add(especie);
    }

}
