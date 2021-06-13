package clicker.enemigos;

import clicker.Juego;
import java.util.ArrayList;

public class Virus extends Enemigo{
    
    Virus(Juego juego){
        this.juego = juego;
        roboEstandar = 5;
        probabilidad = 0.05f;
        vidaEstandar = 50;
        tiempo = 25;
        super.observers = new ArrayList();
        juego.getEstadisticas().initSubjectEnemigo(this);
    }
    
    
    @Override
    public void incrementarTiempo(){
        tiempoRonda = tiempo + 1*rondas;
    }
    
    @Override
    public String nombre(){
        return "Virus";
    }
}