/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import clicker.Juego;
import clicker.observer.ObserverEstadisticas;
/**
 *
 * @author Nacho
 */
public class VentanaEstadisticas extends javax.swing.JFrame implements ObserverEstadisticas {

    private Juego juego;
    /**
     * Creates new form VentanaEstadisticas
     */
    public VentanaEstadisticas(Juego juego) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.juego = juego;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantidadPlacaVideo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Estadisticas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/VOLVER3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 315, 150, 75));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 620, 30));

        cantidadPlacaVideo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cantidadPlacaVideo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadPlacaVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public javax.swing.JButton getBoton1(){
        return jButton1;
    }

    public javax.swing.JLabel getLabel1(){
        return jLabel2;
    }
    
    @Override
    public void update(){
        jLabel1.setText("CANTIDAD DE CLICKS REALIZADOS: " + juego.getEstadisticas().getClicks());
        jLabel3.setText("CANTIDAD DE MONEDAS OBTENIDAS: " + juego.getEstadisticas().getMonedasBTC());
        cantidadPlacaVideo.setText("CANTIDAD DE PLACAS DE VIDEO: " + juego.getMejorasPasivas().get(0).getCantPlacas());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadPlacaVideo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
