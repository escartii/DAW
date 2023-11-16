package libreria;

import libreria.FNumDaw;
import java.util.Scanner;

public class FNumDaw {
        
    public static double potencia(int base, int exponente) {
    
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

    public static int calcularNumeros(int number) {

        int largaria = String.valueOf(number).length();
        return largaria;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Dime la base: ");
        int base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        double resultado = potencia(base, exponente);
        System.out.println(resultado);
        
        // Ejercicio 2
        System.out.print("Escribe un numero: ");
        int number = sc.nextInt();
        int largaria = calcularNumeros(number);
        System.out.println(largaria);
        
    }
}
