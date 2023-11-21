import java.util.Scanner;

import libreria.FNumDaw;

public class Ejercicio2 {
    public static void main(String[] args) {
       
        boolean esPrimo;
        boolean esCapicua;
        int contador = 0;
        int contadorCapi = 0;
             
        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        for (int i = 1; i <= 1000; i++){
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
        for (int i = 1000; i <= 9999; i++){
            esCapicua = FNumDaw.esCapicua(i);
            if (esCapicua) {
                System.out.println("El numero: " + i + " Es capicua");
                contadorCapi++;
            }
        }
        System.out.println(" ");
        System.out.println("Hay: " + contadorCapi + " numeros capicua");



    }
}










    

