/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.enemigos;

/**
 *
 * @author Fabio Gazzoni
 */
public class Invencible extends Enemigo{
    
    Invencible(Juego juego){
        this.juego = juego;
        roboEstandar = 15;
        probabilidad = 0.0001f;
        vidaEstandar = 120;
        tiempo = 20;
    }
    
    
    @Override
    public void incrementarTiempo() {
        tiempo = tiempo + 3;
    }
}
