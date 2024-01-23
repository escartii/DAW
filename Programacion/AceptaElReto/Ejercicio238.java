import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numBilletes = scanner.nextInt();
            int numParticipantes = scanner.nextInt();

            if (numBilletes == 0 && numParticipantes == 0) {
                break;
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
        Queue<ArrayList<Integer>> colaReparto = new LinkedList<>();
        for (int i = 0; i < numParticipantes; i++) {
            colaReparto.offer(new ArrayList<>());
        }

        for (int i = 0; i < billetes.size(); i++) {
            colaReparto.peek().add(billetes.get(i));
            colaReparto.offer(colaReparto.poll());
        }

        Stack<String> resultados = new Stack<>();

        while (!colaReparto.isEmpty()) {
            ArrayList<Integer> participante = colaReparto.poll();
            int total = 0;
            for (int valor : participante) {
                total += valor;
            }
            
            StringBuilder resultado = new StringBuilder(total + ":");
            for (int i = 0; i < participante.size(); i++) {
                resultado.append(" ").append(participante.get(i));
            }

            resultados.push(resultado.toString());
        }

        while (!resultados.isEmpty()) {
            System.out.println(resultados.pop());
        }
    }
}
