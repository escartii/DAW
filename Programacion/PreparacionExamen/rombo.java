package PreparacionExamen;

import java.util.Scanner;

public class rombo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de filas para el rombo: ");
        int n = sc.nextInt();
        int i, j;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
