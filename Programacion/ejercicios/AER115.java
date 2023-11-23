import libreria.FNumDaw;
import java.util.Scanner;

public class AER115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while ((numero = sc.nextInt()) != 0) {
            if (numero >= 1 && numero < 65536) {
                if (FNumDaw.esKaprekar(numero)) {
                    System.out.println(numero + " es Kaprekar.");
                } else {
                    System.out.println(numero + " no es Kaprekar.");
                }
            }
        }
    }
}
