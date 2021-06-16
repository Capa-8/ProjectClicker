/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.mejoras;

import clicker.Juego;
import clicker.ventana.VentanaMejoras;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Nacho
 */
public class MejoraPasiva implements Mejora {

    private int tiempo;
    private Juego juego;
    private float precio;
    private VentanaMejoras ventanaMejoras;
    private float cantPlacas;
    private int porcentaje;
    private float precioOC;

    public MejoraPasiva(Juego juego, float precio) {
        this.juego = juego;
        tiempo = 1000;
        this.precio = precio;
        this.juego.addMejoraP(this);
        cantPlacas = 0;
        porcentaje = 95;
        precioOC = precio / 2;

    }

    public void setVentana(VentanaMejoras ventanaMejoras) {
        this.ventanaMejoras = ventanaMejoras;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void disparar() {
        if (juego.getEstadisticas().quitarBTC(precio) == true) {
            cantPlacas += 1;
            float incremento = cantPlacas / 10;
            System.out.println(tiempo);
            Timer timer = new Timer();
            TimerTask generateBTC = new TimerTask() {

                @Override
                public void run() {
                    System.out.println(incremento);
                    juego.getEstadisticas().updateBTCPasivo(incremento);
                    // System.out.println(cantPlacas+" Placas de Video han generado" + juego.getEstadisticas().getMonedasBTC());
                }
            };
            timer.schedule(generateBTC, 1, tiempo);

            precio = precio * 3;
            ventanaMejoras.getLabelPlaca().setText(precio + " BTC");
            //ventanaMejoras.getBtnGraphCard().setText("Placa de Video (" + precio + " BTC)");
            juego.getEstadisticas().valoresCambiados();
            juego.updateMejoras();
        }
    }

    public void checkPrecio() {
        if (juego.getEstadisticas().getMonedasBTC() >= precio) {
            ventanaMejoras.getBtnGraphCard().setVisible(true);
            ventanaMejoras.getLabelPlaca().setVisible(true);
            ventanaMejoras.getLabelPlacaTitulo().setVisible(true);
        } else {
            ventanaMejoras.getBtnGraphCard().setVisible(false);
            ventanaMejoras.getLabelPlaca().setVisible(false);
            ventanaMejoras.getLabelPlacaTitulo().setVisible(false);
        }
        //a apartir de aca lo agregue
       // ventanaMejoras.getBtnOverclock().setVisible(false);
        ventanaMejoras.getLabelOverclock().setVisible(false);
       // ventanaMejoras.getLabelOverclockTitulo().setVisible(false);
        //hasta aca

        //if (cantPlacas >= 1) {
//            if (juego.getEstadisticas().getMonedasBTC() >= precioOC) {
//                ventanaMejoras.getBtnOverclock().setVisible(true);
//                ventanaMejoras.getLabelOverclock().setVisible(true);
//                ventanaMejoras.getLabelOverclockTitulo().setVisible(true);
//            } else {
//                ventanaMejoras.getBtnOverclock().setVisible(false);
//                ventanaMejoras.getLabelOverclock().setVisible(false);
//                ventanaMejoras.getLabelOverclockTitulo().setVisible(false);
//            }
        //}
    }

    public float getCantPlacas() {
        return cantPlacas;
    }

    public void overclock() {
        if (cantPlacas >= 1) {
            if (juego.getEstadisticas().quitarBTC(precio) == true) {
                tiempo = tiempo * (porcentaje / 100);
                porcentaje = porcentaje - 5;
                if (porcentaje == 0) {
                    porcentaje = 5;
                }
                precioOC = precioOC * 1;
                //ventanaMejoras.getBtnOverclock().setText("Overclock (" + precioOC + " BTC)");
                juego.getEstadisticas().valoresCambiados();
                juego.updateMejoras();
            }
        }
    }

    public String getPrecio() {
        return String.valueOf(this.precio);
    }
}
