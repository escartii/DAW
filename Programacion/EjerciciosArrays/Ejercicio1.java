import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        // Leo los 15 números y los guardo en el array
        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce un número: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Roto el array una posición a la derecha
        int ultimoNumero = numeros[14];
        for (int i = 13; i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[0] = ultimoNumero;

        // Muestro el contenido del array
        System.out.println("**Array rotada:**");
        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }
    }
}

