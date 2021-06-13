/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import clicker.Juego;
import clicker.moneda.MonedaBTC;
import clicker.moneda.MonedaETH;

/**
 *
 * @author Nacho
 */
public class VentanaJuegoETH extends javax.swing.JFrame {
    
    private VentanaEstadisticas vEst;
    private VentanaMejoras vMej;
    private Juego juego;

    /**
     * Creates new form VentanaJuegoETH
     */
    public VentanaJuegoETH(Juego juego) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        this.juego = juego;
        
        jLabel2.setText("JUGANDO: " + juego.getJugador().getNombre());        
        jLabel3.setText("NIVEL: " + juego.getNivel().getNumeroNivel());
        jLabel4.setText("CANTIDAD DE ETH: " + juego.getEstadisticas().getMonedasETH()); 
        
        VentanaEstadisticas vEst = new VentanaEstadisticas(juego);
        this.vEst = vEst;
        
        //Cambiamos aspecto de la ventana de estadisticas.
        vEst.getBoton1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/VOLVER4.png")));
        vEst.getLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO2.png")));

        VentanaMejoras vMej = new VentanaMejoras(juego);
        this.vMej = vMej;
        
        //Cambiamos aspecto de la ventana de mejoras.
        vMej.getBoton1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/VOLVER4.png")));
        vMej.getLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO2.png")));
        
        this.juego.getEstadisticas().initSubject((MonedaETH) this.juego.getMonedaETH());
        this.juego.getMinado().setMoneda(juego.getMonedaETH());
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/ETH.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 300, 300));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/ESTADISTICAS2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 12, 150, 75));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/MEJORAS2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 12, 150, 75));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/SALIR2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, 150, 75));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 300, 75));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 460, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 460, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/MINARBTC.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 100, 150, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        juego.getMinado().realizarMinado();
        jLabel4.setText("CANTIDAD DE ETH: " + juego.getEstadisticas().getMonedasETH()); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vEst.update();
        vEst.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        vMej.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VentanaSalida vs = new VentanaSalida();
        //Cambiamos aspecto de la ventana de salida.
        vs.getBoton1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/si1.png")));
        vs.getBoton2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/no1.png")));
        vs.getLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO2.png")));
        vs.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VentanaJuegoBTC vBTC = new VentanaJuegoBTC(this.juego);
        this.juego.getMinado().setMoneda(juego.getMonedaBTC());
        juego.setVentana(vBTC);
        vBTC.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
