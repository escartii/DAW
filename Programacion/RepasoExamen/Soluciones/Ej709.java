import java.util.HashMap;
import java.util.Scanner;

public class Ej709 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos;
        String dato;
        HashMap  <String, Integer> list = new HashMap <String, Integer> ();
        int temp;
        int max = 0;
        String ganador = "";
        boolean empate = false;

        do {

            casos = sc.nextInt();
            if (casos > 0) {

                list.clear();
                max = 0;
                ganador = "";
                empate = false;

                for (int i = 0; i < casos; i++) {

                    dato = sc.next();

                    if(list.containsKey(dato)) {
                        temp = list.get(dato) + 1;
                        list.remove(dato);
                        list.put(dato,temp);
                    }
                    else list.put(dato, 1);

                }

                for (String sede : list.keySet()) {

                    if (list.get(sede) == max)
                        empate = true;
                    if (list.get(sede) > max) {
                        empate = false;
                        max = list.get(sede);
                        ganador = sede;

                    }

                }

                System.out.println(empate ? "EMPATE" : ganador);
            }

        } while (casos > 0);

    }

}