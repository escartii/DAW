package AceptaElReto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio709 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leer el número de votos
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            // Leer las candidaturas
            Map<String, Integer> conteo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    String candidatura = scanner.next();
                    conteo.put(candidatura, conteo.getOrDefault(candidatura, 0) + 1);
                }
            }

            // Determinar la candidatura ganadora o si hay empate
            int maxVotos = 0;
            String ganadora = "";
            boolean empate = false;

            for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
                if (entry.getValue() > maxVotos) {
                    maxVotos = entry.getValue();
                    ganadora = entry.getKey();
                    empate = false;
                } else if (entry.getValue() == maxVotos) {
                    empate = true;
                }
            }

            // Imprimir el resultado
            if (empate) {
                System.out.println("EMPATE");
            } else {
                System.out.println(ganadora);
            }
        }

        scanner.close();
    }
}