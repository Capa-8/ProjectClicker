/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import java.util.ArrayList;

/**
 *
 * @author Nehemias
 */
public class Nivel {

    public float ponderacion;
    private final ArrayList valoresList;
    public int numeroNivel;

    public Nivel() {
        ponderacion = (float) 0.01;
        numeroNivel = 1;
        valoresList = new ArrayList();
        int cantNiveles = 5;
        int[] valores1 = new int[2];
        valores1[0] = 10;//BTC
        valores1[1] = 0;//ETH
        valoresList.add(valores1);
        int[] valores2 = new int[2];
        valores2[0] = 300;//BTC
        valores2[1] = 0;//ETH
        valoresList.add(valores2);
        int[] valores3 = new int[2];
        valores3[0] = 500;//BTC
        valores3[1] = 100;//ETH
        valoresList.add(valores3);
        int[] valores4 = new int[2];
        valores4[0] = 3000;//BTC
        valores4[1] = 2000;//ETH
        valoresList.add(valores4);
        int[] valores5 = new int[2];
        valores5[0] = 99999999;//BTC
        valores5[1] = 99999999;//ETH
        valoresList.add(valores5);

//        valoresList.add()
//        
//        int valorInicialBTC, valorInicialETH, incremento;
//        valorInicialBTC = 100;
//        valorInicialETH = 0;
//        incremento = 1;
//        for (int i = 1; i <= cantNiveles; i++) {
//            int[] valores = new int[2];
//            valores[0] = valorInicialBTC;//BTC
//            valores[1] = valorInicialETH;//ETH
//            valoresList.add(valores);
//            
//            incremento *= i+1;
//            valorInicialBTC *= incremento;
//            if(i >= 2){
//                valorInicialETH *= incremento;
//            }
//        }
//        int[] i;
//        i[0] = 0; i[1] = 0;
//        valoresList.add(i);
//        valoresList.add(100);
//        valoresList.add(300);
//        valoresList.add(this)
    }

    public void aumentar() {
        ponderacion *= 10;
        numeroNivel += 1;
    }
    
    public boolean cambiaNivel(int cantBTC, int cantETH){
        int[] valores = (int[]) valoresList.get(numeroNivel-1);
        return (cantBTC==valores[0] && cantETH==valores[1]);
    }
    
    public int getNumeroNivel(){
        return numeroNivel;
    }

}
