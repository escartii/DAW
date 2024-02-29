import java.util.InputMismatchException;
import java.util.Scanner;
public class Division2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Primer numero: ");
            int numerador = sc.nextInt();
            
            System.out.print("Segundo numero: ");
            int denominador = sc.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Problemas con la división");
        }
    }  
}
