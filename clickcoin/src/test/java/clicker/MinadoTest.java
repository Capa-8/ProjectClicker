/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

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
        Minado instance = null;
        instance.realizarMinado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoneda method, of class Minado.
     */
    @Test
    public void testSetMoneda() {
        System.out.println("setMoneda");
        Moneda moneda = null;
        Minado instance = null;
        instance.setMoneda(moneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoneda method, of class Minado.
     */
    @Test
    public void testGetMoneda() {
        System.out.println("getMoneda");
        Minado instance = null;
        Moneda expResult = null;
        Moneda result = instance.getMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}