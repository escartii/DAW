import java.util.Scanner;

public class Ejercicio1 {
    public static String codificarFila(String fila) {
        StringBuilder codificada = new StringBuilder();
        char valorInicial = fila.charAt(0);
        int contador = 1;

        for (int i = 1; i < fila.length(); i++) {
            char caracterActual = fila.charAt(i);

            if (caracterActual == valorInicial) {
                contador++;
            } else {
                codificada.append(contador).append(" ");
                valorInicial = caracterActual;
                contador = 1;
            }
        }
        codificada.append(contador);
        return codificada.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la dimension de caracteres: ");
        int dimension = sc.nextInt();
        sc.nextLine();
        String[] lineas = new String[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese la línea " + (i + 1) + ": ");
            lineas[i] = sc.nextLine();
        }

        System.out.println("Codificación de las líneas:");
        for (String linea : lineas) {
            String codificada = codificarFila(linea);
            System.out.println(codificada);
        }
    }
}

