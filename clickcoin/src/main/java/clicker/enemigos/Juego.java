/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.enemigos;
    

public class Juego {
    Nivel nivel;
    FabricaEnemigos fabircEnemi = new FabricaEnemigos(this);
    
    public Juego(){
        nivel = new Nivel();
    }

    public void play(){
        fabircEnemi.iniciar();
    }
}