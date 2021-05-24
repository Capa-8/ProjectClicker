import Ventanas.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Juego{

    private VentanaJuego m1;
    private VentanaMejoras vm1;
    private VentanaEstadisticas ve1;
    private String name;

    public Juego(String name) {
        VentanaJuego m1 = new VentanaJuego();
        this.m1 = m1;
        VentanaMejoras vm1 = new VentanaMejoras();
        this.vm1 = vm1;
        VentanaEstadisticas ve1 = new VentanaEstadisticas();
        this.ve1 = ve1;
    }

    public void iniciarJuego(){
        this.m1.setVisible(true);

        MouseListener oyente1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirMejoras();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        m1.getBotonMejoras().addMouseListener(oyente1);

        MouseListener oyente2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirEstadisticas();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        m1.getBotonEstadisticas().addMouseListener(oyente2);

        MouseListener oyente3 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aumentarCuenta();
                m1.mostrarCuenta();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        m1.getBotonBitcoin().addMouseListener(oyente3);
    }

    public void aumentarCuenta(){
        m1.aumentarCuenta();
    }

    public void abrirMejoras(){
        vm1.setVisible(true);
    }

    public void abrirEstadisticas(){
        ve1.setVisible(true);
    }

    public String getName() {
        return name;
    }
}