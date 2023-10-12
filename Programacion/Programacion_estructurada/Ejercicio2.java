import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Declaro las variables
        int num1;
        int num2;
        double result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la base: ");
        num1 = sc.nextInt();

        System.out.print("Escribe el exponente: ");
        num2 = sc.nextInt();

        for (double i = 0; i < num2; i++) {
            result *= num1;
        }
        System.out.println("El resultado es: " +result);
    }
}
