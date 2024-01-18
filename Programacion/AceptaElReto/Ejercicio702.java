import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio702 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String dinero = sc.next();
            int agenda = sc.nextInt();

            TreeMap<String, String> treemap = new TreeMap<String, String>();
            // Pregunto la fecha y los casos
            for (int i = 1; i <= agenda; i++) {
                String fecha = sc.next();
                String diner0 = sc.next();
                // No me guardo la frase restante
                sc.nextLine();
                // Añado la fecha y los casos dentro del mapa
                treemap.put(fecha, diner0);
                
            }

            // Recorro el mapa
            for (String key : treemap.keySet()) {
                System.out.println("Fecha: " + key + ", Dinero: " + treemap.get(key));
            }
        }
    }
}
