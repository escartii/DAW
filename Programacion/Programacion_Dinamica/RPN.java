package Programacion_Dinamica;
import java.util.Scanner;
import java.util.Stack;

public class RPN {
    public static void main(String[] args){

        Stack<Double> registros = new Stack<>();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        // Mientras no se introduzca Q (MAYUSCULA) el programa sigue pidiendo números
        while (!salir) {
            System.out.print("Introduce un número o una operación (+, -, *, /) o Q (MAYUSCULA) para salir: ");
            String entrada = sc.nextLine();
            // Si se introduce un número, se guarda en el stack
            if (entrada.equals("+") && registros.size() < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer cálculos");
            } else if (entrada.equals("+")) {
                double num2 = registros.pop();
                double num1 = registros.pop();
                double suma = num1 + num2;
                registros.push(suma);
            } else if (entrada.equals("-") && registros.size() < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer cálculos");
            } else if (entrada.equals("-")) {
                double num2 = registros.pop();
                double num1 = registros.pop();
                double resta = num1 - num2;
                registros.push(resta);
            } else if (entrada.equals("/") && registros.size() < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer cálculos");
            } else if (entrada.equals("/")) {
                double num2 = registros.pop();
                double num1 = registros.pop();
                double dividir = num1 / num2;
                registros.push(dividir);
            } else if (entrada.equals("*") && registros.size() < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer cálculos");
            } else if (entrada.equals("*")) {
                double num2 = registros.pop();
                double num1 = registros.pop();
                double multiplicar = num1 * num2;
                registros.push(multiplicar);
            } else if (entrada.equals("q") || entrada.equals("Q")) {
                salir = true;
            } else {
                // Si se introduce un número, se guarda en el stack
                double numero = Double.parseDouble(entrada);
                registros.push(numero);
            }
            // Se muestran los números que hay en el stack
            System.out.print("Registros de la fila: ");
            for (double num : registros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Saliendo del programa.");
    }
}