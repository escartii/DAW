package Programacion_Dinamica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Estadistica {
        public static void main(String[] args) {
            List<Float> numeros = new ArrayList<>();
            boolean salir = false;
            float sumaNumeros = 0;
            float sumaCuadrados = 0;
            Scanner scanner = new Scanner(System.in);

            while (!salir) {
                System.out.print("Ingrese un número (o 'q' para salir): ");
                String input = scanner.nextLine();
                // Si pulsamos q salimos del programa
                if (input.equalsIgnoreCase("q")) {
                    salir = true;
                // Si no, seguimos dentro del bucle
                } else {
                    float numero = Float.parseFloat(input);
                    numeros.add(numero);
                    sumaNumeros += numero;
                    sumaCuadrados += numero * numero;
                    float media = sumaNumeros / numeros.size();
                    float desviacion = (float) Math.sqrt((sumaCuadrados / numeros.size()) - (media * media));
                    System.out.print("\u001B[32m"); // Cambiar color a verde
                    System.out.print("Media estadística: " + media);
                    System.out.print("     ");
                    System.out.println("Desviación típica: " + desviacion);
                    System.out.print("\u001B[0m"); // Restaurar color original
                }
            }
        }
    }

