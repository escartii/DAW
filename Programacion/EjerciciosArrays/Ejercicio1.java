import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[15];
        // Leo los 15 números y los guardo en el array
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Roto el array una posición a la derecha
        int lastNumber = numbers[14];
        for (int i = 13; i >= 0; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[0] = lastNumber;

        // Muestro el contenido del array
        System.out.println("Rotated array:");
        for (int i = 0; i < 15; i++) {
            System.out.println(numbers[i]);
        }
    }
}
