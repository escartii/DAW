import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int i = 0;
        int c = 0;
        int[][] m1 = new int[4][4];
        boolean esSimetrica = true;
        Scanner sc = new Scanner(System.in);
        // Rellenar la matriz por teclado

        while (i < 4) {
            int j = 0;
            while (j < 4) {
                System.out.print("Introduce el valor de la posición [" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        // reutilizo i
        i=0;
        // Comprobar si la matriz es simétrica
        while (i < 4) {
            for (int j = 0; j < 4; j++) {
                if (m1[i][j] != m1[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            i++;
        }
        // Mostrar el resultado
        if (esSimetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
        // muestrame la matriz por pantalla
        System.out.println("La matriz es: ");
        while (c < 4) {
            System.out.println();
            int j = 0;
            while (j < 4) {
                System.out.print(m1[c][j] + " ");
                j++;
            }
            c++;
        }
    }
}