/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.moneda.Moneda;
import clicker.moneda.MonedaBTC;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nehemias
 */
public class MinadoTest {

    public MinadoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of realizarMinado method, of class Minado.
     */
    @Test
    public void testRealizarMinado() {
        System.out.println("realizarMinado");
        Jugador j = new Jugador("player1");
        Juego juego = new Juego(j);
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaBTC());
        Minado instance = juego.getMinado();
        instance.realizarMinado();

        float monedasBTC = juego.getEstadisticas().getMonedasBTC();
        assertEquals(0.01f, monedasBTC);
    }
}
