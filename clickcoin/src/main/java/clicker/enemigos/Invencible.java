package clicker.enemigos;

import clicker.Juego;

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
    
    @Override
    public String nombre(){
        return "Invencible";
    }
}
