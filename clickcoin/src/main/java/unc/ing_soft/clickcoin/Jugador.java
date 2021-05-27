/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unc.ing_soft.clickcoin;

import unc.ing_soft.clickcoin.Observer.*;
/**
 *
 * @author Nehemias
 */
public class Jugador implements Observer {
    private Subject pasivo;
    
    
    public Jugador() {
        
    }
   
    public void mejoraPasiva(Subject pasivo){
        this.pasivo = pasivo;
    }
    
    @Override
    public void update(){
        
    }
    
}
