import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        int fichaJugador;

        Scanner sc = new Scanner(System.in);

        char[][] tablero = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };

        do {
            System.out.print("Dime en qué posición colocas la ficha (1-9): ");
            fichaJugador = sc.nextInt();

        } while (fichaJugador <= 0 || fichaJugador > 9);

        if (fichaJugador == 2) {
            tablero[0][1] = 'X';
            mostrarTablero(tablero);
        }

        // Cogemos una posición de la matriz
        System.out.println(tablero[1][1]);

    }

    // Clase para mostrar la matriz en forma de tablero
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
}
   
