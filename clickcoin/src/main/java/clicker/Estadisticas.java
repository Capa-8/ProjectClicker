/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.observer.Observer;
import clicker.observer.Subject;

/**
 *
 * @author Nacho
 */
public class Estadisticas implements Observer {

    private int cantClicks;
    private int cantMonedaBTC;
    private int cantMonedaETH;
    private Subject monedaSubject;

    public Estadisticas() {
        cantClicks = 0;
        cantMonedaBTC = 0;
        cantMonedaETH = 0;
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

    public int getMonedasBTC() {
        return cantMonedaBTC;
    }

    public int getMonedasETH() {
        return cantMonedaETH;
    }

    public void aumentarCantClicks() {
        cantClicks++;
    }

    public int getClicks() {
        return cantClicks;
    }
}
