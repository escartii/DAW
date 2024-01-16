package Programacion_Dinamica;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        // Creamos HashMap
        HashMap<Integer, String> diasSemana = new HashMap<Integer, String>();
        HashMap<String, Integer> numeros = new HashMap<String, Integer>();
        String ord, valor;
        int index;
        // Añadimos elementos a HashMap
        diasSemana.put(1, "Lunes");
        diasSemana.put(2, "Martes");
        diasSemana.put(3, "Miércoles");
        diasSemana.put(4, "Jueves");
        diasSemana.put(5, "Viernes");
        diasSemana.put(6, "Sabado");
        diasSemana.put(7, "Domingo");
        numeros.put("primero", 1);
        numeros.put("segundo", 2);
        numeros.put("tercero", 3);
        numeros.put("cuarto", 4);
        numeros.put("quinto", 5);
        numeros.put("sexto", 6);
        numeros.put("séptimo", 7);
        numeros.put("octavo", 8);
        numeros.put("noveno", 9);
        numeros.put("décimo", 10);

        // Mostramos el tamaño de los HashMap
        System.out.printf("El HashMap diasSemana contiene %d elementos\n", diasSemana.size());
        System.out.printf("El HashMap numeros contiene %d elementos\n", numeros.size());
        // Comprobamos existen o no elementos
        index = 7;
        if (diasSemana.containsKey(index)) {
            System.out.printf("El índice %d es %s\n", index, diasSemana.get(index));
        }
        ord = "octavo";
        if (numeros.containsKey(ord)) {
            System.out.printf("El índice %s tiene el valor %d\n", ord, numeros.get(ord));
        }
        // Buscamos un elemento
        index = 4;
        ord = "quinto";
        System.out.printf("El %s tiene la clave %d \n", diasSemana.get(index), index);
        System.out.printf("La clave %s contiene el valor %d\n", ord, numeros.get(ord));
        // Reemplazamos un elemento (Java 8)
        valor = "Juernes";
        index = 4; // corresponde al Jueves
        System.out.printf("El %s con clave %d se va a reemplazar por %s\n",
                diasSemana.get(index), index, valor);
        diasSemana.replace(index, diasSemana.get(index), valor);
        System.out.printf("El día %d ahora es %s\n", index, diasSemana.get(index));
        // Continúa en la siguiente hoja

        // Eliminamos elementos de ambos HashMap
        index = 4; // corresponde al Jueves
        ord = "cuarto";
        System.out.printf("El %s con clave %d se elimina\n", diasSemana.get(index), index);
        diasSemana.remove(index);
        System.out.printf("El %d con clave %s se elimina\n", numeros.get(ord), ord);
        numeros.remove(ord);
        // Tratamos de recorrerla
        System.out.println("Mostramos los elementos de dias de la semana: ");
        for (

        Integer ds : diasSemana.keySet()) {
            System.out.printf("La clave %d contiene el día %s\n", ds, diasSemana.get(ds));
        }
        System.out.println("Mostramos los elementos de números: ");
        for (String num : numeros.keySet()) {
            System.out.printf("La clave %s contiene el número %d\n", num, numeros.get(num));
        }
        // Vaciamos HashMap
    }
}
