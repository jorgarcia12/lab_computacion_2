package ej3;

public class Main {
    public static void main(String[] args) {
        //Creamos un almacen
        Almacen almacen1 = new Almacen();
        //Creamos productos
        Producto p1 = new Producto("Lavarropas", 15.99);
        Producto p2 = new Producto("Manteca", 18.99);
        Producto p3 = new Producto("Computadora", 20);
        Producto p4 = new Producto("Monitor", 40);

        //Agregamos los productos al almacen
        almacen1.addProduct(p1);
        almacen1.addProduct(p2);
        almacen1.addProduct(p3);
        almacen1.addProduct(p4);

        //Mostramos los productos del almacen
        almacen1.showProducts();
    }
}
