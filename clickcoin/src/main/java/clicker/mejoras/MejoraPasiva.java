/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.mejoras;

import clicker.Juego;
import clicker.ventana.VentanaMejoras;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Nacho
 */
public class MejoraPasiva implements Mejora {
    private int tiempo;
    private Juego juego;
    private int precio;
    private VentanaMejoras ventanaMejoras;
    private int cantPlacas;
    private int porcentaje;
    private int precioOC;
    
    
    public MejoraPasiva(Juego juego, VentanaMejoras ventanaMejoras, int precio){
        this.juego = juego;
        tiempo = 1000;
        this.precio = precio;
        this.ventanaMejoras = ventanaMejoras;
        this.juego.addMejoraP(this);
        cantPlacas = 0;
        porcentaje = 95;
        precioOC = 3;
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public void disparar() {
        if (juego.getEstadisticas().quitarBTC(precio) == true) {
            cantPlacas++;
            Timer timer = new Timer();
            TimerTask generateBTC = new TimerTask() {
                @Override
                public void run() {
                    juego.getEstadisticas().updateBTC(cantPlacas);
                    System.out.println(cantPlacas+" Placas de Video han generado" + juego.getEstadisticas().getMonedasBTC());
                }
            };
            timer.schedule(generateBTC, 1, tiempo);

            precio = precio * 3;
            ventanaMejoras.getBtnGraphCard().setText("Placa de Video (" + precio + " BTC)");
            
            
        }
    }
    
    public void checkPrecio(){
        if(juego.getEstadisticas().getMonedasBTC() >= precio){
            ventanaMejoras.getBtnGraphCard().setVisible(true);
        }else{
            ventanaMejoras.getBtnGraphCard().setVisible(false);
        }
        if (cantPlacas >= 1) {
            if (juego.getEstadisticas().getMonedasBTC() >= precioOC) {
                ventanaMejoras.getBtnOverclock().setVisible(true);
            } else {
                ventanaMejoras.getBtnOverclock().setVisible(false);
            }
        }
    }

    public int getCantPlacas() {
        return cantPlacas;
    }
    
    public void overclock(){
        if(cantPlacas >= 1){
            if (juego.getEstadisticas().quitarBTC(precio) == true){
            tiempo = tiempo * (porcentaje/100);
            porcentaje = porcentaje - 5;
            if(porcentaje == 0){
                porcentaje = 5;
            }
            precioOC = precioOC * 1;
            ventanaMejoras.getBtnOverclock().setText("Overclock (" + precioOC + " BTC)");
            }
        }       
    }
}