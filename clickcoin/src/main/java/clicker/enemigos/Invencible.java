package clicker.enemigos;

import clicker.Juego;
import java.util.ArrayList;

public class Invencible extends Enemigo{
    
    Invencible(Juego juego){
        this.juego = juego;
        roboEstandar = 0.15f;
        probabilidad = 0.0001f;
        vidaEstandar = 120;
        tiempo = 20;
        
        super.observers = new ArrayList();
        juego.getEstadisticas().initSubjectEnemigo(this);
    }
    
    
    @Override
    public void incrementarTiempo() {
        tiempoRonda = tiempo + 3*rondas;
    }
    
    @Override
    public String nombre(){
        return "Invencible";
    }
}
