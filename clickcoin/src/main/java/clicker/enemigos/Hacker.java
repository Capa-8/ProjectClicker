package clicker.enemigos;

import clicker.Juego;
import java.util.ArrayList;

public class Hacker extends Enemigo{
    
    Hacker(Juego juego){
        this.juego = juego;
        roboEstandar = 10;
        probabilidad = 0.02f;
        vidaEstandar = 100;
        tiempo = 20;
        super.observers = new ArrayList();
        juego.getEstadisticas().initSubjectEnemigo(this);
    }

    
    @Override
    public void incrementarTiempo() {
        tiempoRonda = tiempo + 2*rondas;
    }
    
    @Override
    public String nombre(){
        return "Hacker";
    }

    

  

   
}
