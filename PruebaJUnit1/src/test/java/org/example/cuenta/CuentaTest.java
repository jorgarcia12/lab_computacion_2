package org.example.cuenta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    @DisplayName("Probando el nombre")
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Pepe", 10000);

        String esperado = "Pepe";
        String ingresado = cuenta.getPersona();
        Assertions.assertEquals(esperado, ingresado);
//        Assertions.assertTrue(ingresado.equals("Pepe"));
    }

    @Test
    @DisplayName("Probando que el saldo sea mayor a cero y not null")
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Pepe", 10000);
        assertNotNull(cuenta.getSaldo());
        assertEquals(10000,cuenta.getSaldo());
        assertFalse(cuenta.getSaldo()<0);
        assertTrue(cuenta.getSaldo()>0);

    }
}

