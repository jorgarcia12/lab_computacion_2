package ej2;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Pais paisVecino;
    private String continente;

    public Pais(String nombre, String continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void addProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public Pais getPaisVecino() {
        return paisVecino;
    }

    public void setPaisVecino(Pais paisVecino) {
        this.paisVecino = paisVecino;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}