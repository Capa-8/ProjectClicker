/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

/**
 *
 * @author Nacho
 */

public class Estadisticas {

    private float cantMonedas;
    private int cantClicks;
    
    public Estadisticas(){
        this.cantMonedas = 0;
        this.cantClicks = 0;
    }
    
    public void aumentarCantClicks(){
        this.cantClicks++;
    }
    
    public void aumentarCantMonedas(){
        this.cantMonedas+=0.01 ;
    }

    public float getMonedas(){
        return cantMonedas;                          
    }
    
    public int getClicks(){
        return cantClicks;                          
    }
}