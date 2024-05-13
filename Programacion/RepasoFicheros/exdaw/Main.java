import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void limpiarPantalla(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean comprobarConexion(Connection conexion) {
        try {
            if (conexion != null) {
                System.out.println("Conexión establecida");
                return true;
            } else {
                System.out.println("Error en la conexión");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {

        limpiarPantalla();
        Scanner sc = new Scanner(System.in);
        int opcion;

        boolean conexionExitosa = false;
        Connection conexion = ClaseConectar.conectar();
        conexionExitosa = comprobarConexion(conexion);

        //if (conexionExitosa) {
        //    Clientes.sacarClientes();
        //}

        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduzca el contacto del cliente: ");
                    String contacto = sc.nextLine();
                    System.out.print("Introduce el ApellidoContacto: ");
                    String apellidoContacto = sc.nextLine();
                    System.out.print("Introduce el telefono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Introduce el fax: ");
                    String fax = sc.nextLine();
                    System.out.print("Introduce la direccion: ");
                    String LineaDireccion1 = sc.nextLine();
                    System.out.print("Introduce la segunda direccion: ");
                    String LineaDireccion2 = sc.nextLine();
                    System.out.print("Introduce la ciudad: ");
                    String ciudad = sc.nextLine();
                    System.out.print("Introduce la region: ");
                    String region = sc.nextLine();
                    System.out.print("Introduce el pais: ");
                    String pais = sc.nextLine();
                    System.out.print("Introduce el codigo postal: ");
                    String codigoPostal = sc.nextLine();
                    System.out.print("LimiteCredito: ");
                    String limiteCredito = sc.nextLine();
                    Clientes.añadirCliente(conexion, nombre, contacto, apellidoContacto, telefono, fax, LineaDireccion1, LineaDireccion2, ciudad, region, pais, codigoPostal, limiteCredito);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 10);
    }
    
}