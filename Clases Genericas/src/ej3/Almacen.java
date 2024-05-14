package ej3;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public Almacen(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    // Método para mostrar por pantalla los productos del almacen
    public void showProducts() {
        for (Producto producto : productos) {
            System.out.println(producto.getName());
        }
    }

    // Método para añadir productos al almacen
    public void addProduct(Producto producto) {
        productos.add(producto);
    }
}
