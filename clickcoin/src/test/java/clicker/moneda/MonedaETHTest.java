/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.Juego;
import clicker.Jugador;
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
public class MonedaETHTest {
    
    public MonedaETHTest() {
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
     * Test of minar method, of class MonedaETH.
     */
    @Test
    public void testMinar() {
        System.out.println("minar ETH");
        Jugador jugador = new Jugador("test");
        Juego juego = new Juego(jugador);
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaETH());
        
        int i = 5;
        for (int j = 0; j < i; j++) {
            juego.getMinado().realizarMinado();
        }
        //El nivel de monedas debería estar en 5.
        float cantMonedasETH = juego.getEstadisticas().getMonedasETH();
        float esperado = 5;
        assertEquals(esperado, cantMonedasETH);
    }
    
     /**
     * Test of registerObserver method, of class MonedaBTC.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("removeObserver");
        Jugador jugador = new Jugador("test");
        Juego juego = new Juego(jugador);
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaETH());
        juego.getMinado().getMoneda().ge
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
