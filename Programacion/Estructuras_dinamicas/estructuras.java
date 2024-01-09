package Estructuras_dinamicas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class estructuras {

    public static void main(String[] args) {
         // Creamos el arrayList
        ArrayList<String> diasSemana = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Añadimos elementos al ArrayList
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");

        for (int i = 1; i<= 10; i++){
            numeros.add(i);
        }

        // Iteramos la estructura con Iterator
        System.out.println("Iteramos con iterator");
        Iterator<String> ital = diasSemana.iterator();

        while (ital.hasNext()) {
            System.out.println(ital.next());
        }

        Iterator<Integer> ital1= numeros.iterator();
        while (ital1.hasNext()) {
            System.out.println(ital1.next());
        }

        //Ordenamos las listas
        Collections.sort(diasSemana);
        Collections.sort(numeros,Collections.reverseOrder());

        //Iteramos la estructura con forearch 
        System.out.println("Iteramos la estructura con foreach");
        
        for (String dia : diasSemana) {
            System.out.println(dia);
        }
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
