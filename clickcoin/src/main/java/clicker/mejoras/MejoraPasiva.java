/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.mejoras;

import clicker.Juego;

/**
 *
 * @author Nacho
 */
public class MejoraPasiva implements Mejora {
    private int tiempo;
    private Juego juego;
    
    public MejoraPasiva(Juego juego,int tiempo){
        this.juego = juego;
        this.tiempo = tiempo;
    }
    
    @Override
    public int getTiempo(){
        return tiempo;
    }
    
    public void checkPrecio(){
    }
}