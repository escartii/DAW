import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numBilletes = scanner.nextInt();
            int numParticipantes = scanner.nextInt();

            if (numBilletes == 0 && numParticipantes == 0) {
                break; // Salir si se ingresan dos ceros
            }

            // Leer los valores de los billetes
            int[] billetes = new int[numBilletes];
            for (int i = 0; i < numBilletes; i++) {
                billetes[i] = scanner.nextInt();
            }

            // Inicializar HashMap para almacenar los billetes de cada participante
            HashMap<Integer, ArrayList<Integer>> reparto = new HashMap<>();

            // Leer la asignación de billetes a cada participante
            for (int i = 0; i < numParticipantes; i++) {
                int participante = scanner.nextInt();
                reparto.put(participante, new ArrayList<>());

                // Leer los billetes asignados a este participante
                for (int j = 0; j < participante; j++) {
                    int billeteAsignado = scanner.nextInt();
                    reparto.get(participante).add(billeteAsignado);
                }
            }

            // Procesar y mostrar la salida
            for (int participante : reparto.keySet()) {
                int totalDinero = 0;
                System.out.print(participante + ":");
                for (int billete : reparto.get(participante)) {
                    totalDinero += billetes[billete - 1];
                    System.out.print(" " + billetes[billete - 1]);
                }
                System.out.println(totalDinero > 0 ? "\n" + totalDinero + ":" : "\n0:");
            }

            System.out.println("---");
        }

        scanner.close();
    }
}
