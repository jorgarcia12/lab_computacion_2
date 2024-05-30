package ej7;

import java.util.Date;
import java.util.List;

public class CampeonatoEsqui {
    public static void main(String[] args) {
        // Ejemplo de creación de objetos y uso del campeonato de esquí
        FederacionEsqui federacion1 = new FederacionEsqui("Federación 1", 1000);
        FederacionEsqui federacion2 = new FederacionEsqui("Federación 2", 800);

        EstacionEsqui estacion1 = new EstacionEsqui("EST001", "Estación 1", "Contacto1", "Dirección1", "123456789",
                50, 10);
        EstacionEsqui estacion2 = new EstacionEsqui("EST002", "Estación 2", "Contacto2", "Dirección2", "987654321",
                60, 8);

        PistaEsqui pista1 = new PistaEsqui("EST001", 1, 5.0, DificultadPista.VERDE);
        PistaEsqui pista2 = new PistaEsqui("EST001", 2, 3.5, DificultadPista.AZUL);
        PistaEsqui pista3 = new PistaEsqui("EST002", 1, 4.0, DificultadPista.ROJA);
        PistaEsqui pista4 = new PistaEsqui("EST002", 2, 4.5, DificultadPista.NEGRA);

        PruebaEsqui prueba1 = new PruebaEsqui("Prueba1", "Fondo", new Date(), new Date(), "Participante1", 100.0);
        PruebaEsqui prueba2 = new PruebaEsqui("Prueba2", "Slalom", new Date(), new Date(), "Participante2", 50.0);

        Participante participante1 = new Participante("Prueba1", "001", "12345678A", "Juan", new Date(), 30);
        Participante participante2 = new Participante("Prueba2", "002", "87654321B", "María", new Date(), 25);

        EquipoEsqui equipo1 = new EquipoEsqui("EQ001", "Entrenador1", List.of("Juan", "Ana", "Carlos"));
        EquipoEsqui equipo2 = new EquipoEsqui("EQ002", "Entrenador2", List.of("María", "Pedro", "Sofía"));
    }
}
