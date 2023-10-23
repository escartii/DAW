package Programacion_estructurada;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int dígitos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero entre -6 y 6: ");
        int num = sc.nextInt();
  
        if (num == 0) {
            dígitos = 1;
        } else {
            while (num != 0) {
                dígitos++;
                num /= 10;
            }
         }
        System.out.println("El número de dígitos en el entero es: " + dígitos);
    }
}


