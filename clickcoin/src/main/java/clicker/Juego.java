package clicker;

import clicker.enemigos.FabricaEnemigos;
import clicker.mejoras.*;
import clicker.moneda.*;
import clicker.ventana.VentanaJuegoBTC;

public class Juego {

    private Jugador jugador;
    private Estadisticas estadisticas;
    private Mejora[] mejorasObtenidas;
    private Nivel nivel;
    private Minado minado;
    private Moneda monedaBTC;
    private Moneda monedaETH;
    private FabricaEnemigos fabricaE;

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

        iniciarJuego();
    }

    private void iniciarJuego() {
        VentanaJuegoBTC vBTC = new VentanaJuegoBTC(this);
        vBTC.setVisible(true);
        fabricaE.iniciar();
    }

    public void aumentarNivel() {
        this.nivel.aumentar();
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
    
    public Nivel getNivel(){
        return nivel;
    }
    
    public FabricaEnemigos getFabricaE(){
        return fabricaE;
    }
}
