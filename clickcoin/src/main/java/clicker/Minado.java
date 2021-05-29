/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.moneda.Moneda;

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

    public Moneda realizarMinado() {
        //this.juego.getEstadisticas().aumentarCantMonedas(); no tendria que hacer esto, sino incrementar el objeto moneda
        juego.getEstadisticas().aumentarCantClicks();
        moneda.minar();
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    public Moneda getMoneda(){
        return this.moneda;
    }
}
