/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import clicker.observer.*;
import java.util.ArrayList;

import clicker.observer.*;
/**
 *
 * @author Nacho
 */
public class Estadisticas implements Observer, ObserverEnemigo, SubjectEstadisticas {

    private int cantMonedas;
    private int cantClicks;
    private int poder;
    private float cantMonedaBTC;
    private float cantMonedaETH;
//    private Moneda monedaBTC;
//    private Moneda monedaETH;
    private Subject monedaSubject;
    private SubjectEnemigo enemigoSubject;
    private ArrayList observers;

    public Estadisticas() {
        cantMonedas = 0;
        cantClicks = 0;
        cantMonedaBTC = 0;
        cantMonedaETH = 0;
        poder=1;
        observers = new ArrayList();
        //Inicializamos valores;        
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
        HuboCambios();
    }
    
    public void updateBTC(int num) {
        cantMonedaBTC += num;
        HuboCambios();
    }
    
    @Override
    public void updateETH() {
        cantMonedaETH += 0.01f;
        cantClicks += 1;
        HuboCambios();
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
    public boolean quitarBTC(float cantidad) {
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
    public void quitarETH(float cantidad) {
        if(cantMonedaETH>0){
            if(cantidad>=cantMonedaETH){
                cantMonedaETH =0;
                HuboCambios();
            }
            else{
                cantMonedaETH -= cantidad;
                HuboCambios();
            }
            
        }
    }
    
    public void HuboCambios() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverEstadisticas observer = (ObserverEstadisticas) observers.get(i);
            observer.update();
        }
    }

    @Override
    public void registerObserver(ObserverEstadisticas o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverEstadisticas o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
}
