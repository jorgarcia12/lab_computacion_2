package ej3;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private List<Provincia> provincias;

    public Pais() {
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    // Método para obtener las provincias que tienen más de la mitad de las ciudades en déficit
    public List<Provincia> obtenerProvinciasConCiudadesEnDeficit() {
        List<Provincia> provinciasConDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if (provincia.tieneMasDeLaMitadDeCiudadesEnDeficit()) {
                provinciasConDeficit.add(provincia);
            }
        }
        return provinciasConDeficit;
    }
}

