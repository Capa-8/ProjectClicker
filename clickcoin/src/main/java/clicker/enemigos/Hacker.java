package clicker.enemigos;

import clicker.Juego;

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
