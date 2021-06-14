/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.moneda.Moneda;
import clicker.observer.ObserverEnemigo;

/**
 *
 * @author Nacho
 */
public class Minado {

    private Juego juego;
    private Moneda moneda;

    public Minado(Juego juego) {
        this.juego = juego;
    }

    public void realizarMinado() {
        moneda.minar();
        juego.updateMejoras();
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    public Moneda getMoneda(){
        return this.moneda;
    }

  

  
}
