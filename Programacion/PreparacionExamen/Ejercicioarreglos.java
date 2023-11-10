package PreparacionExamen;

import java.util.Arrays;

public class Ejercicioarreglos {
    public static void main(String[] args) {
        // Generar un arreglo con numero aleatorios
        int numRandom;
        numRandom = (int) (Math.random() * 5);
        int[] miVector = new int[3];
        boolean salir = false;

        for (int i = 0; i < miVector.length; i++) {
            numRandom = (int) (Math.random() * 50);
            System.out.println(numRandom);
            miVector[i] = numRandom;

            for (int j = 0; j < i; j++) {
                if (miVector[i] == miVector[j]) {
                    salir = true;
                }
            }

            if (salir) {
                System.out.println("Hay un numero repetido.");
                salir = true;
            }
        }

        if (!salir) {
            System.out.println("No hay numeros repetidos.");
        }
    }
    // System.out.println(miVector[0]);

}
