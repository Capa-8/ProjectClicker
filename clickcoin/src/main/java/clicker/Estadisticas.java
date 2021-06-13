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
    private int poder;
//    private Moneda monedaBTC;
//    private Moneda monedaETH;
    private Subject monedaSubject;
    private SubjectEnemigo enemigoSubject;

    public Estadisticas() {
        cantMonedas = 0;
        cantClicks = 0;
        cantMonedaBTC = 0;
        cantMonedaETH = 0;
        poder=1;
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
        cantMonedaBTC += poder;
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


    public boolean quitarBTC(int cantidad) {
        if(cantMonedaBTC>0){
            cantMonedaBTC -= cantidad;
            if(cantMonedaBTC<0){
                cantMonedaBTC=0;
            }
            System.out.println("BTC:"+cantMonedaBTC);
            return true;
        }
        return false;
    }

    @Override
    public void quitarETH(int cantidad) {
        if(cantMonedaETH>0){
            if(cantidad>=cantMonedaETH)
                cantMonedaETH =0;
            else
            cantMonedaETH -= cantidad;
        }
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
}
