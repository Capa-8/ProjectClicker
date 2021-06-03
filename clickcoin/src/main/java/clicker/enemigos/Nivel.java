/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.enemigos;

/**
 *
 * @author Fabio Gazzoni
 */
public class Nivel {
     int nivel;
    
    public Nivel(){
        nivel=1;
    }
    
    public void subirNivel(){
        nivel++;
    }
    
    public int getNivel(){
        return nivel;
    }
}
