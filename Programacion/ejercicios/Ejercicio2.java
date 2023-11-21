import java.util.Scanner;

import libreria.FNumDaw;

public class Ejercicio2 {
    public static void main(String[] args) {
        int base;
        int exponente;
        double resultado;

                     
        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Dime la base: ");
        base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        exponente = sc.nextInt();
        resultado = FNumDaw.potencia(base, exponente);
        System.out.println(resultado);   

    }
}










    

