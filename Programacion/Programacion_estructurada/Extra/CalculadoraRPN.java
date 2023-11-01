package Programacion_estructurada.Extra;
import java.util.Scanner;

public class CalculadoraRPN {
    public static void main(String[] args){

        double[] registros = new double[4];
        int indice = 0;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        // Mientras no se introduzca Q (MAYUSCULA) el programa sigue pidiendo números
        while (!salir) {
            System.out.print("Introduce un número o una operación (+, -, *, /) o Q (MAYUSCULA) para salir: ");
            String entrada = sc.nextLine();
            // Si se introduce un número, se guarda en el array y se incrementa el índice
            if (entrada.equals("+") && indice < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer calculos");
                // Si se introduce un + y hay al menos dos números en el array, se suman los dos últimos números
            } else if (entrada.equals("+")) {
                double suma = registros[indice - 2] + registros[indice - 1];
                registros[indice - 2] = suma;
                indice--;
            } else if (entrada.equals("-") && indice < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer calculos");
            } else if (entrada.equals("-")) {
                double resta = registros[indice - 2] - registros[indice - 1];
                registros[indice - 2] = resta;
                indice--;
            } else if (entrada.equals("/") && indice < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer calculos");
            } else if (entrada.equals("/")) {
                double dividir = registros[indice - 2] / registros[indice - 1];
                registros[indice - 2] = dividir;
                indice--;
            } else if (entrada.equals("*") && indice < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer calculos");
            } else if (entrada.equals("*")) {
                double multiplicar = registros[indice - 2] * registros[indice - 1];
                registros[indice - 2] = multiplicar;
                indice--;
            } else if (entrada.equals("Q")) {
                salir = true;
            } else {
                // Si se introduce un número, se guarda en el array y se incrementa el índice
                double numero = Double.parseDouble(entrada);
                registros[indice] = numero;
                indice++;
            }
            // Se muestran los números que hay en el array
            System.out.print("Registros de la fila: ");
            for (int i = 0; i < indice; i++) {
                System.out.print(registros[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Saliendo del programa.");
    }
}