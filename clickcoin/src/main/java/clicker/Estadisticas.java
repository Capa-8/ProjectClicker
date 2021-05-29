/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;


import clicker.moneda.*;
import clicker.observer.Observer;
import clicker.observer.Subject;


/**
 *
 * @author Nacho
 */
public class Estadisticas implements Observer {

    private float cantMonedas;
    private int cantClicks;
    private Moneda monedaBTC;
    private Moneda monedaETH;
    private Subject monedaSubject;

    public Estadisticas() {
        this.cantMonedas = 0;
        this.cantClicks = 0;
        this.monedaBTC = new MonedaBTC();
        this.monedaETH = new MonedaETH();
    }

    public void initSubject(Subject monedaSubject) {
        this.monedaSubject = monedaSubject;
        this.monedaSubject.registerObserver(this);
    }

    @Override
    public void updateBTC() {
        
    }
    
     @Override
    public void updateETH() {

    }
    
    public void setMonedaBTC(Moneda monedaBTC) {
        this.monedaBTC = monedaBTC;
    }

    public void setMonedaETH(Moneda monedaETH) {
        this.monedaETH = monedaETH;
    }

    public Moneda getMonedaBTC() {
        return monedaBTC;
    }

    public Moneda getMonedaETH() {
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
