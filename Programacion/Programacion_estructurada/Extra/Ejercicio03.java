package Programacion_estructurada.Extra;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declaro las variables
        int numeroSecreto = (int) (Math.random() * 100 + 1);
        int respuestasIncorrectas = 0;
        int numerodeIntentos = 5;
        Scanner sc = new Scanner(System.in);

        // Mientras que la respuesta incorrecta sea menor que 5 entra en el bucle y
        // vuelve a preguntar
        while (respuestasIncorrectas < 5) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            respuestasIncorrectas++; // incrementa el error sumando 1
            // Si el número introducido por el usuario es igual a número secreto, aciertas.
            if (num == numeroSecreto) {
                System.out.println("Enhorabuena, has acertado el número secreto!!");
                break;

            // En caso de que el número secreto sea mayor que el número que introduces, te lo mostrará como una pista.
            } else if (num < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + num);
            } else {
                System.out.println("El número secreto es menor que " + num);
            }

            if (respuestasIncorrectas < num) {
                System.out.println("Te quedan " + (numerodeIntentos - respuestasIncorrectas) + " intentos.");
            }
        }

        if (respuestasIncorrectas == numerodeIntentos) {
            System.out.println("Lo siento, has perdido. El número secreto era: " + numeroSecreto);
        }
    }
}
