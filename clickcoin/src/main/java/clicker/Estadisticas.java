/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;


import clicker.observer.*;

/**
 *
 * @author Nacho
 */
public class Estadisticas implements Observer {

    private int cantMonedas;
    private int cantClicks;
    private int cantMonedaBTC;
    private int cantMonedaETH;
//    private Moneda monedaBTC;
//    private Moneda monedaETH;
    private Subject monedaSubject;

    public Estadisticas() {
        cantMonedas = 0;
        cantClicks = 0;
        cantMonedaBTC = 0;
        cantMonedaETH = 0;
//        this.monedaBTC = new MonedaBTC();
//        this.monedaETH = new MonedaETH();
    }

    public void initSubject(Subject monedaSubject) {
        this.monedaSubject = monedaSubject;
        this.monedaSubject.registerObserver(this);
    }

    @Override
    public void updateBTC() {
        cantMonedaBTC += 1;
        cantClicks += 1;
    }
    
    @Override
    public void updateETH() {
        cantMonedaETH += 1;
        cantClicks += 1;
    }
    
//    public void setMonedaBTC(Moneda monedaBTC) {
//        this.monedaBTC = monedaBTC;
//    }
//
//    public void setMonedaETH(Moneda monedaETH) {
//        this.monedaETH = monedaETH;
//    }

    public float getMonedasBTC() {
        return cantMonedaBTC;
    }

    public float getMonedasETH() {
        return cantMonedaETH;
    }

    public float getMonedas() {
        return cantMonedas;
    }

    public int getClicks() {
        return cantClicks;
    }
}
