package clicker.enemigos;

import clicker.Juego;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class FabricaEnemigos {
    Juego juego;
    ArrayList<Enemigo> enemigos;
    boolean pause;
    private TimerTask tareaEsperar;
    
    public FabricaEnemigos(Juego juego){
        this.juego = juego;
        pause = true;
        enemigos = new ArrayList<>();
        enlistarEnemigos();
        
        tareaEsperar = new TimerTask(){
        @Override
        public void run(){
                pause = false;
            }
        };
    }
    
    public void iniciar(){
        pause = false;
        temporizador();
    }
    
    public void pausa(){
        pause = true;
    }
    
    public void seguir(){
        juego.getVentana().setVisible(true);
        Timer timer = new Timer();
        timer.schedule(tareaEsperar , 10000);
    }
    
    /**El metodo crearEnemigo toma la lista de enemigos y junto a un numero
     * aleatorio revisa uno por uno si su probabilidad le permite nacer
    **/
    private void crearEnemigo(){
        float numero = (float)(Math.random());
        for(Enemigo enemigo: enemigos){
            if(numero <= (enemigo.getProbabilidad()*getProbAtaqueNivel())){
               if(juego.getNivel().getNumeroNivel()<3){
                    if(juego.getMonedaBTC().getMonedas() >= enemigo.getRoboT()){
                        juego.getVentana().setVisible(false);
                        juego.getVentana().cerrarVentanas();
                        enemigo.nacer(false);
                        break;
                    }
                }else{
                    if(juego.getMonedaBTC().getMonedas() >= enemigo.getRoboT() && juego.getMonedaETH().getMonedas() >= enemigo.getRoboT() ){
                        juego.getVentana().setVisible(false);
                        juego.getVentana().cerrarVentanas();
                        enemigo.nacer(false);
                        break;
                    }
                }
            }
        }
    }
    
    
    /**El metodo temporizador crea un hilo del tipo TimerTask, este hilo estara
     * siempre activo, su ejecucion run() se repite de forma periodica
    **/
    private void temporizador(){
    Timer timer = new Timer();
    
    TimerTask tarea = new TimerTask(){
        @Override
        public void run(){//Este metodo verificara que no se halla pausado la ejecucion para seguir creando enemigos
            if(!pause)
            crearEnemigo();
        }
    };
    
        timer.schedule(tarea, 0,1000);//timer.schuedule ejecuta el TimerTask ingresado como argumento, se ejecuta luego de 0ms y se repite cada 1s.
    }
    
    
    /**El metodo enlistarEnemigos agrega a todos los enemigos en una lista, estos
     * si bien se crean, no atacan hasta que nacen, esto permite obtener sus
     * probabilidades de nacer por cada tipo de enemigo.
     */
    private void enlistarEnemigos(){
        //se deben enlistar de menor a mayor probablidad
        enemigos.add(new Invencible(juego));//p 0,01%
        enemigos.add(new Hacker(juego));//p 2%
        enemigos.add(new Virus(juego));//p 5%
        
        
    }
    
    public float getProbAtaqueNivel(){
        if(juego.getNivel().getNumeroNivel() == 1)
            return 1;
        else
            return ((juego.getNivel().getNumeroNivel()-1)*2);
    }
    

    public ArrayList getEnemigos(){
        return enemigos;
    }
}
