/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.observer.Subject;
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
public class EstadisticasTest {
    
    public EstadisticasTest() {
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
     * Test of initSubject method, of class Estadisticas.
     */
    @Test
    public void testInitSubject() {
        System.out.println("initSubject");
        Subject monedaSubject = null;
        Estadisticas instance = new Estadisticas();
        instance.initSubject(monedaSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBTC method, of class Estadisticas.
     */
    @Test
    public void testUpdateBTC() {
        System.out.println("updateBTC");
        Estadisticas instance = new Estadisticas();
        instance.updateBTC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateETH method, of class Estadisticas.
     */
    @Test
    public void testUpdateETH() {
        System.out.println("updateETH");
        Estadisticas instance = new Estadisticas();
        instance.updateETH();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

    /**
     * Test of aumentarCantClicks method, of class Estadisticas.
     */
    @Test
    public void testAumentarCantClicks() {
        System.out.println("aumentarCantClicks");
        Estadisticas instance = new Estadisticas();
        instance.aumentarCantClicks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentarCantMonedas method, of class Estadisticas.
     */
    @Test
    public void testAumentarCantMonedas() {
        System.out.println("aumentarCantMonedas");
        Estadisticas instance = new Estadisticas();
        instance.aumentarCantMonedas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
