import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        // Alvaro Escartí 1º DAW 
        int cuadrado;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        cuadrado = num * num;
        String numeros = String.valueOf(cuadrado);
        char[] digitos = numeros.toCharArray();
        System.out.println("\nEl numero que has introducido elevado a 2, es: " + cuadrado);

        int suma = 0;
        sc.close();

        String cuadradoStr = String.valueOf(cuadrado);
        for (int i = 0; i < cuadradoStr.length(); i++) {
            char numSeparado = digitos[i];
            int cuadradoNum = Character.getNumericValue(numSeparado);
            suma = suma + cuadradoNum;
            if (cuadradoStr.length() == 4) {
                String primeraParte = cuadradoStr.substring(0, 2);
                String segundaParte = cuadradoStr.substring(3,4);
                int primeraParteNum = Integer.parseInt(primeraParte);
                int segundaParteNum = Integer.parseInt(segundaParte);
                suma = primeraParteNum + segundaParteNum;
            }
            if (cuadradoStr.length() == 6) {
                String primeraParte = cuadradoStr.substring(0, 3);
                String segundaParte = cuadradoStr.substring(3,6);
                int primeraParteNum = Integer.parseInt(primeraParte);
                int segundaParteNum = Integer.parseInt(segundaParte);
                suma = primeraParteNum + segundaParteNum;
            }
        }
        System.out.println("La suma de los números es: " + suma);
        if (suma == num) {
            System.out.println("El numero es Kaprekar");
        } else {
            System.out.println("El numero no es Kaprekar");
        }
    }
}
