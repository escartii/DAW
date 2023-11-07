package PreparacionExamen;

import java.util.Scanner;

public class pruebas2 {
    public static void main(String[] args) {
        int [][] vector = {{1,2,3,4,5,6,7,8,9}};
        boolean salir = true;
        String usuario = "";
        Scanner sc = new Scanner(System.in);
        final int numeroConstante = 9;

        do {
            System.out.println("Introduce un nombre de usuario");
            usuario = sc.nextLine();
            if (usuario.equals("Alvaro") ||
                    usuario.equals("Javi") ||
                    usuario.equals("Marc")) {
                salir = false;
            }
        } while (salir);

        // Mostrar los elementos de la matriz
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println();
            System.out.println(numeroConstante);
        }
    }
}
