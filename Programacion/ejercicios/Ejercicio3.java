import libreria.FNumDaw;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        boolean esKaprekar;
        int numero = 0;
        int numCasos = 0;
        Scanner scanner = new Scanner(System.in);
        numCasos = scanner.nextInt();

        // Leer cada número a comprobar
        for (int i = 0; i < numCasos; i++) {
            numero = scanner.nextInt();
            while (numero != 6174) {
                int[] digitos = new int[4];
                for (int j = 0; j < 4; j++) {
                    digitos[j] = numero % 10;
                    numero /= 10;
                }

                // Ordenar el arreglo en forma ascendente
                Arrays.sort(digitos);

                // Construir el número ascendente
                int numeroAscendente = 0;
                for (int j = 0; j < 4; j++) {
                    numeroAscendente = numeroAscendente * 10 + digitos[j];
                }
                // Ordenar el arreglo en forma descendente
                for (int j = 0; j < 2; j++) {
                    int descendente = digitos[j];
                    digitos[j] = digitos[3 - j];
                    digitos[3 - j] = descendente;
                }
                // Construir el número descendente
                int numeroDescendente = 0;
                for (int j = 0; j < 4; j++) {
                    numeroDescendente = numeroDescendente * 10 + digitos[j];
                }

                System.out.println("Número ascendente: " + numeroAscendente);
                System.out.println("Número descendente: " + numeroDescendente);
                System.out.println(numeroDescendente + " - " + numeroAscendente + " = " + (numeroDescendente - numeroAscendente));

                numero = numeroDescendente - numeroAscendente;

                if (FNumDaw.esKaprekar(numero)) {
                    System.out.println("El número " + numero + " es Kaprekar");
                }
            }
        }
    }
}
