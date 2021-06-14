/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import clicker.Juego;
import clicker.Minado;
import clicker.moneda.Moneda;
import clicker.moneda.MonedaBTC;
import java.text.DecimalFormat;
import clicker.observer.ObserverEstadisticas;
import javax.swing.JLabel;

/**
 *
 * @author Nacho
 */
public class VentanaJuegoBTC extends VentanaMoneda implements ObserverEstadisticas {
    
    private VentanaEstadisticas ventanaEst;
    private VentanaMejoras ventanaMej;
    private Juego juego;
    private DecimalFormat df;

    /**
     * Creates new form VentanaJuegoBTC
     *
     * @param juego
     */
    public VentanaJuegoBTC(Juego juego) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        this.juego = juego;
        
        jLabel2.setText("JUGANDO: " + juego.getJugador().getNombre());
        jLabel4.setText("NIVEL: " + juego.getNivel().getNumeroNivel());
        
        df = new DecimalFormat("0.00");
        String numero = df.format(juego.getEstadisticas().getMonedasBTC());
        jLabel1.setText("CANTIDAD DE BTC: " + numero);
        
        VentanaEstadisticas ventanaEst = new VentanaEstadisticas(juego);
        this.ventanaEst = ventanaEst;
        juego.getEstadisticas().registerObserver(ventanaEst);
        
        VentanaMejoras ventanaMej = new VentanaMejoras(juego);
        this.ventanaMej = ventanaMej;
        juego.getMejoraActiva().setVentana(ventanaMej);
        juego.getMejoraPasiva().setVentana(ventanaMej);
        
        this.juego.getEstadisticas().initSubject((MonedaBTC) this.juego.getMonedaBTC());
        
        botonCambiarETH.setVisible(false);
        if (juego.getNivel().getNumeroNivel() >= 3) {
            botonCambiarETH.setVisible(true);
        }

        //Registro la ventana en estadisticas
        juego.getEstadisticas().registerObserver(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonCambiarETH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClickCoin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/BTC.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 300, 300));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/MEJORAS.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 12, 150, 75));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/ESTADISTICAS.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 12, 150, 75));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 462, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 300, 75));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/SALIR.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, 150, 75));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 460, 50));

        botonCambiarETH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/MINARETH.png"))); // NOI18N
        botonCambiarETH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarETHActionPerformed(evt);
            }
        });
        getContentPane().add(botonCambiarETH, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 100, 150, 75));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        ventanaEst.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ventanaMej.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        juego.getMinado().realizarMinado();
        juego.aumentarNivel();
        jLabel4.setText("NIVEL: " + juego.getNivel().getNumeroNivel());
        String numero = df.format(juego.getEstadisticas().getMonedasBTC());
        jLabel1.setText("CANTIDAD DE BTC: " + numero);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VentanaSalida vs1 = new VentanaSalida();
        vs1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonCambiarETHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarETHActionPerformed
        VentanaJuegoETH vETH = new VentanaJuegoETH(this.juego);
        juego.getMinado().setMoneda(juego.getMonedaETH());
        juego.setVentana(vETH);
        vETH.setVisible(true);

//      Cuando me cambio de ventanas destruyo las otras no sin antes remover el observador de VentanaEstadistica.
        this.dispose();
        juego.getEstadisticas().removeObserver(ventanaEst);
        juego.getEstadisticas().removeObserver(this);
        ventanaEst.dispose();
        ventanaMej.dispose();
    }//GEN-LAST:event_botonCambiarETHActionPerformed
    
    @Override
    public void update() {
        String numero = df.format(juego.getEstadisticas().getMonedasBTC());
        jLabel1.setText("CANTIDAD DE BTC: " + numero);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarETH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cerrarVentanas() {
        ventanaMej.setVisible(false);
        ventanaEst.setVisible(false);
    }
}
