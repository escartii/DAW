package ejercicios.libreria;

import java.util.Scanner;

import ejercicios.libreria.Vector;

public class calculadoraRPN {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] volteado = new int[array.length];
        System.out.println(volteado);
        
        Vector.volteaArrayInt(array);

        boolean salir = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero entre 4 y 20: ");
        num = sc.nextInt();

        double[] registros = new double[num];

        while (!salir) {
            
            for (int i = 0; i < registros.length; i++) {
                System.out.println("Introduce un numero: ");
                num = sc.nextInt();
                registros[i] = num;
                System.out.println(registros[i]);

            }

            for (int i = 0; i < registros.length; i++) {
                System.out.println(i+1 + ": " + registros[i]);
            }
        }
    }
}
