import java.util.Scanner;

public class ejercicio710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int equipos = sc.nextInt();
            // Creo un array de 6 posiciones, 0-5
            int[] plazas = new int[6];
            for (int j = 0; j < plazas.length; j++) {
                plazas[j] = sc.nextInt();
            }
            int plazasRepesca = equipos - (plazas[0] + plazas[1] + plazas[2] + plazas[3] + plazas[4] + plazas[5]);
            System.out.println(plazasRepesca);
        }
    }
}
