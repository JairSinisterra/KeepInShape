public class PausaActiva extends ModosEntrenamiento{
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
     System.out.println("Seleccione el nombre del entrenamiento");
     System.out.println("1. Estiramiento");
     System.out.println("2. Pausa Activa");
     System.out.println("3. Salir");
     System.out.println("Elija una opcion: ");
      
     opcion = Integer.parseInt(scanner.nextLine());
     switch(opcion){
        case 1:
        System.out.println("*** Modo de estiramiento seleccionado ***");
        estirar();
        break;
        case 2:
        System.out.println("*** Pausas Activas ***");
        ejerciciosPausaActiva();
        break;
        case 3:
        System.out.println("Muchas gracias por ingresar a Keep In Shaple!!\n Saliendo del sistema....");
        System.exit(0);
        break;
        default:
        break;
     }
 

    }while(opcion !=3);
}
}
