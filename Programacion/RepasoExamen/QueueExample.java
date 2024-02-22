package RepasoExamen;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Crear una cola
        Queue<String> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        // Mostrar la cola
        System.out.println("Cola: " + cola);

        // Obtener y eliminar el primer elemento de la cola
        String primerElemento = cola.poll();
        System.out.println("Primer elemento obtenido y eliminado: " + primerElemento);

        // Mostrar la cola después de la operación de eliminación
        System.out.println("Cola después de eliminar el primer elemento: " + cola);

        // Obtener el primer elemento de la cola sin eliminarlo
        String primerElementoSinEliminar = cola.peek();
        System.out.println("Primer elemento sin eliminar: " + primerElementoSinEliminar);

        // Mostrar la cola después de peek()
        System.out.println("Cola después de peek(): " + cola);
    }
}
