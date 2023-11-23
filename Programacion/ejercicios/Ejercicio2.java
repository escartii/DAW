import java.util.Scanner;

import libreria.FNumDaw;

public class Ejercicio2 {
    public static void main(String[] args) {

        boolean esPrimo;
        boolean esCapicua;
        int contador = 0;
        int contadorCapi = 0;
        boolean bucle = true;
        int iteracciones = 0;

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

        // Ejercicio 2
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        for (int i = 1000; i <= 9999; i++) {
            esCapicua = FNumDaw.esCapicua(i);
            if (esCapicua) {
                System.out.println("El numero: " + i + " Es capicua");
                contadorCapi++;
            }
        }
        System.out.println(" ");
        System.out.println("Hay: " + contadorCapi + " numeros capicua");

        // Acepta el reto 210

        int n;
        n = sc.nextInt();
        while (n != 0) {
            // Declaramos las variables necesarias
            String palabra = sc.next();
            int suma = 0;

            // Calculamos la suma de los códigos ASCII de los caracteres de la palabra y su largaria
            for (int i = 0; i < palabra.length(); i++) {
                suma += palabra.charAt(i);
            }

            // Obtenemos el número primo inferior más cercano a la suma
            int primo = FNumDaw.anteriorPrimo(suma);

            // Imprimimos la respuesta
            System.out.println(primo);
            n--;
        }

        // Acepta el reto 1
    }
}
