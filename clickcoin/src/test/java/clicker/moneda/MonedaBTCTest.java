/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.Juego;
import clicker.Jugador;
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
        System.out.println("minar Btc");
        Jugador jugador = new Jugador("test");
        Juego juego = new Juego(jugador);
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaBTC());
        juego.getMinado().realizarMinado();
        
        //El nivel de monedas debería estar en 5.
        float cantMonedasBTC = juego.getEstadisticas().getMonedasBTC();
        float esperado = 0.01f;
        assertEquals(esperado, cantMonedasBTC);
       
    }

    /**
     * Test of registerObserver method, of class MonedaBTC.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserverBTC");
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
        System.out.println("removeObserverBTC");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.registerObserver(o);
        instance.removeObserver(o);
        assertEquals(0,instance.getObservers().size());
    }    
}
