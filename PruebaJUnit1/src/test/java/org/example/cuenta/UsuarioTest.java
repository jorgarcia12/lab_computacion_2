package org.example.cuenta;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    @DisplayName("Probando la asignación y obtención del nombre del usuario")
    void testNombreUsuario() {
        Usuario user = new Usuario();
        user.setNombre("Jorge");
        assertEquals("Jorge", user.getNombre());
    }

    @Test
    @DisplayName("Probando la asignación y obtención de la edad del usuario")
    void testEdadUsuario() {
        Usuario user = new Usuario();
        user.setEdad(21);
        assertEquals(21, user.getEdad());

        assertFalse(user.getEdad()<0);
    }
}
