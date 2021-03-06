package clicker;

import clicker.enemigos.FabricaEnemigos;
import clicker.mejoras.*;
import clicker.moneda.*;
import clicker.ventana.VentanaAumentarNivel;
import clicker.ventana.VentanaJuegoBTC;
import javax.swing.JFrame;
import clicker.ventana.VentanaJuegoETH;
import clicker.ventana.VentanaMoneda;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private Jugador jugador;
    private Estadisticas estadisticas;
    private Nivel nivel;
    private Minado minado;
    private Moneda monedaBTC;
    private Moneda monedaETH;
    private FabricaEnemigos fabricaE;
    private ArrayList<MejoraActiva> mejorasActivas;
    private ArrayList<MejoraPasiva> mejorasPasivas;
    private VentanaMoneda ventana;
    private TimerTask tiempoEspera;
    private MejoraActiva mejoraActiva;
    private MejoraPasiva mejoraPasiva;

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

        mejorasActivas = new ArrayList<MejoraActiva>();
        mejorasPasivas = new ArrayList<MejoraPasiva>();

        mejoraActiva = new MejoraActiva(this, 1, 0.20f);
        mejoraPasiva = new MejoraPasiva(this, 0.50f);
    }

    public void iniciarJuego() {
        ventana = new VentanaJuegoBTC(this);
        ventana.setVisible(true);
        fabricaE.iniciar();

    }

    public void aumentarNivel() {
        if (this.nivel.cambiaNivel((int) this.getEstadisticas().getMonedasBTC(), (int) this.getEstadisticas().getMonedasETH())) {
            //fabricaE.pausa();
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
                    if (nivel == 3) {
                        VentanaJuegoETH vETH = new VentanaJuegoETH(juegoInstancia);
                        ventana = vETH;
                    }
                    ventana.setVisible(true);
                    //fabricaE.seguir();
                }

            };
            timer.schedule(tiempoEspera, 6000);
        }
    }

    public void setVentana(VentanaMoneda ventana) {
        this.ventana = ventana;
    }

    public MejoraActiva getMejoraActiva() {
        return mejoraActiva;
    }

    public MejoraPasiva getMejoraPasiva() {
        return mejoraPasiva;
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

    public void updateMejoras() {
        for (int i = 0; i < mejorasActivas.size(); i++) {
            mejorasActivas.get(i).checkPrecio();
        }
        for (int i = 0; i < mejorasPasivas.size(); i++) {
            mejorasPasivas.get(i).checkPrecio();
        }

    }

    public void addMejoraA(MejoraActiva mejoraActiva) {
        mejorasActivas.add(mejoraActiva);
    }

    public void addMejoraP(MejoraPasiva mejoraPasiva) {
        mejorasPasivas.add(mejoraPasiva);
    }

    public VentanaMoneda getVentana() {
        return ventana;
    }

    public ArrayList<MejoraPasiva> getMejorasPasivas() {
        return mejorasPasivas;
    }

}
