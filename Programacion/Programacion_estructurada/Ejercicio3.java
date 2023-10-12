package Programacion_estructurada;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between -6 and 6: ");
        int num = input.nextInt();
        int digits = 0;
        if (num == 0) {
            digits = 1;
        } else {
            while (num != 0) {
                digits++;
                num /= 10;
            }
         }
        System.out.println("The number of digits in the integer is: " + digits);
    }
}

