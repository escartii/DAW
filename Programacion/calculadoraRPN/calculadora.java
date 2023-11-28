package calculadoraRPN;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        
        boolean salir = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero entre 4 y 20: ");
        num = sc.nextInt();

        double[] registros = new double[num];

        for (int i = 0; i < registros.length; i++) {
            System.out.println(i+1 + ": " + registros[i]);

        }
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
