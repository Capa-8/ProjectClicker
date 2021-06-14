package clicker;

import clicker.enemigos.FabricaEnemigos;
import clicker.mejoras.*;
import clicker.moneda.*;
import clicker.ventana.VentanaAumentarNivel;
import clicker.ventana.VentanaJuegoBTC;
import javax.swing.JFrame;
import clicker.ventana.VentanaJuegoETH;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Juego {

    private Jugador jugador;
    private Estadisticas estadisticas;
    private Mejora[] mejorasObtenidas;
    private Nivel nivel;
    private Minado minado;
    private Moneda monedaBTC;
    private Moneda monedaETH;
    private FabricaEnemigos fabricaE;
    private JFrame ventana;
    private TimerTask tiempoEspera;

    public Juego(Jugador jugador) {
        this.jugador = jugador;
        Estadisticas estadisticas = new Estadisticas();
        this.estadisticas = estadisticas;
        this.nivel = new Nivel();
        this.monedaBTC = new MonedaBTC();
        this.monedaETH = new MonedaETH();
        Minado oMinado = new Minado(this);
        fabricaE = new FabricaEnemigos(this);

        oMinado.setMoneda(this.monedaBTC);

        this.minado = oMinado;

    }

    public void iniciarJuego() {
        ventana = new VentanaJuegoBTC(this);
        ventana.setVisible(true);
        fabricaE.iniciar();
        
    }

    public void aumentarNivel() {
        if (this.nivel.cambiaNivel((int) this.getEstadisticas().getMonedasBTC(), (int) this.getEstadisticas().getMonedasETH())) {
            fabricaE.pausa();
            this.nivel.aumentar();
            ventana.setVisible(false);
            VentanaAumentarNivel vNiv = new VentanaAumentarNivel(this);
            vNiv.showGIF();
            
            Integer nivel = this.getNivel().getNumeroNivel();
            Juego juegoInstancia = this;
            Timer timer = new Timer();
            tiempoEspera = new TimerTask() {
                @Override
                public void run() {
                    vNiv.cerrarTodo();
                    fabricaE.iniciar();
                    if (nivel == 3) {
                        VentanaJuegoETH vETH = new VentanaJuegoETH(juegoInstancia);
                        ventana = vETH;
                    }
                    ventana.setVisible(true);
                }

            };
            timer.schedule(tiempoEspera, 6000);
        }
    }
    
    public void setVentana(JFrame ventana){
        this.ventana = ventana;
    }

    /**
     * Valida si el jugador llego al la cantidad de monedas necesarias para el
     * superar de nivel
     */
    public Minado getMinado() {
        return this.minado;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public Mejora[] getListaMejoras() {
        return mejorasObtenidas;
    }

    public Moneda getMonedaBTC() {
        return monedaBTC;
    }

    public Moneda getMonedaETH() {
        return monedaETH;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public FabricaEnemigos getFabricaE() {

        return fabricaE;
    }
    
    public JFrame getVentana(){
        return ventana;
    }
}
