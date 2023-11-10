package Examen.ExamenDAM;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int matriz[][] = new int[num][2];

        for (int i = 0; i < num; i++) {
            matriz[i][0] = in.nextInt();
            matriz[i][1] = in.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.println(matriz[i][0] + matriz[i][1]);
        }

    }
}
