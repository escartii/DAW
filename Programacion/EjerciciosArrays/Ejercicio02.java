import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        int fichaJugador;
        int fila;
        int columna;

        Scanner sc = new Scanner(System.in);

        char[][] tablero = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };
        boolean condition = true;
        while (condition) {
            do {
                // Limpiar la pantalla
                // 1
                System.out.print("\033[H\033[2J");
                mostrarTablero(tablero);
                System.out.print("Dime en qué posición colocas la ficha (1-9): ");
                fichaJugador = sc.nextInt();

            } while (fichaJugador <= 0 || fichaJugador > 9);

            if (fichaJugador == 1) {
                tablero[0][0] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 2) {
                tablero[0][1] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 3) {
                tablero[0][2] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 4) {
                tablero[1][0] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 5) {
                tablero[1][1] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 6) {
                tablero[1][2] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 7) {
                tablero[2][0] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 8) {
                tablero[2][1] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }
            if (fichaJugador == 9) {
                tablero[2][2] = 'X';
                System.out.println(" ");
                mostrarTablero(tablero);
            }

            // Turno del ordenador (O)
            System.out.println("Turno del ordenador (O):");
            do {
                System.out.println("Turno del ordenador (O):");
                fila = (int) (Math.random() * 3);
                columna = (int) (Math.random() * 3);
            } while (tablero[fila][columna] == 'X' && tablero[fila][columna] == 'O');
            tablero[fila][columna] = 'O';
            mostrarTablero(tablero);

            // Cogemos una posición de la matriz
            // System.out.println(tablero[1][1]);

            // Comprobar Usuario Diagonales
            if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
                System.out.println("Has ganado!");
                break;
            }

            if (tablero[2][0] == 'X' && tablero[1][1] == 'X' && tablero[0][2] == 'X') {
                System.out.println("Has ganado!");
                break;
            }

            // Comprobar Usuario horizontal
            if (tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
                System.out.println("Has ganado!");
                break;
            }
            if (tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X') {
                System.out.println("Has ganado!");
                break;
            }
            if (tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X') {
                System.out.println("Has ganado!");
                break;
            }

            // Comprobar Diagonales PC
            if (tablero[0][0] == '0' && tablero[1][1] == '0' && tablero[2][2] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }

            if (tablero[2][0] == '0' && tablero[1][1] == '0' && tablero[0][2] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }
            // Comprobar PC horizontal
            if (tablero[0][0] == '0' && tablero[0][1] == '0' && tablero[0][2] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }
            if (tablero[1][0] == '0' && tablero[1][1] == '0' && tablero[1][2] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }
            if (tablero[2][0] == '0' && tablero[2][1] == '0' && tablero[2][2] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }
        }
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
