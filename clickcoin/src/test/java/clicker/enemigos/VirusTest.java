/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.enemigos;

import clicker.Juego;
import clicker.Jugador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Nacho
 */
public class VirusTest {
    
    public VirusTest(){
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
        Virus instance = new Virus(juego);
        instance.nacer(true);
        instance.incrementarTiempo();
        assertEquals(26,instance.getTiempo());
        }
    }
