/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.mejoras.Mejora;
import clicker.moneda.Moneda;
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
public class JuegoTest {
    
    public JuegoTest() {
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
     * Test of aumentarNivel method, of class Juego.
     */
    @Test
    public void testAumentarNivel() {
        System.out.println("aumentarNivel");
        Juego instance = null;
        instance.aumentarNivel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinado method, of class Juego.
     */
    @Test
    public void testGetMinado() {
        System.out.println("getMinado");
        Juego instance = null;
        Minado expResult = null;
        Minado result = instance.getMinado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugador method, of class Juego.
     */
    @Test
    public void testGetJugador() {
        System.out.println("getJugador");
        Juego instance = null;
        Jugador expResult = null;
        Jugador result = instance.getJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadisticas method, of class Juego.
     */
    @Test
    public void testGetEstadisticas() {
        System.out.println("getEstadisticas");
        Juego instance = null;
        Estadisticas expResult = null;
        Estadisticas result = instance.getEstadisticas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaMejoras method, of class Juego.
     */
    @Test
    public void testGetListaMejoras() {
        System.out.println("getListaMejoras");
        Juego instance = null;
        Mejora[] expResult = null;
        Mejora[] result = instance.getListaMejoras();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonedaBTC method, of class Juego.
     */
    @Test
    public void testGetMonedaBTC() {
        System.out.println("getMonedaBTC");
        Juego instance = null;
        Moneda expResult = null;
        Moneda result = instance.getMonedaBTC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonedaETH method, of class Juego.
     */
    @Test
    public void testGetMonedaETH() {
        System.out.println("getMonedaETH");
        Juego instance = null;
        Moneda expResult = null;
        Moneda result = instance.getMonedaETH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNivel method, of class Juego.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Juego instance = null;
        Nivel expResult = null;
        Nivel result = instance.getNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
