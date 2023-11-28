import java.util.Scanner;

public class kaprekar2 {
    // Función Mostrarstak: Va a mostrar los numeros
    public static void Mostrarstak(double[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            String numerocon0 = String.format("%02d", (i+1));
            System.out.println(numerocon0 + ":  " + array[i]);
        }
        System.out.println("Pulsa q para salir");
    }

    /*
    // Calcula el número de elementos no nulos en un array de tipo double.
    public static int contRelleno(double[] array) {
        int relleno = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) {
                relleno +=1;
            }
        }
        return relleno;
    }
    */

    public static double[] guardar(double[] array,double numGuardar) {
        /*if (contRelleno(array)==array.length){
            System.out.println("ESTOY LLENO NO ME CABE MAS");
            return array;
        }
        */
        double[] arrayvolteado = new double[array.length];
        for (int i = 0; i < array.length-1; i++) {
            arrayvolteado[i+1] = array[i];
        }
        arrayvolteado[0] = numGuardar;
        return arrayvolteado;
    }

    public static double[] guardarResultados(double[] array,double numGuardar) {
        double[] arrayvolteado = new double[array.length];
        for (int i = 1; i < array.length-1; i++) {
            arrayvolteado[i-1] = array[i+1];
        }
        arrayvolteado[0] = numGuardar;
        return arrayvolteado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean salir;
        String entrada = "";
        double resultado = 0;
        boolean valid;

        System.out.print("Numero entre 4 y 20: ");
        num = sc.nextInt();
        double[] array = new double[num];

        salir = false;
        sc.nextLine();
        while (!salir) {
            valid = false;
            Mostrarstak(array);
            System.out.print("Entrada: ");
            entrada = sc.nextLine();
            if (entrada.matches("-?\\d+(\\.\\d+)?")) {
                double numeroDouble = Double.parseDouble(entrada);
                array = guardar(array, numeroDouble);
            } else {
                double num1 = array[0];
                double num2 = array[1];

                if (entrada.equalsIgnoreCase("q")) {
                    salir = true;
                    valid = true;
                }

                if (entrada.equalsIgnoreCase("+")) {
                    resultado = num1 + num2;
                    array = guardarResultados(array, resultado);
                    valid = true;
                }

                if (entrada.equalsIgnoreCase("*")) {
                    resultado = num1 * num2;
                    array = guardarResultados(array, resultado);
                    valid = true;
                }

                if (entrada.equalsIgnoreCase("/")) {
                    resultado = num2 / num1;
                    array = guardarResultados(array, resultado);
                    valid = true;
                }

                if (entrada.equalsIgnoreCase("-")) {
                    resultado = num2 - num1;
                    array = guardarResultados(array, resultado);
                    valid = true;
                }

                if (!valid) {
                    System.out.println("Opcion no valida");
                }
            }
        }
        sc.close();
    }
}
