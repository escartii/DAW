import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio170 {

    public static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        limpiar();
        System.out.print("Ingrese la cantidad de números a introducir: ");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        System.out.print("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("El array es: :");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }

        if (numeros[0] == 5) {
            System.out.println("");
            System.out.println("HAS INTRODUCIDO UN 5 Y EQUIVALE A UNA BOMBA, BOOOM");
        }

    }
}
