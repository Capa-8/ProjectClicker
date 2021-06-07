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
public class MonedaETH implements Moneda, Subject {

    public float valor;
    public int cantidad;
    private ArrayList observers;

    public MonedaETH() {
        cantidad = 0;
        valor = 0;
        observers = new ArrayList();
    }

    @Override
    public void minar() {
        cantidad += 1;
        monedasCambiadas();
    }
    
    public void monedasCambiadas() {
        notifyObservers();
    }
    
     @Override
     public int getMonedas(){
         return cantidad;
     }

     public ArrayList getObservers(){
        return observers;
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

    @Override
    public void notifyObservers() {
       for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updateETH();
        }
    }

 
}
