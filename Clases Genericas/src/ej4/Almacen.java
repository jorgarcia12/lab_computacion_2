package ej4;

import ej3.Producto;

import java.util.ArrayList;

public class Almacen <E extends Producto>{
    private ArrayList<E> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public Almacen(ArrayList<E> productos) {
        this.productos = productos;
    }

    public ArrayList<E> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<E> productos) {
        this.productos = productos;
    }

    // Método para mostrar por pantalla los productos del almacen
    public void showProducts() {
        for (E producto : productos) {
            System.out.println(producto.getName());
        }
    }

    // Método para añadir productos al almacen
    public void addProduct(E producto) {
        productos.add(producto);
    }
}

