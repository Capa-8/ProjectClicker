/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.moneda.*;
import clicker.*;
import clicker.enemigos.Enemigo;
import clicker.enemigos.Virus;
import clicker.observer.Subject;
import clicker.observer.SubjectEnemigo;
import java.util.ArrayList;
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
public class EstadisticasTest {

    public EstadisticasTest() {
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
     * Test of initSubject method, of class Estadisticas.
     */
    @Test
    public void testInitSubject() {
        System.out.println("initSubject");
        Estadisticas instance = new Estadisticas();
        MonedaBTC moneda = new MonedaBTC();
        instance.initSubject((MonedaBTC) moneda);
        assertEquals(1, moneda.getObservers().size());
    }

    @Test
    public void testInitSubjectEnemigo() {
        System.out.println("initSubjectEnemigo");
        Juego juego = new Juego(new Jugador("test"));
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaBTC());

        ArrayList<Enemigo> enemigos = juego.getFabricaE().getEnemigos();
        assertEquals(3, enemigos.size());

    }

    /**
     * Test of updateBTC method, of class Estadisticas.
     */
    @Test
    public void testUpdateBTC() {
        System.out.println("updateBTC");
        Estadisticas instance = new Estadisticas();
        for (int i = 0; i < 5; i++) {
            instance.updateBTC(1.0f);
        }
        assertEquals(5.0, instance.getMonedasBTC());
    }

    /**
     * Test of updateETH method, of class Estadisticas.
     */
    @Test
    public void testUpdateETH() {
        System.out.println("updateETH");
        Estadisticas instance = new Estadisticas();
        for (int i = 0; i < 5; i++) {
            instance.updateETH(1.0f);
        }
        assertEquals(5.0, instance.getMonedasETH());
    }

    /**
     * Test of QuitarBTC method, of class Estadisticas.
     */
    @Test
    public void testQuitarBTC() {
        System.out.println("quitar BTC");
        Juego juego = new Juego(new Jugador("test"));
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaBTC());
        
        for (int j = 0; j < 10; j++) {
            juego.getMinado().realizarMinado();
        }
        
        juego.getEstadisticas().quitarBTC(0.1f);
//        int i = 200;
//        for (int j = 0; j < i; j++) {
//            juego.getMinado().realizarMinado();//aca un observer
//        }
//
//        ArrayList<Enemigo> enemigos = juego.getFabricaE().getEnemigos();
//        Enemigo ene = enemigos.get(2);
//        ene.atacar();

        assertEquals(0, juego.getEstadisticas().getMonedasBTC());

    }
    
    /**
     * Test of QuitarETH method, of class Estadisticas.
     */
    @Test
    public void testQuitarETH() {
System.out.println("quitar ETH");
        Juego juego = new Juego(new Jugador("test"));
        juego.getEstadisticas().initSubject((MonedaETH) juego.getMonedaETH());
        
        for (int j = 0; j < 10; j++) {
            juego.getMinado().realizarMinado();
        }
        
        juego.getEstadisticas().quitarETH(0.1f);
//        int i = 200;
//        for (int j = 0; j < i; j++) {
//            juego.getMinado().realizarMinado();//aca un observer
//        }
//
//        ArrayList<Enemigo> enemigos = juego.getFabricaE().getEnemigos();
//        Enemigo ene = enemigos.get(2);
//        ene.atacar();

        assertEquals(0, juego.getEstadisticas().getMonedasETH());

    }
}