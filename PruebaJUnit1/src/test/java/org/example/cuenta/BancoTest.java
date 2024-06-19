package org.example.cuenta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BancoTest {

    private Banco banco;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        banco.agregarCuenta("12345", 1000.0); 
    }

    @Test
    @DisplayName("Agregar cuenta con saldo inicial")
    void testAgregarCuenta() {
        banco.agregarCuenta("67890", 500.0);
        assertEquals(500.0, banco.consultarSaldo("67890"));
    }

    @Test
    @DisplayName("Consultar saldo de cuenta existente")
    void testConsultarSaldoCuentaExistente() {
        double saldo = banco.consultarSaldo("12345");
        assertEquals(1000.0, saldo);
    }

    @Test
    @DisplayName("Consultar saldo de cuenta inexistente")
    void testConsultarSaldoCuentaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.consultarSaldo("00000");
        });
    }

    @Test
    @DisplayName("Depositar en cuenta existente")
    void testDepositar() {
        banco.depositar("12345", 200.0);
        assertEquals(1200.0, banco.consultarSaldo("12345"));
    }

    @Test
    @DisplayName("Depositar en cuenta inexistente")
    void testDepositarCuentaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("00000", 200.0);
        });
    }

    @Test
    @DisplayName("Depositar monto negativo")
    void testDepositarMontoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("12345", -200.0);
        });
    }

    @Test
    @DisplayName("Retirar de cuenta existente")
    void testRetirar() {
        banco.retirar("12345", 200.0);
        assertEquals(800.0, banco.consultarSaldo("12345"));
    }

    @Test
    @DisplayName("Retirar de cuenta inexistente")
    void testRetirarCuentaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("00000", 200.0);
        });
    }

    @Test
    @DisplayName("Retirar monto negativo")
    void testRetirarMontoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("12345", -200.0);
        });
    }

    @Test
    @DisplayName("Retirar saldo insuficiente")
    void testRetirarSaldoInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("12345", 2000.0);
        });
    }
}
