package Programacion_estructurada.Extra;
import java.util.Scanner;


public class CalculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] registros = new double[4];
        int indice = 0;
        boolean salir = false;

        while (!salir) {
            System.out.print("Introduce un número o una operación (+, -, *, /) o Q (MAYUSCULA) para salir: ");
            String entrada = sc.nextLine();

            if (entrada.equals("+") && indice < 2) {
                System.out.println("Lo siento, no hay suficientes números en la fila para hacer calculos");
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
                try {
                    double numero = Double.parseDouble(entrada);
                    registros[indice] = numero;
                    indice++;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida");
                }
            }

            System.out.print("Registros de la fila: ");
            for (int i = 0; i < indice; i++) {
                System.out.print(registros[i] + " ");
            }
            System.out.println();
        }

        System.out.println("Saliendo del programa.");
    }
}