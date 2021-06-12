package clicker.enemigos;

import clicker.Juego;
import clicker.observer.ObserverEnemigo;
import clicker.observer.SubjectEnemigo;
import clicker.ventana.VentanaEnemigo;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Enemigo implements SubjectEnemigo {

    float probabilidad;
    int roboEstandar;
    Juego juego;
    int vida;
    int vidaEstandar;
    int tiempo;
    int tiempoRonda;
    boolean dead;
    private TimerTask tareaRestar;
    VentanaEnemigo ventana;
    protected ArrayList observers;

    /**
     * El metodo nacer pausa a la fabrica para que no cree enemigos nuevos
     * mientras exista uno vivo, se llama a temporizador de ataques y ronda y se
     * declara dead como falso
     */
    public void nacer() {
        juego.getFabricaE().pausa();
        dead = false;
        vida = vidaEstandar;
        tiempoRonda = tiempo;
        ventana = new VentanaEnemigo(this);
        temporizadorRonda(tiempo);
        temporizadorTiempo();
        
    }

    /**
     * El metodo atacar le quita una cantidad determinada de monedas al jugador
     */
    public void atacar() {
        notifyObservers();
    }

    /**
     * El metodo temporizador de tiempo es el encargado de llevar el conteo restante
     * de la ronda para visualizar en la ventana enemigo, esto se hace en esta 
     * clase para la correcta sincronizacion con la ventana
     */
    public void temporizadorTiempo() {
        Timer timer = new Timer();
        tareaRestar = new TimerTask() {
            @Override
            public void run() {
                tiempoRonda--;
            }
        };
        timer.schedule(tareaRestar, 1000, 1000);
    }

    /**
     * El metodo temporizador ronda es el tiempo por ronda que se tiene para
     * matar al enemigo, en caso de no matarse en ese tiempo establecido se crea
     * un nuevo temporizador con un tiempo extra y el enemigo procede a atacar.
     */
    private void temporizadorRonda(int t) {
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (!dead) {
                    vida = vidaEstandar;
                    atacar();
                    incrementarTiempo();
                    reiniciarVentana();
                    temporizadorRonda(tiempo);
                }
            }
        };
        timer.schedule(tarea, t * 1000);
    }

    /**
     * El metodo reiniciarVentana como su nombre indica realiza un "parpadeo" de
     * ventana y a su vez reinicia el contador de tiempo que sera mostrado en la
     * ventana
     */
    private void reiniciarVentana() {
        ventana.setVisible(false);
        ventana.setVisible(true);
        tiempoRonda = tiempo;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    /**
     * Este metodo no solo se encarga de matar al enemigo, sino que pone en
     * marcha nuevamente la fabrica y elimina el hilo temporizador de ataques.
     */
    private void matar() {
        dead = true;
        tareaRestar.cancel();
        ventana.matar();

        juego.getFabricaE().seguir();

        ventana.setVisible(false);
    }

    public int getTiempo() {
        return this.tiempoRonda;
    }

    public int getVida() {
        return vida;
    }

    public void clcik() {
        vida--;
        if (vida <= 0) {
            matar();
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverEnemigo observer = (ObserverEnemigo) observers.get(i);
            observer.quitarBTC(roboEstandar*tiempo);
            observer.quitarETH(roboEstandar*tiempo);
        }
    }

    @Override
    public void registerObserver(ObserverEnemigo o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverEnemigo o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public abstract void incrementarTiempo();

    public abstract String nombre();
}
