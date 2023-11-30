package calculadoraRPN;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        boolean salir = false;
        String num = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero entre 4 y 20: ");
        num = sc.nextLine();

        int numero = Integer.parseInt(num);
        while (numero < 4 || numero > 20) {
            System.out.println("El numero debe estar entre 4 y 20. Intenta de nuevo.");
            System.out.print("Escribe un numero entre 4 y 20: ");
            num = sc.nextLine();
            numero = Integer.parseInt(num);
        }

        int tamaño = Integer.parseInt(num);
        double[] registros = new double[tamaño];

        while (!salir) {
            int numrev = 0;
            double[] volt = volteaArrayInt(registros);
            numrev = registros.length;
            for (int i = 0; i < registros.length; i++) {
                System.out.println(numrev + ": " + volt[i]);
                numrev = numrev -1;
            }
            System.out.print("Introduce un numero o un caracter de operacion (+, -, *, /): ");
            num = sc.nextLine();

            if (num.equalsIgnoreCase("Q")) {
                System.out.println("Adios");
                salir = true;
            } else if (num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/")) {
                if (num.equals("+")) {
                    double temp = registros[1] + registros[0];
                    for (int i = 1; i <= registros.length - 1; i++) {
                        registros[i-1] = registros[i];
                    }
                    registros[0] = temp;
                }
                if (num.equals("-")) {
                    double temp = registros[1] - registros[0];
                    for (int i = 1; i <= registros.length - 1; i++) {
                        registros[i-1] = registros[i];
                    }
                    registros[0] = temp;
                }
                if (num.equals("*")) {
                    double temp = registros[1] * registros[0];
                    for (int i = 1; i <= registros.length - 1; i++) {
                        registros[i-1] = registros[i];
                    }
                    registros[0] = temp;
                }
                if (num.equals("/")) {
                    double temp = registros[1] / registros[0];
                    for (int i = 1; i <= registros.length - 1; i++) {
                        registros[i-1] = registros[i];
                    }
                    registros[0] = temp;
                }
                // ...
            } else {
                double numDouble = Double.parseDouble(num);
                //double ultimoNumero = registros[registros.length - 1];
                for (int i = registros.length - 1; i > 0; i--) {
                    registros[i] = registros[i - 1];
                }
                registros[0] = numDouble;
            }
        }
    }

    public static double[] volteaArrayInt(double[] array) {
        double[] arrayVolteado = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayVolteado[i] = array[array.length - 1 - i];
        }
        return arrayVolteado;
    }
}