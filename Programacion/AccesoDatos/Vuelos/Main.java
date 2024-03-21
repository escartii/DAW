import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar Main.java
        // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main

        Scanner sc = new Scanner(System.in);
        int opcion;

         // Crear una instancia de ClaseConectar
         ClaseConectar conexion = new ClaseConectar();
         // Llamar al método conectar()
         conexion.conectar();
        do {
            System.out.println("Menu:");
            System.out.println("1. Alta Vuelo");
            System.out.println("2. Alta Pasajero");
            System.out.println("3. Reserva Vuelo");
            System.out.println("4. Modificar reserva");
            System.out.println("5. Baja reserva");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para el alta de vuelo
                    System.out.println("Opción 1 seleccionada: Alta Vuelo");
                    break;
                case 2:
                    // Lógica para el alta de pasajero
                    System.out.println("Opción 2 seleccionada: Alta Pasajero");
                    break;
                case 3:
                    // Lógica para la reserva de vuelo
                    System.out.println("Opción 3 seleccionada: Reserva Vuelo");
                    break;
                case 4:
                    // Lógica para modificar reserva
                    System.out.println("Opción 4 seleccionada: Modificar reserva");
                    break;
                case 5:
                    // Lógica para la baja de reserva
                    System.out.println("Opción 5 seleccionada: Baja reserva");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 6);
    }
}
