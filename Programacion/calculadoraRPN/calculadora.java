package calculadoraRPN;

import java.util.Scanner;



public class calculadora {
    
    public static int[] volteaArrayInt(int[] array) {
        int[] arrayVolteado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayVolteado[i] = array[array.length - 1 - i];
        }
        return arrayVolteado;
    }

    public static void main(String[] args) {
        
        boolean salir = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero entre 4 y 20: ");
        num = sc.nextInt();

        if (num < 4 || num > 20) {
            System.out.println("El número debe estar entre 4 y 20. Inténtalo de nuevo.");
            return;
        }

        double[] registros = new double[num];

        for (int i = 0; i < registros.length; i++) {
            System.out.println(i+1 + ": " + registros[i]);
        }

        while (!salir) {
            for (int i = 0; i < registros.length; i++) {
                System.out.println("Introduce un numero (presiona 'q' para salir): ");
                String input = sc.next();
                if (input.equals("q")) {
                    salir = true;
                }
                num = Integer.parseInt(input);
                registros[i] = num;
                System.out.println(registros[i]);
            }

            int[] intRegistros = new int[registros.length];
            for (int i = 0; i < registros.length; i++) {
                intRegistros[i] = (int) registros[i];
            }

            intRegistros = volteaArrayInt(intRegistros);
            int bajarNum = intRegistros.length;
            for (int i = 0; i < intRegistros.length; i++) {
                System.out.println((bajarNum) + ": " + intRegistros[i]);
                bajarNum-=1;
            }
        }
        
    }
}

