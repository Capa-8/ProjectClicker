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
public class MejoraPasiva implements Mejora {
    private int tiempo;
    private Juego juego;
    private int precio;
    private VentanaMejoras ventanaMejoras;
    
    public MejoraPasiva(Juego juego,int tiempo, VentanaMejoras ventanaMejoras){
        this.juego = juego;
        this.tiempo = tiempo;
        precio = 1;
        this.ventanaMejoras = ventanaMejoras;
        this.juego.addMejora(this);
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public void mejora1(){        
        
        if(juego.getEstadisticas().getMonedas() > 100){
         
            
        }
        System.out.println("Cant mon: "+juego.getEstadisticas().getMonedasBTC());
    }
    
    public void checkPrecio(){
        if(juego.getEstadisticas().getMonedasBTC() > precio){
            ventanaMejoras.getButDuplicator().setVisible(true);
        }else{
            ventanaMejoras.getButDuplicator().setVisible(false);
        }
    }
    
}