/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.moneda.Moneda;

/**
 *
 * @author Nacho
 */
public class Estadisticas {

    private float cantMonedas;
    private int cantClicks;
    private Moneda monedaBTC;
    private Moneda monedaETH;

    public Estadisticas() {
        this.cantMonedas = 0;
        this.cantClicks = 0;
    }
    
    public void setMonedaBTC(Moneda monedaBTC){
        this.monedaBTC = monedaBTC;
    }
    
    public void setMonedaETH(Moneda monedaETH){
        this.monedaETH = monedaETH;
    }
    
    public Moneda getMonedaBTC(){
        return monedaBTC;
    }
    
    public Moneda getMonedaETH(){
        return monedaETH;
    }

    public void aumentarCantClicks() {
        this.cantClicks++;
    }

    public void aumentarCantMonedas() {
        this.cantMonedas += 0.01;
    }

    public float getMonedas() {
        return cantMonedas;
    }

    public int getClicks() {
        return cantClicks;
    }
}
