/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

import clicker.observer.Observer;
import clicker.observer.Subject;
import java.util.ArrayList;

/**
 *
 * @author Nehemias
 */
public class MonedaBTC implements Moneda, Subject {
    
    public float cantidad;
    private ArrayList observers;
    private int poder;

    
    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public MonedaBTC() {
        cantidad = 0;
        observers = new ArrayList();
        poder = 1;
    }

    @Override
    public void minar() {
        cantidad = cantidad + poder;
        //System.out.println("Cantidad: "+cantidad+"  Poder: "+poder);
        monedasCambiadas();
    }

    public void monedasCambiadas() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updateBTC();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    
    public ArrayList getObservers(){
        return observers;
    }

    @Override
    public float getMonedas() {
        return cantidad;
    }

   
}
