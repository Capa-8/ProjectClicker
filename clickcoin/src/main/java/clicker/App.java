package clicker;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Juego j1 = new Juego("Jugador1");
        j1.iniciarJuego();
    }
}
