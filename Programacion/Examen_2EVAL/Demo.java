import java.util.ArrayList;
import java.util.Scanner;

// Álvaro Escartí -- 1º DAW -- Examen segunda evaluación
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Formulario> formularios = new ArrayList<>();
        // variable de control para salir del bucle
        int opcion;
        do {
            // Pinto el menu con la función
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del cliente: ");
                    String cliente = sc.nextLine();
                    System.out.print("Introduce el producto: ");
                    String producto = sc.nextLine();
                    System.out.print("Introduce el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine(); 
                    // Generamos ID PE y el metodo tiene un contador que irá añadiendo el número consecutivo.
                    String id = Formulario.generarId("PE");
                    Pedido pedido = new Pedido(id, cliente, producto, precio);
                    formularios.add(pedido);
        
                    System.out.println("Pedido creado con ID: " + id);

                    break;
                case 2:
                    System.out.print("Introduce el nombre del cliente: ");
                    String cliente2 = sc.nextLine();
                    System.out.print("Introduce el producto: ");
                    String producto2 = sc.nextLine();
                    System.out.print("Introduce el precio: ");
                    double precio2 = sc.nextDouble();
                    //Carro
                    sc.nextLine();
                    // Creamos una objeto llamado devolucion con sus parametros y lo añadimos al arraylist
                    String id2 = Formulario.generarId("DE");
                    Devolucion devolucion = new Devolucion(id2, cliente2, producto2, precio2);
                    formularios.add(devolucion);
        
                    System.out.println("Devolución creada con ID: " + id2);

                    break;
                case 3:
                    System.out.print("Introduce el nombre del cliente: ");
                    String cliente3 = sc.nextLine();
                    System.out.print("Introduce el texto de la reclamación: ");
                    String texto = sc.nextLine();
        
                    String id3 = Formulario.generarId("RE");
                    // Creamos una objeto llamado reclamacion con sus parametros y lo añadimos al arraylist
                    Reclamacion reclamacion = new Reclamacion(id3, cliente3, texto);
                    formularios.add(reclamacion);
                    System.out.println("Reclamación creada con ID: " + id3);

                    break;
                case 4:
                    System.out.print("Introduce el ID de la reclamación a cerrar: ");
                    String id4 = sc.nextLine();
                    // Bucle foreach 
                    for (Formulario formulario : formularios) {
                        // Si la clase instancia es Reclamacion y obtenemos el id que introduce el usuario
                        if (formulario instanceof Reclamacion && formulario.getId().equals(id4)) {
                            // Creamos el objeto reclamacion
                            Reclamacion reclamacion2 = (Reclamacion) formulario;
                            // cerramos con el metodo cerrarReclamacion que devuelve un booleano.
                            reclamacion2.cerrarReclamacion();
                            System.out.println("Reclamación cerrada con ID: " + id4);
                        }
                    }

                    break;
                case 5:
                    System.out.print("Introduce el ID del formulario: ");
                    String id5 = sc.nextLine();
        
                    for (Formulario formulario : formularios) {
                        if (formulario.getId().equals(id5)) {
                            // Llamamos al metodo imprimirDatos que devuelve el ID y el cliente
                            formulario.imprimirDatos();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Listar todas las reclamaciones hechas:");
                    for (Formulario formulario : formularios) {
                        // si la instancia de clase Reclamacion = a formulario
                        // imprimo todos los datos con el método imprimirDatos
                        if (formulario instanceof Reclamacion) {
                            formulario.imprimirDatos();
                            System.out.println();
                        }
                    }

                    break;
                case 7:
                    System.out.println("Listar todos los formularios (Incluye todo):");
                    for (Formulario formulario : formularios) {
                        formulario.imprimirDatos();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    // En caso de equivocación le he puesto un color verde para que resalte :)
                    System.out.println("\u001B[32mPor favor introduce un número válido (1-7): \u001B[0m ");
                    break;
            }
        } while (opcion != 0);
    }
    // creo una función para mostrar el menú.
    private static void mostrarMenu() {
        System.out.println("\u001B[32m** Menú de opciones **\u001B[0m");
        System.out.println("1. Crear pedido: ");
        System.out.println("2. Crear devolución: ");
        System.out.println("3. Crear reclamación: ");
        System.out.println("4. Cerrar reclamación: ");
        System.out.println("5. Imprimir formulario por ID: ");
        System.out.println("6. Imprimir todas las reclamaciones: ");
        System.out.println("7. Imprimir todos los formularios: ");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }
}

