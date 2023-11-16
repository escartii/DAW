package libreria;

import libreria.FNumDaw;
import java.util.Scanner;

public class FNumDaw {
        
    public static double potencia(int base, int exponente) {
    
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

    public static int cuentaDigitos(int number) {

        int resultado = String.valueOf(number).length();
        return resultado;
    }

    public static int voltea(int numero){
        String numeroString = String.valueOf(numero);
        String numeroInvertidoString = new StringBuilder(numeroString).reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoString);
        return numeroInvertido;
    }

    public static boolean esCapicua(int numero) {
        int numeroInvertido = voltea(numero);
        return numero == numeroInvertido;
    }

    public static void main(String[] args) {
        int base;
        int exponente;
        double resultado;
        int number;
        int largaria;
        int numero;
        int numeroInvert;
        int numCapi;
        boolean esCapicua;

        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Dime la base: ");
        base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        exponente = sc.nextInt();
        resultado = potencia(base, exponente);
        System.out.println(resultado);
        
        // Ejercicio 2
        System.out.print("Escribe un numero: ");
        number = sc.nextInt();
        largaria = cuentaDigitos(number);
        System.out.println(largaria);

        // Ejercicio 3
        System.out.print("Escribe el numero para darle la vuelta: ");
        numero = sc.nextInt();
        numeroInvert = voltea(numero);
        System.out.println(numeroInvert);

        // Ejercicio 4
        System.out.print("Escribe un numero para comprobar si es capicua: ");
        numCapi = sc.nextInt();
        esCapicua = esCapicua(numero);
        System.out.println(esCapicua);

        
    }
}
