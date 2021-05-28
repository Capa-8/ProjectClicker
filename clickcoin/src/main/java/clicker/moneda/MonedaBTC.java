/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.moneda;

/**
 *
 * @author Nehemias
 */
public class MonedaBTC implements Moneda {

    public float valor;
    public int cantidad;

    public MonedaBTC() {
        cantidad = 0;
        valor = 0;
    }

    @Override
    public void minar() {
        cantidad += 1;
    }
    
    @Override
     public int getMonedas(){
         return cantidad;
     }
}
