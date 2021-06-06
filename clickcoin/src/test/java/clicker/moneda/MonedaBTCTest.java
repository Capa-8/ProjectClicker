/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.observer.Observer;
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
public class MonedaBTCTest {
    
    public MonedaBTCTest() {
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
     * Test of minar method, of class MonedaBTC.
     */
    @Test
    public void testMinar() {
        System.out.println("minar BTC");
        MonedaBTC instance = new MonedaBTC();
        instance.minar();
        assertEquals(1,instance.getMonedas());
    }

    /**
     * Test of notifyObservers method, of class MonedaBTC.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        MonedaBTC instance = new MonedaBTC();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerObserver method, of class MonedaBTC.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.registerObserver(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObserver method, of class MonedaBTC.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.removeObserver(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
