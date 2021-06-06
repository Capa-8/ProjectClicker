/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

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
public class NivelTest {
    
    public NivelTest() {
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
     * Test of aumentar method, of class Nivel.
     */
    @Test
    public void testAumentar() {
        System.out.println("aumentar");
        Nivel instance = new Nivel();
        instance.aumentar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiaNivel method, of class Nivel.
     */
    @Test
    public void testCambiaNivel() {
        System.out.println("cambiaNivel");
        int cantBTC = 0;
        int cantETH = 0;
        Nivel instance = new Nivel();
        boolean expResult = false;
        boolean result = instance.cambiaNivel(cantBTC, cantETH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
