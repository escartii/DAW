import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finPrograma = false;

        while (!finPrograma) {
            int numBilletes = scanner.nextInt();
            int numParticipantes = scanner.nextInt();

            if (numBilletes == 0 && numParticipantes == 0) {
                finPrograma = true;
            }

            ArrayList<Integer> billetes = new ArrayList<>();
            for (int i = 0; i < numBilletes; i++) {
<<<<<<< HEAD
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
=======
                billetes.add(scanner.nextInt());
>>>>>>> 97cde85d7028ba4e6ca8944dab3e107efa74b345
            }

            repartirBotin(numParticipantes, billetes);
            System.out.println("---");
        }

        scanner.close();
    }

    private static void repartirBotin(int numParticipantes, ArrayList<Integer> billetes) {
        Collections.sort(billetes, Collections.reverseOrder());

        ArrayList<ArrayList<Integer>> reparto = new ArrayList<>();
        for (int i = 0; i < numParticipantes; i++) {
            reparto.add(new ArrayList<>());
        }

        int index = 0;
        for (int billete : billetes) {
            reparto.get(index).add(billete);
            index = (index + 1) % numParticipantes;
        }

        for (int i = 0; i < numParticipantes; i++) {
            int total = reparto.get(i).stream().mapToInt(Integer::intValue).sum();
            System.out.print(total + ": ");
            for (int j = 0; j < reparto.get(i).size(); j++) {
                System.out.print(reparto.get(i).get(j));
                if (j < reparto.get(i).size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
