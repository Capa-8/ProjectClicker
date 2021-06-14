/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.mejoras;

import clicker.Juego;
import clicker.ventana.VentanaMejoras;

/**
 *
 * @author Nacho
 */
public class MejoraActiva implements Mejora{
    private int tiempo;
    private Juego juego;
    private int precio;
    private VentanaMejoras ventanaMejoras;
    
    public MejoraActiva(Juego juego,int tiempo, VentanaMejoras ventanaMejoras, int precio){
        this.juego = juego;
        this.tiempo = tiempo;
        this.precio = precio;
        this.ventanaMejoras = ventanaMejoras;
        this.juego.addMejoraA(this);
    }
    
    @Override
    public int getTiempo(){
        return tiempo;
    }
    
    public void disparar(){
            if(juego.getEstadisticas().quitarBTC(precio)==true){
                int poderActual;
                poderActual= juego.getMonedaBTC().getPoder();
                juego.getMonedaBTC().setPoder(poderActual*2);

                poderActual = juego.getEstadisticas().getPoder();
                juego.getEstadisticas().setPoder(poderActual*2);
                
                precio = precio * 5;
                ventanaMejoras.getBtnDuplicate().setText("Duplicar Monedas ("+precio+" BTC)");
            }
    }
    
    public void checkPrecio(){
        if(juego.getEstadisticas().getMonedasBTC() >= precio){
            ventanaMejoras.getBtnDuplicate().setVisible(true);
        }else{
            ventanaMejoras.getBtnDuplicate().setVisible(false);
        }
    }
}
