import java.util.Scanner;
import java.util.Arrays;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Cuantas comprobaciones quieres hacer: ");
        num = in.nextInt();

        for (int k = 0; k < num; k++) {
            int numClientes = in.nextInt();
            int[][] maletas = new int[numClientes][];
            for (int i = 0; i < numClientes; i++) {
                int numMaletas = in.nextInt();
                int[] maletasCliente = new int[numMaletas];
                for (int j = 0; j < numMaletas; j++) {
                    maletasCliente[j] = in.nextInt();
                }
                Arrays.sort(maletasCliente);
                maletas[i] = maletasCliente;
            }

            int numViajes = 0;
            int[] car = new int[10];
            int index = 0;
            for (int i = 0; i < numClientes; i++) {
                for (int j = 0; j < maletas[i].length; j++) {
                    if (index == 10) {
                        numViajes++;
                        car = new int[10];
                        index = 0;
                    }
                    car[index] = maletas[i][j];
                    index++;
                }
            }
            if (index > 0) {
                numViajes++;
            }
            System.out.println(numViajes);
        }
    }
}
