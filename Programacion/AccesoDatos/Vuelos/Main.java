import java.sql.Connection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void LimpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean validarAsiento(String asiento) {
        // Compruebo que el asiento comienza por numero y acaba entre A-F
        // fuente: https://codegym.cc/es/groups/posts/es.130.expresiones-regulares-en-java
        String asientoValido = "^[0-9][A-F]$";
        return Pattern.matches(asientoValido, asiento);
    }

    public static void main(String[] args) {

        // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar *.java
        // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main
        LimpiarPantalla();

        Scanner sc = new Scanner(System.in);
        int opcion;
        String asiento = "";
        int reserva;
        Connection conexion = ClaseConectar.conectar();
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
            sc.nextLine();
            // despues de un nextint hay que añadir un carro
            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 seleccionada: Alta Vuelo");
                    System.out.print("Dime el numero de vuelo: ");
                    String num_vuelo = sc.nextLine();
                    System.out.print("Dime el origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Dime el destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Escribe la fecha (Formato inglés): ");
                    String fecha = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = sc.nextInt();
                    sc.nextLine();
                    Vuelos.AltaVuelo(conexion, num_vuelo, origen, destino, fecha, capacidad);
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada: Alta Pasajero");
                    System.out.print("Dime tu nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dime tu pasaporte");
                    String pasaporte = sc.nextLine();
                    Vuelos.AltaPasajero(conexion, pasaporte, nombre);
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada: Reserva Vuelo");
                    System.out.print("Dime el número de vuelo: ");
                    int id_vuelo = sc.nextInt();
                    System.out.print("Dime el ID del pasajero: ");
                    int id_pasajero = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Que asiento quieres: ");
                    asiento = sc.nextLine();
                    
                    if (validarAsiento(asiento)) {
                        // El asiento es válido
                        Vuelos.ReservaVuelo(conexion, id_vuelo, id_pasajero, asiento);
                    } else {
                        System.out.println("El asiento, no es válido... vuelve a intentarlo.");
                    }
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada: Modificar reserva");
                    Vuelos.mostrarVuelosPasajeros(conexion);
                    System.out.print("Dime el numero de reserva: ");
                    reserva = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Que asiento quieres: ");
                    asiento = sc.nextLine();

                    if (validarAsiento(asiento)) {
                        // El asiento es válido
                        Vuelos.modificarReserva(conexion, reserva ,asiento);
                    } else {
                        System.out.println("El asiento, no es válido... vuelve a intentarlo.");
                    }
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada: Baja reserva");
                    Vuelos.mostrarVuelosPasajeros(conexion);
                    System.out.print("Dime el numero de reserva: ");
                    reserva = sc.nextInt();
                    Vuelos.bajaReserva(conexion, reserva);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 6);

        sc.close();
    }
}
                     
                 
