package CadenasString;

import java.util.Arrays;
import java.util.List;

public class cadenas_arrays {
    public static void main(String[] args) {
        // Crear un array para los ejemplos
        int[] numeros = {5, 2, 8, 1, 7};

        // toString()
        String arrayComoCadena = Arrays.toString(numeros);
        System.out.println("toString(): " + arrayComoCadena);

        // sort()
        Arrays.sort(numeros);
        System.out.println("sort(): " + Arrays.toString(numeros));

        // binarySearch()
        int indiceBusqueda = Arrays.binarySearch(numeros, 8);
        System.out.println("binarySearch(8): " + indiceBusqueda);

        // equals()
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean sonIguales = Arrays.equals(array1, array2);
        System.out.println("Los arrays son iguales: " + sonIguales);

        // fill()
        int[] arrayLlenado = new int[5];
        Arrays.fill(arrayLlenado, 10);
        System.out.println("fill(10): " + Arrays.toString(arrayLlenado));

        // copyOf()
        int[] copia = Arrays.copyOf(numeros, 3);
        System.out.println("copyOf(3): " + Arrays.toString(copia));

        // copyOfRange()
        int[] rangoCopia = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("copyOfRange(1, 4): " + Arrays.toString(rangoCopia));

        // asList()
        String[] cadenas = {"Hola", "Mundo"};
        List<String> lista = Arrays.asList(cadenas);
        System.out.println("asList(): " + lista);
    }
}
