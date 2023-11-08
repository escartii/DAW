import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numApuestas;
        int[] numeros = new int[5];
        int[] estrellas = new int[2];

        System.out.print("Introduce el número de apuestas que quieres realizar: ");
        numApuestas = sc.nextInt();

        for (int i = 0; i < numApuestas; i++) {
            // Generar 5 números aleatorios sin repetición
            for (int j = 0; j < numeros.length; j++) {
                int numRandom;
                do {
                    numRandom = random.nextInt(50) + 1;
                } while (Arrays.binarySearch(numeros, numRandom) >= 0);
                numeros[j] = numRandom;
            }
            Arrays.sort(numeros);

            // Gener0 2 estrellas aleatorias sin repetición
            for (int j = 0; j < estrellas.length; j++) {
                int numRandom;
                do {
                    numRandom = random.nextInt(10) + 1;
                } while (Arrays.binarySearch(estrellas, numRandom) >= 0);
                estrellas[j] = numRandom;
            }
            Arrays.sort(estrellas);

            // Imprimir apuesta
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(String.format("%02d", numeros[j]) + " ");
            }
            System.out.print(" + ");
            for (int j = 0; j < estrellas.length; j++) {
                System.out.print(estrellas[j] + " ");
            }
            System.out.println();
        }
    }

}
