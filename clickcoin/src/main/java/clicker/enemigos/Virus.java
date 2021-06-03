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
public class Virus extends Enemigo{
    
    Virus(Juego juego){
        this.juego = juego;
        roboEstandar = 5;
        probabilidad = 0.05f;
        vidaEstandar = 50;
        tiempo = 30;
    }
    
    
    @Override
    public void incrementarTiempo(){
        tiempo = tiempo + 1;
    }
}