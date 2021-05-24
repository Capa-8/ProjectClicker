/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unc.ing_soft.clickcoin;

import unc.ing_soft.clickcoin.Ventanas.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author Nehemias
 */
public class Juego {
    private VentanaJuego m1;
//    private VentanaMejoras vm1;
//    private VentanaEstadisticas ve1;
    private String name;

    public Juego(String name) {
        VentanaJuego m1 = new VentanaJuego();
        this.m1 = m1;
//    VentanaMejoras vm1 = new VentanaMejoras();
//    this.vm1 = vm1;
//    VentanaEstadisticas ve1 = new VentanaEstadisticas();
//    this.ve1 = ve1;
    }

    public void iniciarJuego(){
        this.m1.setVisible(true);

    }

    public void aumentarCuenta(){
        //m1.aumentarCuenta();
    }

//    public void abrirMejoras(){
//        vm1.setVisible(true);
//    }
//
//    public void abrirEstadisticas(){
//        ve1.setVisible(true);
//    }

    public String getName() {
        return name;
    }
}
