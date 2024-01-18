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
                billetes.add(scanner.nextInt());
            }

            repartirBotin(numParticipantes, billetes);
            System.out.println("---");
        }
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
