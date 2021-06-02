/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import javax.swing.JButton;
import javax.swing.JLabel;
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
public class VentanaSalidaTest {
    
    public VentanaSalidaTest() {
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
     * Test of getBoton1 method, of class VentanaSalida.
     */
    @Test
    public void testGetBoton1() {
        System.out.println("getBoton1");
        VentanaSalida instance = new VentanaSalida();
        JButton expResult = null;
        JButton result = instance.getBoton1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoton2 method, of class VentanaSalida.
     */
    @Test
    public void testGetBoton2() {
        System.out.println("getBoton2");
        VentanaSalida instance = new VentanaSalida();
        JButton expResult = null;
        JButton result = instance.getBoton2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel1 method, of class VentanaSalida.
     */
    @Test
    public void testGetLabel1() {
        System.out.println("getLabel1");
        VentanaSalida instance = new VentanaSalida();
        JLabel expResult = null;
        JLabel result = instance.getLabel1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
