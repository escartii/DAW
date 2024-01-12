package Programacion_Dinamica;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class ejercicio2 {
    public static void main(String[] args) {
        // Creamos la cola
        // con el 1 preguntamos cliente
        // con el 2 atendemos y se va el cliente
        // con el 3 Mostramos la cola que queda
        // 0 salir
        Queue<String> clientes = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("0. Salir");
            int respuesta = sc.nextInt();
            System.out.println("");
            sc.nextLine();
            switch (respuesta) {
                case 1:
                    System.out.print("Introduce el cliente: ");
                    String usuario = sc.nextLine();
                    clientes.add(usuario);
                    System.out.println("Cliente añadido");
                    break;
                    case 2:
                        clientes.remove();
                        System.out.println("Cliente atendido");
                        break;
                    case 3:
                        Iterator<String> mostrarClientes = clientes.iterator();
                        while (mostrarClientes.hasNext()) {
                            System.out.println(mostrarClientes.next());
                        }
                        break;
                    case 0:
                        System.exit(respuesta);
                        break;
                    default:
                        System.out.println("Introduce un numero valido: ");
            }
        } while (true);
    }
}
