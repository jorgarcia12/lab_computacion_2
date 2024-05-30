package ej8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AerodromoMain {
    public static void main(String[] args) {
        // Crear tipos de avión
        TipoAvion tipoAvion1 = new TipoAvion(1, 200, 5000);
        TipoAvion tipoAvion2 = new TipoAvion(2, 150, 4000);

        // Crear hangares
        Hangar hangar1 = new Hangar(1, 10, "Ubicación 1");
        Hangar hangar2 = new Hangar(2, 15, "Ubicación 2");

        // Crear propietarios
        Propietario propietario1 = new Propietario("123456789", "Juan Pérez", "Calle Principal 123", "123456789");
        Propietario propietario2 = new Propietario("987654321", "María López", "Avenida Central 456", "987654321");

        // Crear aviones
        Avion avion1 = new Avion("ABC123", "Avión Tipo 1", hangar1, propietario1, new Date());
        Avion avion2 = new Avion("DEF456", "Avión Tipo 2", hangar2, propietario2, new Date());

        // Crear servicios
        Servicio servicio1 = new Servicio(new Date(), 5, "Mantenimiento");
        Servicio servicio2 = new Servicio(new Date(), 8, "Reparación");

        // Crear mecánicos
        List<String> tiposAvionMantenimiento = new ArrayList<>();
        tiposAvionMantenimiento.add("Avión Tipo 1");
        Mecanico mecanico1 = new Mecanico("999999999", "Carlos Gómez", "Calle Secundaria 789", "987654321", 2000, "Mañana", tiposAvionMantenimiento);

        // Crear pilotos
        List<String> tiposAvionAutorizado = new ArrayList<>();
        tiposAvionAutorizado.add("Avión Tipo 1");
        Piloto piloto1 = new Piloto("111111111", "Ana Martínez", "Avenida Secundaria 456", "123456789", "Licencia 123", tiposAvionAutorizado);

        // Mostrar información de los aviones
        System.out.println("Información de los aviones:");
        System.out.println(avion1);
        System.out.println(avion2);

        // Mostrar información de los mecánicos
        System.out.println("\nInformación de los mecánicos:");
        System.out.println(mecanico1);

        // Mostrar información de los pilotos
        System.out.println("\nInformación de los pilotos:");
        System.out.println(piloto1);
    }
}
