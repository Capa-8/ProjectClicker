/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.Juego;
import clicker.Jugador;
import clicker.observer.Observer;
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
    public void testMinar(){
        System.out.println("minar EtH");
        Jugador jugador = new Jugador("test");
        Juego juego = new Juego(jugador);
        juego.getEstadisticas().initSubject((MonedaETH) juego.getMonedaETH());
        juego.getMinado().setMoneda((Moneda)juego.getMonedaETH());
        juego.getMinado().realizarMinado();

        float cantMonedasETH = juego.getMonedaETH().getMonedas();
        float esperado = 0.01f;
        assertEquals(esperado, cantMonedasETH);
       
    }
    
     /**
     * Test of registerObserver method, of class MonedaBTC.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserverETH");
        Jugador jugador = new Jugador("test");
        Juego juego = new Juego(jugador);
        juego.getMinado().setMoneda((MonedaETH) juego.getMonedaETH());
        juego.getEstadisticas().initSubject((MonedaETH) juego.getMonedaETH());
        MonedaETH monedaETH = (MonedaETH) juego.getMinado().getMoneda();
        int cantObservers = monedaETH.getObservers().size();
        assertEquals(1, cantObservers);
    }

    /**
     * Test of removeObserver method, of class MonedaBTC.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserverETH");
        Observer o = null;
        MonedaBTC instance = new MonedaBTC();
        instance.registerObserver(o);
        instance.removeObserver(o);
        assertEquals(0,instance.getObservers().size());
    }    
}
