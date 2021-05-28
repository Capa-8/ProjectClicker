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
public class Minado {
    
    private Juego juego;
    
    public Minado(Juego juego){
        this.juego = juego;
    }
    
    public void minar(){
        this.juego.getEstadisticas().aumentarCantMonedas();
        this.juego.getEstadisticas().aumentarCantClicks();
    }
}
