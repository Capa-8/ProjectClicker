package clicker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {
    public JPanel panel1;
    public JLabel label1;
    public JButton boton1;
    public JButton mejora1;
    public JButton mejora2;
    public int pond;
    public int cuenta1;

    public Ventana(){
        setTitle("CLICKCOIN");
        setSize(640,400);
        setLocationRelativeTo(null);
        this.panel1 = new JPanel();
        this.label1 = new JLabel("0");
        this.boton1 = new JButton();
        this.mejora1 = new JButton();
        this.mejora2 = new JButton();
        this.cuenta1 = 0;
        this.pond   = 1;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Iniciar(){
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
        label1.setBounds(320,50,50,50);
        panel1.add(label1);

        //BOTON PRINCIPAL
        boton1.setBounds(220, 100, 200, 200);
        ImageIcon btc = new ImageIcon("bitcoin_PNG47.png");
        boton1.setIcon(new ImageIcon(btc.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(boton1);

        //BOTON DE MEJORA 1
        mejora1.setBounds(450, 100, 60, 60);
        ImageIcon mejora = new ImageIcon("mejora.jpg");
        mejora1.setIcon(new ImageIcon(mejora.getImage().getScaledInstance(mejora1.getWidth(), mejora1.getHeight(), Image.SCALE_SMOOTH)));

        //BOTON DE MEJORA 2
        mejora2.setBounds(450, 170, 60, 60);
        mejora2.setIcon(new ImageIcon(mejora.getImage().getScaledInstance(mejora2.getWidth(), mejora2.getHeight(), Image.SCALE_SMOOTH)));

        eventoOyenteDeRaton();
    }

    private void eventoOyenteDeRaton(){
        MouseListener oyente = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cuenta1 = cuenta1 + (1 * pond);
                mostrarCuenta();

                if(cuenta1>10){
                    mostrarMejora1();
                }

                if(cuenta1>20){
                    mostrarMejora2();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        };
        boton1.addMouseListener(oyente);

        MouseListener oyente1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cuenta1 = cuenta1 - 5;
                mostrarCuenta();
                pond = 2;
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        };
        mejora1.addMouseListener(oyente1);

        MouseListener oyente2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cuenta1 = cuenta1 - 10;
                mostrarCuenta();
                pond = 4;
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        };
        mejora2.addMouseListener(oyente2);
    }

    private void mostrarCuenta(){
        label1.setText(cuenta1 + "");
    }

    private void mostrarMejora1() { panel1.add(mejora1); }

    private void mostrarMejora2() { panel1.add(mejora2); }
}