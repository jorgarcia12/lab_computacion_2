package ej5;

public class Main {
    public static void main(String[] args) {
        // Crear algunos platos
        Plato plato1 = new Plato("Pizza");
        Plato plato2 = new Plato("Sushi");

        // Crear un restaurante y agregar platos y sucursal
        Restaurante restaurante = new Restaurante("La Pizzería");
        restaurante.agregarPlato(plato1);
        restaurante.agregarPlato(plato2);
        Sucursal sucursal = new Sucursal("Av. Principal 123", restaurante);

        // Crear una persona y agregar platos gustados
        Persona persona = new Persona("Juan");
        persona.agregarPlatoGustado(plato1);

        // Mostrar los platos gustados de la persona
        System.out.println("A " + persona.getNombre() + " le gustan los siguientes platos:");
        for (Plato plato : persona.getPlatosGustados()) {
            System.out.println("- " + plato.getNombre());
        }

        // Mostrar los platos ofrecidos por el restaurante y la dirección de la sucursal
        System.out.println("\nEn " + restaurante.getNombre() + " se ofrecen los siguientes platos:");
        for (Plato plato : restaurante.obtenerPlatos()) {
            System.out.println("- " + plato.getNombre());
        }
        System.out.println("\nLa sucursal está ubicada en: " + sucursal.getDireccion());
    }
}
