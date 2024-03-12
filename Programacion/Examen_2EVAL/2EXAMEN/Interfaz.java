import java.util.Scanner;
import java.util.ArrayList;
public class Interfaz extends Calculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("Introduzca la referencia del tablón:");
                String referencia = scanner.nextLine();
                System.out.println("Introduzca el volumen en metros cúbicos:");
                int m3 = scanner.nextInt();
                ArrayList<String> salida = Calculos.todo(referencia, m3);

                for (String resultados : salida) {
                    System.out.println(resultados);
                }
                
                System.out.println("¿Desea realizar otro cálculo? (s/n)");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("n")) {
                    salir = true;
                }
                scanner.nextLine(); // consume the newline character

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}