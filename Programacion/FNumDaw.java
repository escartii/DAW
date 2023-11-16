import libreria;
import java.util.Scanner;

public class FNumDaw {
        
    public static double potencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce el exponente: ");
        double exponente = scanner.nextDouble();
        scanner.close();
        double resultado = Math.pow(base, exponente);
        return resultado;
    }
    
}
