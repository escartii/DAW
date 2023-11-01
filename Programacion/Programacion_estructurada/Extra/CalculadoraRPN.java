package Programacion_estructurada.Extra;

import java.util.Scanner;

public class CalculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] registros = new double[4];
        int indice = 0;
        boolean salir = false;

        while (!salir) {
            System.out.print("Introduce un número o una operación (+, -, *, /): ");
            String entrada = sc.nextLine();

            switch (entrada) {
                case "+":
                    if (indice < 2) {
                        System.out.println("No hay suficientes números en la pila.");
                    } else {
                        double suma = registros[indice - 2] + registros[indice - 1];
                        registros[indice - 2] = suma;
                        indice--;
                    }
                    break;
                case "-":
                    if (indice < 2) {
                        System.out.println("No hay suficientes números en la pila.");
                    } else {
                        double resta = registros[indice - 2] - registros[indice - 1];
                        registros[indice - 2] = resta;
                        indice--;
                    }
                    break;
                case "*":
                    if (indice < 2) {
                        System.out.println("No hay suficientes números en la pila.");
                    } else {
                        double multiplicacion = registros[indice - 2] * registros[indice - 1];
                        registros[indice - 2] = multiplicacion;
                        indice--;
                    }
                    break;
                case "/":
                    if (indice < 2) {
                        System.out.println("No hay suficientes números en la pila.");
                    } else {
                        double division = registros[indice - 2] / registros[indice - 1];
                        registros[indice - 2] = division;
                        indice--;
                    }
                    break;
                case "Q":
                    salir = true;
                    break;
                default:
                    try {
                        double numero = Double.parseDouble(entrada);
                        if (indice == 4) {
                            System.out.println("La pila está llena.");
                        } else {
                            registros[indice] = numero;
                            indice++;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida.");
                    }
                    break;
            }

            System.out.print("Pila de registros: ");
            for (int i = 0; i < indice; i++) {
                System.out.print(registros[i] + " ");
            }
            System.out.println();
        }

        System.out.println("Saliendo del programa.");
    }
}
