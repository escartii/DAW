package RepasoExamen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Mundo");
        System.out.println("ArrayList:");
        for (String str : arrayList) {
            System.out.println(str);
        }

        // TreeMap
        // Cuando iteras sobre treeMap.keySet(), las claves se presentarán en orden ascendente: 1, 2, 3.
        // Esto se debe al comportamiento interno de TreeMap que ordena automáticamente las claves.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Tres");
        treeMap.put(1, "Uno");
        treeMap.put(2, "Dos");
        System.out.println("\nTreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("\nTreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        // Colas (Queue)
        Queue<String> cola = new LinkedList<>();
        cola.add("Primero");
        cola.add("Segundo");
        cola.add("Tercero");
        System.out.println("\nCola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
