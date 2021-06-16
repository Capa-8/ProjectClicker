/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.observer;

/**
 *
 * @author Nehemias
 */
public interface SubjectEnemigo {
    public void registerObserver(ObserverEnemigo o);

    public void removeObserver(ObserverEnemigo o);

    public void notifyObservers();
}
