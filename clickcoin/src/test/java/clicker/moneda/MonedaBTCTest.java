/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.observer.Observer;
import clicker.*;
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
        Estadisticas e = new Estadisticas();
        instance.registerObserver(e);
        instance.notifyObservers();
        assertEquals(1,e.getMonedasBTC());
    }

    /**
     * Test of registerObserver method, of class MonedaBTC.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("removeObserver");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.registerObserver(o);
        assertEquals(1,instance.getObservers().size());
    }

    /**
     * Test of removeObserver method, of class MonedaBTC.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.registerObserver(o);
        instance.removeObserver(o);
        assertEquals(0,instance.getObservers().size());
    }    
}
