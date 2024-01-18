import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio702 {
    public static void main(String[] args) {
        int dinerotot = 0;
        Scanner sc = new Scanner(System.in);
        dinerotot = sc.nextInt();
        int agenda = sc.nextInt();
        sc.nextLine();

        TreeMap<String, String> treemap = new TreeMap<String, String>();
        // Pregunto la fecha y los casos
        for (int i = 1; i <= agenda; i++) {
            String fecha = sc.next();
            String cutFecha = fecha.substring(0, 2);
            String cutFecha2 = fecha.substring(3, 5);
            // System.out.println(cutFecha2 + "-" + cutFecha);
            String cortado = (cutFecha2 + "-" + cutFecha);
            String diner0 = sc.next();
            // No me guardo la frase restante
            sc.nextLine();
            treemap.put(cortado, diner0);

        }

        for (int i = 1; i <= 12; i++) {
            // Recorro el mapa
            for (String key : treemap.keySet()) {
                // System.out.println("Fecha: " + key + ", Dinero: " + treemap.get(key));
                // Me guardo en uan variable el dinero para poder iterar con el
                String dineroo = treemap.get(key);
                // System.out.println(dineroo);
                // Compuebo que Parte01 que es la del mes sea == i
                // si es igual sumas o restas y cuando acabes de recorrer el foreach muestra la
                // suma total
                String keyFecha = key.substring(0, 2);
                int keyFechaInt = Integer.parseInt(keyFecha);
                if (keyFechaInt == i) {
                    // sumatotal + dineroo parseado
                    int dineroint = Integer.parseInt(dineroo);
                    dinerotot = dinerotot + dineroint;
                }
            }
            System.out.print(dinerotot + " ");
        }
        System.out.println("");
    }
}
