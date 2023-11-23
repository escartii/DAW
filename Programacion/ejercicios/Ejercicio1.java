import java.util.Scanner;

import libreria.FNumDaw;

public class Ejercicio1 {
    public static void main(String[] args) {

        boolean esPrimo;
        int contador = 0;

        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        for (int i = 1; i <= 1000; i++) {
            esPrimo = FNumDaw.esPrimo(i);
            if (esPrimo) {
                contador++;
                System.out.println("El numero: " + i + " Es primo");
            }
        }
        System.out.println(" ");
        System.out.println("Hay: " + contador + " numeros primos");
    }
}
