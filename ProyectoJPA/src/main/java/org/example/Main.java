package org.example;

import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        try {
            entityManager.getTransaction().begin();
            Domicilio dom1 = new Domicilio("Lemos", 59);
            Cliente client1 = new Cliente("Jorge", "Garcia Ojeda", 44662355, dom1);
            Factura factura1 = new Factura("10-12-2024", 10, 18000, client1);

            Categoria electrodomesticos = new Categoria("Electrodomesticos");
            Categoria cocina = new Categoria("Cocina");
            Categoria lacteos = new Categoria("Lacteos");

            Articulo art1 = new Articulo(10, "Lavadora", 15000);
            Articulo art2 = new Articulo(5, "Horno", 20000);
            Articulo art3 = new Articulo(2, "Leche", 2000);
            Articulo art4 = new Articulo(3, "Pan", 1000);
            Articulo art5 = new Articulo(1, "Queso", 1000);

            art1.getCategorias().add(electrodomesticos);
            electrodomesticos.getArticulos().add(art1);
            art2.getCategorias().add(electrodomesticos);
            electrodomesticos.getArticulos().add(art2);
            art2.getCategorias().add(cocina);
            cocina.getArticulos().add(art2);

            DetalleFactura det1 = new DetalleFactura();
            det1.setArticulo(art1);
            det1.setCantidad(2);
            det1.setSubtotal(30000);

            art1.getDetalleFacturas().add(det1);
            factura1.getDetalleFacturas().add(det1);
            det1.setFactura(factura1);

            DetalleFactura det2 = new DetalleFactura();
            det2.setArticulo(art2);
            det2.setCantidad(1);
            det2.setSubtotal(20000);

            art2.getDetalleFacturas().add(det2);
            factura1.getDetalleFacturas().add(det2);
            det2.setFactura(factura1);

            factura1.setTotal(50000);

            entityManager.persist(factura1);

            entityManager.flush();
            entityManager.getTransaction().commit();


        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
        entityManager.close();
        entityManagerFactory.close();
    }
}