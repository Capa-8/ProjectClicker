package clicker;

import clicker.enemigos.FabricaEnemigos;
import clicker.mejoras.*;
import clicker.moneda.*;
import clicker.ventana.VentanaJuegoBTC;

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
    private ArrayList<Mejora> mejorasObtenidas;

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
        mejorasObtenidas = new ArrayList<Mejora>();
    }

    public void iniciarJuego() {
        VentanaJuegoBTC vBTC = new VentanaJuegoBTC(this);
        vBTC.setVisible(true);
        fabricaE.iniciar();
    }

    public int aumentarNivel() {
        return this.nivel.aumentar();
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
    
    public Nivel getNivel(){
        return nivel;
    }
    
    public FabricaEnemigos getFabricaE(){
        
        return fabricaE;
    }

    
    public void updateMejoras() {
        for(int i=0; i<mejorasObtenidas.size(); i++){
            mejorasObtenidas.get(i).checkPrecio();
        }
            
    }
    
    public void addMejora(MejoraActiva mejoraActiva){
        mejorasObtenidas.add(mejoraActiva);
    }
    
}
