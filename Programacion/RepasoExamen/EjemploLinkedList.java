package RepasoExamen;
import java.util.LinkedList;

public class EjemploLinkedList {

    public static void main(String[] args) {
        // Crear una LinkedList de cadenas
        LinkedList<String> linkedList = new LinkedList<>();

        // Agregar elementos al final de la lista
        linkedList.add("Hola");
        linkedList.add("Mundo");
        linkedList.add("!");

        // Agregar un elemento al inicio de la lista
        linkedList.addFirst("¡");

        // Agregar un elemento en una posición específica
        linkedList.add(3, "Java");

        // Mostrar la LinkedList
        System.out.println("LinkedList:");
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Obtener y eliminar el primer elemento
        String first = linkedList.removeFirst();
        System.out.println("\nSe eliminó el primer elemento: " + first);

        // Obtener y eliminar el último elemento
        String last = linkedList.removeLast();
        System.out.println("Se eliminó el último elemento: " + last);

        // Mostrar la LinkedList después de eliminar elementos
        System.out.println("\nLinkedList después de eliminar elementos:");
        for (String str : linkedList) {
            System.out.println(str);
        }
    }
}
