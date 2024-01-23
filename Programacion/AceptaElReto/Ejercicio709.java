import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finPrograma = false;
        Map<String, Integer> votos = new TreeMap<String, Integer>();
    
        while (!finPrograma) {
            int equipos = Integer.parseInt(sc.next());
            if (equipos == 0) {
                finPrograma = true;
            } else {
                int maxVotos = 0;
                String ganador = "";
                boolean empate = false;

                for (int i = 0; i < equipos; i++) {
                    String candidatura = sc.next();

                    // Verificar si la clave ya existe en el mapa
                    if (votos.containsKey(candidatura)) {
                        votos.put(candidatura, votos.get(candidatura) + 1); 
                    } else {
                        votos.put(candidatura, 1);
                    }

                    int numVotos = votos.get(candidatura);
                    if (numVotos > maxVotos) {
                        maxVotos = numVotos;
                        ganador = candidatura;
                        empate = false;
                    } else if (numVotos == maxVotos) {
                        empate = true;
                    }
                }

                // Imprimir los votos de cada país
                for (Map.Entry<String, Integer> entry : votos.entrySet()) {
                    String pais = entry.getKey();
                    int votosPais = entry.getValue();
                    // System.out.println("Pais: " + pais);
                    // System.out.println("");
                    // System.out.print(pais + ": " + votosPais);
                }
                System.out.println();
                if (empate) {
                    System.out.println("EMPATE");
                } else {
                    System.out.println(ganador);
                }
                
                votos.clear();
            }
        }
    }
}
