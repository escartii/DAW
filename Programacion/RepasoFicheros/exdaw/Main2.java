import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            Connection conexion = ClaseConectar.conectar();
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("Menú:");
                System.out.println("1. Listar clientes");
                System.out.println("2. Añadir cliente");
                System.out.println("3. Exportar clientes a CSV");
                System.out.println("4. Importar clientes desde CSV");
                System.out.println("5. Actualizar límite de crédito de un cliente");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        Clientes.sacarClientes(conexion);
                        break;
                    case 2:
                        System.out.print("Introduzca el nombre del cliente: ");
                        String nombre = sc.nextLine();
                        System.out.print("Introduzca el nombre del contacto: ");
                        String contacto = sc.nextLine();
                        System.out.print("Introduzca el apellido del contacto: ");
                        String apellidoContacto = sc.nextLine();
                        System.out.print("Introduzca el teléfono: ");
                        String telefono = sc.nextLine();
                        System.out.print("Introduzca el fax: ");
                        String fax = sc.nextLine();
                        System.out.print("Introduzca la primera línea de la dirección: ");
                        String LineaDireccion1 = sc.nextLine();
                        System.out.print("Introduzca la segunda línea de la dirección: ");
                        String LineaDireccion2 = sc.nextLine();
                        System.out.print("Introduzca la ciudad: ");
                        String ciudad = sc.nextLine();
                        System.out.print("Introduzca la región: ");
                        String region = sc.nextLine();
                        System.out.print("Introduzca el país: ");
                        String pais = sc.nextLine();
                        System.out.print("Introduzca el código postal: ");
                        String codigoPostal = sc.nextLine();
                        System.out.print("Introduzca el límite de crédito: ");
                        String limiteCredito = sc.nextLine();
                        Clientes.añadirCliente(conexion, nombre, contacto, apellidoContacto, telefono, fax, LineaDireccion1, LineaDireccion2, ciudad, region, pais, codigoPostal, limiteCredito);
                        break;
                    case 3:
                        System.out.print("Introduzca el nombre del archivo CSV: ");
                        String archivoCSV = sc.nextLine();
                        break;
                    case 4:
                        System.out.print("Introduzca el nombre del archivo CSV: ");
                        String archivoCSVImportar = sc.nextLine();
                        Clientes2.importarClientesDesdeCSV(conexion, archivoCSVImportar);
                        break;
                    case 5:
                        System.out.print("Introduzca el código del cliente: ");
                        int codigoCliente = sc.nextInt();
                        System.out.print("Introduzca el nuevo límite de crédito: ");
                        double limiteCreditoNuevo = sc.nextDouble();
                        
                        break;
                }
            } while (opcion != 0);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}