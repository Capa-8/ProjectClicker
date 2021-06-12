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
public class Estadisticas implements Observer, ObserverEnemigo {

    private int cantMonedas;
    private int cantClicks;
    private int cantMonedaBTC;
    private int cantMonedaETH;
//    private Moneda monedaBTC;
//    private Moneda monedaETH;
    private Subject monedaSubject;
    private SubjectEnemigo enemigoSubject;

    public Estadisticas() {
        cantMonedas = 0;
        cantClicks = 0;
        cantMonedaBTC = 0;
        cantMonedaETH = 0;
    }

    public void initSubject(Subject monedaSubject) {
        this.monedaSubject = monedaSubject;
        this.monedaSubject.registerObserver(this);
    }
    
    public void initSubjectEnemigo(SubjectEnemigo enemigoSubject){
         this.enemigoSubject = enemigoSubject;
        this.enemigoSubject.registerObserver(this);
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

    @Override
    public void quitarBTC() {
        if(cantMonedaBTC>0){
            cantMonedaBTC -= 1;
        }
    }

    @Override
    public void quitarETH() {
        if(cantMonedaETH>0){
            cantMonedaETH -= 1;
        }
    }
}
