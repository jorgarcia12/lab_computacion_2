package ej5;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Plato> platosGustados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.platosGustados = new ArrayList<>();
    }

    public void agregarPlatoGustado(Plato plato) {
        platosGustados.add(plato);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Plato> getPlatosGustados() {
        return platosGustados;
    }
}
