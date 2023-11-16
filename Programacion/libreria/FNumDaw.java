package libreria;

import libreria.FNumDaw;
import java.util.Scanner;

public class FNumDaw {
        

    public static double potencia() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce el exponente: ");
        double exponente = sc.nextDouble();
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

    public static int calcularNumeros() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int number = sc.nextInt();
        int largaria = String.valueOf(number).length();
        return largaria;
    }
    public static void main(String[] args) {
        System.out.println("Hola");

        double resultado = potencia();
        System.out.println(resultado);

        int largaria = calcularNumeros();
        System.out.println(largaria);
    }
    
}
