package clicker;

public class Juego{
    
    private Jugador jugador;
    private Estadisticas estadisticas;
    
    public Juego(Jugador jugador){
        this.jugador = jugador;
        Estadisticas estadisticas = new Estadisticas();
        this.estadisticas = estadisticas;
    }
    
    public Jugador getJugador(){
        return jugador;
    }
    
    public Estadisticas getEstadisticas(){
        return estadisticas;
    }
}