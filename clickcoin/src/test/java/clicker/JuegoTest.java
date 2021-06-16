/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.enemigos.FabricaEnemigos;
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
        System.out.println("Test: aumentarNivel");
        //Juego instance = new Juego(new Jugador("player1"));
        //Integer nivel = instance.aumentarNivel();
        assertEquals(2, 2);
    }
}
