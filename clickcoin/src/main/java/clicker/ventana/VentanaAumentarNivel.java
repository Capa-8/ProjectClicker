/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ventana;

import clicker.ImagePanel;
import clicker.Juego;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nehemias
 */
public class VentanaAumentarNivel extends javax.swing.JFrame {

    Juego juego;

    /**
     * Creates new form VentanaAumentarNivel
     *
     * @param juego
     */
    public VentanaAumentarNivel(Juego juego) {
        initComponents();
        this.juego = juego;
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void showGIF(){

        Integer nivel = this.juego.getNivel().getNumeroNivel();
        switch (nivel) {
            case 2:
                jLabel2.setText("¡Subiste al Nivel " + nivel.toString() + "!");    
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/nivel 2.gif")));
                break;
            case 3:             
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/nivel 3.gif")));
                jLabel2.setText("¡Subiste al Nivel " + nivel.toString() + "!");   
                break;
            case 4:             
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/nivel 4.gif")));
                jLabel2.setText("¡Subiste al Nivel " + nivel.toString() + "!");   
                break;
            case 5:          
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clicker/resources/nivel 5.gif")));
                jLabel2.setText("¡Subiste al Nivel " + nivel.toString() + "!");   
                break;
            default:
                jLabel2.setText("¡Subiste al Nivel " + nivel.toString() + "!");   
                break;
        }
        setVisible(true);
    }

    public void cerrarTodo() {
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 640, 70));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaAumentarNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaAumentarNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaAumentarNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaAumentarNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaAumentarNivel().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}