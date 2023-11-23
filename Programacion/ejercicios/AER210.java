import libreria.FNumDaw;
import java.util.Scanner;

public class AER210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while (n != 0) {
            // Declaramos las variables necesarias
            String palabra = sc.next();
            int suma = 0;

            // Calculamos la suma de los códigos ASCII de los caracteres de la palabra y su largaria
            for (int i = 0; i < palabra.length(); i++) {
                suma += palabra.charAt(i);
            }

            // Obtenemos el número primo inferior más cercano a la suma
            int primo = FNumDaw.anteriorPrimo(suma);

            // Imprimimos la respuesta
            System.out.println(primo);
            n--;
        }
    }
}
