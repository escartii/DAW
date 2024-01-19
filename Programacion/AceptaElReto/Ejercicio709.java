package AceptaElReto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finPrograma = false;
        int equipos = Integer.parseInt(sc.next());

        while (!finPrograma) {
            Map<String, Integer> votos = new TreeMap<String, Integer>();
            int maxVotos = 0;
            String ganador = "";

            // Leer votos
            for (int i = 0; i <= equipos; i++) {
                String candidatura = sc.next();
                votos.put(candidatura, votos.getOrDefault(candidatura, 0) + 1);
                int numVotos = votos.get(candidatura);
                if (numVotos > maxVotos) {
                    maxVotos = numVotos;
                    ganador = candidatura;
                } else if (numVotos == maxVotos) {
                    ganador = "EMPATE";
                }
            }

            // Imprimir resultado
            System.out.println(ganador);

            // Imprimir conteo de votos por país
            for (Map.Entry<String, Integer> entry : votos.entrySet()) {
                String pais = entry.getKey();
                int votosPais = entry.getValue();
                System.out.println(pais + ": " + votosPais);
            }
            votos.clear();
            // Salir
            if (equipos == 0) {
                finPrograma = true;
            }

        }
    }
}
