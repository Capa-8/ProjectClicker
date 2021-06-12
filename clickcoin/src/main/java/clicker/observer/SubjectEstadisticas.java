/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.observer;

/**
 *
 * @author Nacho
 */
public interface SubjectEstadisticas {
    public void registerObserver(ObserverEstadisticas o);

    public void removeObserver(ObserverEstadisticas o);

    public void notifyObservers();
}
