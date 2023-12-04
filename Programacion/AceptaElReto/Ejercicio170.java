import java.util.Scanner;

import java.util.Arrays;


public class Ejercicio170 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Ingrese la cantidad de números a introducir: ");
            int cantidad = sc.nextInt();
            int[] numeros = new int[cantidad];
            
            System.out.println("Ingrese los números:");
            for (int i = 0; i < cantidad; i++) {
                numeros[i] = sc.nextInt();
            }

            System.out.println("El array es: :");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println("estoy aqui");
            for (int i = 0; i < numeros.length-1; i++) {
                numeros = rotar(numeros);
                System.out.println(Arrays.toString(numeros));
            }
        }

        public static int[] rotar(int[] numeros){
            int primero = numeros[0];
            int x;
            for(x= 0; x<numeros.length-1; x++)
                numeros[x] = numeros[x+1];
                numeros[x]= primero;
            return numeros;
        }
    }

