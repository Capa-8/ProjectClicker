/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.enemigos;

import clicker.Juego;
import clicker.Jugador;
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
public class HackerTest {
    
    public HackerTest() {
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
     * Test of incrementarTiempo method, of class Hacker.
     */
    @Test
    public void testIncrementarTiempo() {
        System.out.println("incrementarTiempo");
        Jugador j = new Jugador("Player");
        Juego juego = new Juego(j);
        Hacker instance = new Hacker(juego);
        instance.nacer(true);
        instance.incrementarTiempo();
        assertEquals(22,instance.getTiempo());
        }
    }
    /**
     * Test of nombre method, of class Hacker.
     */
//    @Test
//    public void testNombre() {
//        System.out.println("nombre");
//        Hacker instance = null;
//        String expResult = "";
//        String result = instance.nombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
