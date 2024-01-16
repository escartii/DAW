package Programacion_Dinamica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        List<Float> numeros = new ArrayList<>();
        float sumaNumeros = 0;
        float sumaCuadrados = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (o 'q' para salir): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.exit(0);
            }
            float numero = Float.parseFloat(input);
            numeros.add(numero);
            sumaNumeros += numero;
            sumaCuadrados += numero * numero;
            float media = sumaNumeros / numeros.size();
            float desviacion = (float) Math.sqrt((sumaCuadrados / numeros.size()) - (media * media));
            System.out.print("Media estadística: " + media);
            System.out.println("     " + "Desviación típica: " + desviacion);
        }
    }
}
