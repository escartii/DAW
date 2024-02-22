import java.util.Scanner;

public class Ej709 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos;
        String dato;
        String[][] list;
        int i_final = 0;
        boolean found = false;
        int max = 0;
        String ganador = "";
        boolean empate = false;

        do {

            casos = sc.nextInt();
            if (casos > 0) {

                list = new String[casos][2];
                i_final = 0;
                found = false;
                max = 0;
                ganador = "";
                empate = false;

                for (int i = 0; i < casos; i++) {

                    dato = sc.next();

                    found = false;
                    for (int j = 0; j < i_final; j++) {
                        if (list[j][0].equals(dato)) {
                            list[j][1] = String.valueOf(Integer.valueOf(list[j][1]) + 1);
                            found = true;
                        }
                    }
                    if (!found) {

                        list[i_final][0] = dato;
                        list[i_final][1] = "1";
                        i_final++;

                    }

                }

                for (int i = 0; i < i_final; i++) {

                    if (Integer.valueOf(list[i][1]) == max)
                        empate = true;
                    if (Integer.valueOf(list[i][1]) > max) {
                        empate = false;
                        max = Integer.valueOf(list[i][1]);
                        ganador = list[i][0];

                    }

                }

                System.out.println(empate ? "EMPATE" : ganador);
            }

        } while (casos > 0);

    }

}