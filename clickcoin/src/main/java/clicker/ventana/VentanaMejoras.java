/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import clicker.Juego;
import clicker.mejoras.*;
import javax.swing.JButton;
/**
 *
 * @author Nacho
 */
public class VentanaMejoras extends javax.swing.JFrame {
    
    private Juego juego;
    private MejoraActiva mejoraActiva;
    private MejoraPasiva mejoraPasiva;
    /**
     * Creates new form VentanaMejoras
     */
    public VentanaMejoras(Juego juego) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.juego = juego;
        this.mejoraActiva = new MejoraActiva(juego, 1, this, 10);       
        this.mejoraPasiva = new MejoraPasiva(juego, this, 5);
        btnDuplicate.setVisible(false);
        btnGraphCard.setVisible(false);
        btnOverclock.setVisible(false);
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
        btnDuplicate = new javax.swing.JButton();
        btnGraphCard = new javax.swing.JButton();
        btnOverclock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/VOLVER3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 315, 150, 75));

        btnDuplicate.setText("Duplicar monedas (10 BTC)");
        btnDuplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicateActionPerformed(evt);
            }
        });
        getContentPane().add(btnDuplicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnGraphCard.setText("Placa de Video (5 BTC)");
        btnGraphCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraphCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, -1));

        btnOverclock.setText("Overclocking");
        btnOverclock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverclockActionPerformed(evt);
            }
        });
        getContentPane().add(btnOverclock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/FONDO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDuplicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicateActionPerformed
        setVisible(false);
        mejoraActiva.disparar();
    }//GEN-LAST:event_btnDuplicateActionPerformed

    private void btnGraphCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphCardActionPerformed
        setVisible(false);
        mejoraPasiva.disparar();
    }//GEN-LAST:event_btnGraphCardActionPerformed

    private void btnOverclockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverclockActionPerformed
       //setVisible(false);
       mejoraPasiva.overclock();
    }//GEN-LAST:event_btnOverclockActionPerformed

    public javax.swing.JButton getBoton1(){
        return jButton1;
    }
    
    public javax.swing.JLabel getLabel1(){
        return jLabel1;
    }
    public javax.swing.JButton getBtnDuplicate(){
        return btnDuplicate;
    }

    public javax.swing.JButton getBtnGraphCard() {
        return btnGraphCard;
    }

    public JButton getBtnOverclock() {
        return btnOverclock;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuplicate;
    private javax.swing.JButton btnGraphCard;
    private javax.swing.JButton btnOverclock;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
