package clicker.enemigos;

import java.util.Timer;
import java.util.TimerTask;


public abstract class Enemigo {
    float probabilidad;
    int roboEstandar;
    Juego juego;
    int vida;
    int vidaEstandar;
    int tiempo;
    boolean dead;
    private TimerTask tareaAtacar;
    
    
    /**El metodo nacer pausa a la fabrica para que no cree enemigos nuevos mientras
     * exista uno vivo, se llama a temporizador de ataques y ronda y se declara dead como falso
    */
    public void nacer(){
        juego.fabircEnemi.pausa();
        dead = false;
        vida = vidaEstandar;
        temporizadorRonda(tiempo);
        temporizadorAtaques();
    }
    
    /**El metodo atacar le quita una cantidad determinada de monedas al jugador
     */
    private void atacar(){
        
    }
    
    /**El metodo temporizador de ataques es el encargado de llamar a un ataque 
     * cada 1s siempre que el enemigo no halla muerto
     */
    private void temporizadorAtaques(){
        Timer timer = new Timer();
        tareaAtacar = new TimerTask(){
           @Override
           public void run(){
                atacar();
           }
       };
        timer.schedule(tareaAtacar, 1000,1000);
    }
    
    /**El metodo temporizador ronda es el tiempo por ronda que se tiene para matar
     * al enemigo, en caso de no matarse en ese tiempo establecido se crea un nuevo 
     * temporizador con un tiempo extra.
     */
    private void temporizadorRonda(int t){
       Timer timer = new Timer();
       TimerTask tarea = new TimerTask(){
           @Override
           public void run(){
               if(!dead){
               vida = vidaEstandar;
               incrementarTiempo();
               
               temporizadorRonda(tiempo);
               }
           }
       };
       timer.schedule(tarea, t*1000);
    }   
    
    
    public float getProbabilidad(){
        return probabilidad;
    }
    
    /**Este metodo no solo se encarga de matar al enemigo, sino que pone en marcha
     * nuevamente la fabrica y elimina el hilo temporizador de ataques.
    */
    private void matar(){
        dead = true;
        tareaAtacar.cancel();
        juego.fabircEnemi.seguir();
    }
    
    
    public void clcik(){
        vida--;
        if(vida<=0){
            matar();
        }
    }
    
    public abstract void incrementarTiempo();
}
