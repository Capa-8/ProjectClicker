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
public class FabricaEnemigosTest {
    
    public FabricaEnemigosTest() {
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
     * Test of iniciar method, of class FabricaEnemigos.
     */
//    @Test
//    public void testIniciar() {
//        System.out.println("iniciar");
//        FabricaEnemigos instance = null;
//        instance.iniciar();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of pausa method, of class FabricaEnemigos.
     */
//    @Test
//    public void testPausa() {
//        System.out.println("pausa");
//        FabricaEnemigos instance = null;
//        instance.pausa();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of seguir method, of class FabricaEnemigos.
     */
//    @Test
//    public void testSeguir() {
//        System.out.println("seguir");
//        FabricaEnemigos instance = null;
//        instance.seguir();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testGetProbAtaqueNivel1(){
        System.out.println("Aumento de probabilidad de enemigo en nivel 1");
        Juego juego = new Juego(new Jugador("test"));
        float probabilidad = juego.getFabricaE().getProbAtaqueNivel();
        float esperado = 0;
        
        assertEquals(esperado, probabilidad);
    }
    
    @Test
    public void testGetProbAtaqueNivel(){
        System.out.println("Aumento de probabilidad de enemigo en nivel 3");
        Juego juego = new Juego(new Jugador("test"));
        juego.getNivel().aumentar();
        juego.getNivel().aumentar();
        
        float probabilidad = juego.getFabricaE().getProbAtaqueNivel();
        float esperado = 0.04f;
        
        assertEquals(esperado, probabilidad);
    }
}
