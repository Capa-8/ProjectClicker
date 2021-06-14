/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.mejoras;

import clicker.Juego;
import clicker.ventana.VentanaJuegoBTC;
import clicker.ventana.VentanaMejoras;

/**
 *
 * @author Nacho
 */
public class MejoraActiva implements Mejora {

    private int tiempo;
    private Juego juego;
    private float precio;
    private VentanaMejoras ventanaMejoras;

    public MejoraActiva(Juego juego, int tiempo, float precio) {
        this.juego = juego;
        this.tiempo = tiempo;
        this.precio = precio;
        this.juego.addMejoraA(this);
    }
    
    public void setVentana(VentanaMejoras ventanaMejoras){
        this.ventanaMejoras = ventanaMejoras;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

    public void disparar() {
        if (juego.getEstadisticas().quitarBTC(precio) == true) {
            float poderActual;
            poderActual = juego.getMonedaBTC().getPoder();
            juego.getMonedaBTC().setPoder(poderActual * 2);
            juego.getMonedaETH().setPoder(poderActual * 2);
            
//            poderActual = juego.getEstadisticas().getPoder();
//            juego.getEstadisticas().setPoder(poderActual * 2);

            precio = precio * 5;
            ventanaMejoras.getLabelDuplicador().setText(precio + " BTC");
            //ventanaMejoras.getBtnDuplicate().setText("Duplicar Monedas (" + precio + " BTC)");
            juego.getEstadisticas().valoresCambiados();
        }
    }

    @Override
    public void checkPrecio() {
        if (juego.getEstadisticas().getMonedasBTC() >= precio) {
            ventanaMejoras.getBtnDuplicate().setVisible(true);
            ventanaMejoras.getLabelDuplicador().setVisible(true);
            ventanaMejoras.getLabelDuplicadorTitulo().setVisible(true);
        } else {
            ventanaMejoras.getBtnDuplicate().setVisible(false);
            ventanaMejoras.getLabelDuplicador().setVisible(false);
            ventanaMejoras.getLabelDuplicadorTitulo().setVisible(false);
        }
    }
    
    public String getPrecio(){
        return String.valueOf(this.precio);
    }
}
