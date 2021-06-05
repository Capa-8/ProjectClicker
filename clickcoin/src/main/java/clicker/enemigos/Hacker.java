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
public class Hacker extends Enemigo{
    
    Hacker(Juego juego){
        this.juego = juego;
        roboEstandar = 10;
        probabilidad = 0.02f;
        vidaEstandar = 100;
        tiempo = 25;
    }

    
    @Override
    public void incrementarTiempo() {
       tiempo = tiempo + 2;
    }
    
    @Override
    public String nombre(){
        return "Hacker";
    }
}
