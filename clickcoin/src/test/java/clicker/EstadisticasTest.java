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
            instance.updateBTC();
        }
        assertEquals(5, instance.getMonedasBTC());
    }

    /**
     * Test of updateETH method, of class Estadisticas.
     */
    @Test
    public void testUpdateETH() {
        System.out.println("updateETH");
        Estadisticas instance = new Estadisticas();
        for (int i = 0; i < 5; i++) {
            instance.updateETH();
        }
        assertEquals(5, instance.getMonedasETH());
    }

    /**
     * Test of QuitarBTC method, of class Estadisticas.
     */
    @Test
    public void testQuitarBTC() {
        System.out.println("quitar BTC");
        Juego juego = new Juego(new Jugador("test"));
        juego.getEstadisticas().initSubject((MonedaBTC) juego.getMonedaBTC());
        int i = 5;
        for (int j = 0; j < i; j++) {
            juego.getMinado().realizarMinado();
        }

        ArrayList<Enemigo> enemigos = juego.getFabricaE().getEnemigos();
        Enemigo ene = enemigos.get(0);
        ene.atacar();

        float cantMonedasBTC = juego.getEstadisticas().getMonedasBTC();
        float esperado = 4;
        assertEquals(esperado, cantMonedasBTC);

    }
    
    /**
     * Test of QuitarETH method, of class Estadisticas.
     */
    @Test
    public void testQuitarETH() {
        System.out.println("quitar ETH");
        Juego juego = new Juego(new Jugador("test"));
        Moneda moneda = (MonedaETH) juego.getMonedaETH();
        juego.getMinado().setMoneda(moneda);
        juego.getEstadisticas().initSubject((MonedaETH) moneda);
        int i = 5;
        for (int j = 0; j < i; j++) {
            juego.getMinado().realizarMinado();
        }

      
        ArrayList<Enemigo> enemigos = juego.getFabricaE().getEnemigos();
        Enemigo ene = enemigos.get(0);
        ene.atacar();

        float cantMonedasETH = juego.getEstadisticas().getMonedasETH();
        float esperado = 4;
        assertEquals(esperado, cantMonedasETH);

    }
}
