package clicker.ventana;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class VentanaJuego extends Ventana{

        public int cuenta;
        private JPanel panel1;
        private JLabel label1;
        private JButton botonMejoras;
        private JButton botonEstadisticas;
        private JButton botonBTC;

        public VentanaJuego(){
            super();
            this.cuenta = 0;
            setTitle("JUEGO");
            setSize(640,640);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //Initials el panel.
            this.panel1 = new JPanel();
            this.panel1.setLayout(null);
            this.getContentPane().add(panel1);

            //Initials count.
            this.label1 = new JLabel("0");
            this.getContentPane().add(panel1);
            label1.setBounds(320,50,50,50);
            panel1.add(label1);

            //Aggregators el boton a las majors.
            this.botonMejoras = new JButton("Mejoras");
            botonMejoras.setBounds(300, 400, 100, 100);
            panel1.add(botonMejoras);

            //Aggregators el boton a las statistics.
            this.botonEstadisticas = new JButton("Estadisticas");
            botonEstadisticas.setBounds(100, 400, 100, 100);
            panel1.add(botonEstadisticas);

            // File path = new File("img");
            // File[] allFiles = path.listFiles();
            // BufferedImage[] allImages = new BufferedImage[allFiles.length];
            
            // for(int i=0; i<allFiles.length;i++){
            //     try {
            //         allImages[i] = ImageIO.read(allFiles[i]);
            //         ImageIcon icon = new ImageIcon(allImages[i]);
            //         botonBTC.setIcon(new ImageIcon(icon.getImage().getScaledInstance(botonBTC.getWidth(), botonBTC.getHeight(), Image.SCALE_SMOOTH)));
            //     } catch (IOException e) {
            //         //TODO: handle exception
            //     }
                
            // }

            //Aggregators el boton principal.
            this.botonBTC = new JButton();
            botonBTC.setBounds(250, 100, 250, 250);
            ImageIcon btc = new ImageIcon("bitcoin_PNG47.png");
            botonBTC.setIcon(new ImageIcon(btc.getImage().getScaledInstance(botonBTC.getWidth(), botonBTC.getHeight(), Image.SCALE_SMOOTH)));
            panel1.add(botonBTC);

        }

        public JPanel getPanel(){ return panel1; }

        public JButton getBotonMejoras(){ return botonMejoras; }

        public JButton getBotonEstadisticas(){ return botonEstadisticas; }

        public JButton getBotonBitcoin(){ return botonBTC; }

        public int getCuenta(){ return cuenta;}

        public void aumentarCuenta() {
            cuenta++;
        }

        public void mostrarCuenta(){
            label1.setText(cuenta + "");
        }
}