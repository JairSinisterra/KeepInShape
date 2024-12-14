import java.util.Random;

public class PausaActiva extends ModosEntrenamiento {
public int tiempoDescanso;

public PausaActiva(String nombre, int tiempoDescanso){
    super(nombre);
    this.tiempoDescanso = tiempoDescanso;
}
@Override
public String toString() {
    return "Tiempo de descanso para la Pausa Activa es de: " + tiempoDescanso + " Minutos";
}

public void ejerciciosPausaActiva(){
    System.out.println(" *** Ejercicios de la Pausa Activa *** \n 1. Mover los dedos de arriba hacia abajo por 2 minutos. \n 2. Caminata corta por 5 minutos. \n 3. Ejercicios de respiracion y concentracion. \n 4. Rotar los hombros hacia arriba, atras, abajo y adelante.");
}

public int getTiempoDescanso() {
    return tiempoDescanso;
}

public void setTiempoDescanso(int tiempoDescanso) {
    this.tiempoDescanso = tiempoDescanso;
}

public void showDetails(){
    int opcion = 3;
        do{
            System.out.println("Ingrese con su correo");
            var correo = scanner.nextLine();
            correo.toLowerCase();
            System.out.println();
            System.out.println("Ingresando al Sistema: \n");
     System.out.println("Seleccione el nombre del entrenamiento");
     System.out.println("1. Estiramiento");
     System.out.println("2. Pausa Activa");
     System.out.println("3. Modo de fuerza");
     System.out.println("4. Salir");
     System.out.println("Elija una opcion: ");
      
     opcion = Integer.parseInt(scanner.nextLine());
     System.out.println();
     switch(opcion){
        case 1: 
        System.out.println("*** Modo de estiramiento seleccionado ***");
        estirar();
        System.out.println();
        break;
        case 2:
        System.out.println("*** Pausas Activas ***");
        ejerciciosPausaActiva();
        System.out.println();
        break;
        case 3:
        System.out.println("*** Modo de fuerza ***");
        levantarPesas();
        System.out.println();
        break;
        case 4:
        System.out.println("Muchas gracias por ingresar a Keep In Shaple!!\n Saliendo del sistema....");
        System.exit(0);
        break;  
        default:
        break;
     }
 

    }while(opcion !=4);
}
}
