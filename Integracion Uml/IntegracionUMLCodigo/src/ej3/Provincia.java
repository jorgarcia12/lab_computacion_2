package ej3;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para verificar si la provincia tiene más de la mitad de las ciudades en déficit
    public boolean tieneMasDeLaMitadDeCiudadesEnDeficit() {
        int ciudadesEnDeficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.estáEnDeficit()) {
                ciudadesEnDeficit++;
            }
        }
        return ciudadesEnDeficit > ciudades.size() / 2;
    }
}