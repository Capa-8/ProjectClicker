package clicker.ventana;
import clicker.enemigos.Enemigo;
import java.util.Timer;
import java.util.TimerTask;


public class VentanaEnemigo extends javax.swing.JFrame {

    int s;
    Timer t;
    Enemigo enemigo;

    
    public VentanaEnemigo(Enemigo enemigo) {
        
        initComponents();
        this.enemigo = enemigo;
        
        actualizarVida();
        
        botonEnemigo.setText(enemigo.nombre());
        
        t = new Timer();
        t.schedule(accion, 0,100);
    }
    
    
    private TimerTask accion = new TimerTask(){

        @Override
       public void run() {
            s=enemigo.getTiempo();
            actualizarTiempo();
        }
        
    };
    
    
    private void actualizarTiempo() {
        String tiempo = "Tiempo: " + (s<=9?"0":"")+s;
        textoTiempo.setText(tiempo);
        actualizarVida();
    }
    
    private void actualizarVida(){
        String tiempo = "Vida: " + enemigo.getVida();
        textoVida.setText(tiempo);
    }
    
    /**Este metodo es muy importante, ya que elimina el hilo de TimerTask accion
     * de lo contrario este hilo seguira vivo a pesar de cerrarce la ventana
     */
    public void matar(){
        t.cancel();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEnemigo = new javax.swing.JButton();
        textoTiempo = new javax.swing.JLabel();
        textoVida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonEnemigo.setText("Enemigo");
        botonEnemigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEnemigoMouseClicked(evt);
            }
        });
        botonEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnemigoActionPerformed(evt);
            }
        });

        textoTiempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoTiempo.setText("Tiempo: 00 ");

        textoVida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoVida.setText("Vida: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEnemigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoTiempo)
                        .addGap(22, 22, 22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(textoVida)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(textoTiempo)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoVida)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnemigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnemigoMouseClicked
        enemigo.clcik();
        actualizarVida();
    }//GEN-LAST:event_botonEnemigoMouseClicked

    private void botonEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnemigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEnemigoActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnemigo;
    private javax.swing.JLabel textoTiempo;
    private javax.swing.JLabel textoVida;
    // End of variables declaration//GEN-END:variables
}