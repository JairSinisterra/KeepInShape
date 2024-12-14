import java.util.Random;
import java.util.Scanner;

public class ModosEntrenamiento {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private  String nombre;
    
    public ModosEntrenamiento(String nombre){
       
        this.nombre = nombre;
        
    }
    public void estirar(){
        System.out.println(" *** Secion de ejercicios de estiramiento *** \n 1. Estiramientos dinamicos para aumentar la temperatura. \n 2. Estiramientos balisticos a traves de movimientos ritmicos y rapidos. \n 3. Enderezar los dedos. \n 4. Girar las palmas hacia afuera y llevar las manos mirando hacia dentro.");
    }
    public void levantarPesas(){
        System.out.println(" 1. Sentadillas para los cuadriceps. \n 2. Zancadas o desplantes. \n 3. Press de bance para el pecho. \n 4. Dominadas para la espalda.");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
       // System.out.println("Nombre del Modo de entrenamiento: "+nombre);
   
    
}
