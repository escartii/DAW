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
            sc.nextLine();
            switch (respuesta) {
                case 1:
                    System.out.print("Introduce el cliente: ");
                    String usuario = sc.nextLine();
                    clientes.add(usuario);
                    // creo una variable que me diga la cantidad de elementos que hay en la cola
                    int cantidadElementos = clientes.size();
                    // Resto uno a la cantidad de elementos 
                    cantidadElementos--;
                    System.out.println("Cantidad de elementos en la cola: " + cantidadElementos);
                    break;
                    case 2:
                        // Atendemos al cliente y lo sacamos de la cola con el metodo remove
                        clientes.remove();
                        System.out.println("Cliente atendido");
                        System.out.println("Cantidad de elementos en la cola: " + clientes.size());
                        break;
                    case 3:
                        // Muestro la cola con este bucle
                        Iterator<String> mostrarClientes = clientes.iterator();
                        while (mostrarClientes.hasNext()) {
                            System.out.print(mostrarClientes.next() + ",");
                        }
                        System.out.println(" ");
                        System.out.println("Cantidad de elementos en la cola:" + clientes.size());
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
