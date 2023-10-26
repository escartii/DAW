package Programacion_estructurada.Extra;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int columnas = sc.nextInt();
         
        int k = 0;
        int contador = 0;
        int contador2 = 0;

        for (int i = 1; i <= columnas; ++i) {
          for (int space = 1; space <= columnas - i; ++space) {
            System.out.print("  ");
            ++contador;
          }
    
          while (k != 2 * i - 1) {
            if (contador <= columnas - 1) {
              System.out.print((i + k) + " ");
              ++contador;
            } else {
              ++contador2;
              System.out.print((i + k - 2 * contador2) + " ");
            }
    
            ++k;
          }
          contador2 = contador = k = 0;
    
          System.out.println();
        }
    }
}
