package ej5;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Plato> platos;
    private List<Sucursal> sucursales;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
        this.sucursales = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public List<Plato> obtenerPlatos() {
        return platos;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public List<Sucursal> obtenerSucursales() {
        return sucursales;
    }
}
