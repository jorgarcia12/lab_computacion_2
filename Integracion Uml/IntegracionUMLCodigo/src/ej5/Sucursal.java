package ej5;

public class Sucursal {
    private String direccion;
    private Restaurante restaurante;

    public Sucursal(String direccion, Restaurante restaurante) {
        this.direccion = direccion;
        this.restaurante = restaurante;
        restaurante.agregarSucursal(this);
    }

    public String getDireccion() {
        return direccion;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }
}
