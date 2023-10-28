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
                System.out.print("\033[H\033[2J");
                mostrarTablero(tablero);
                System.out.print("Dime en qué posición colocas la ficha (1-9): ");
                fichaJugador = sc.nextInt();

            } while (fichaJugador <= 0 || fichaJugador > 9);

            // Comprobar si la posición elegida está libre
            fila = (fichaJugador - 1) / 3;
            columna = (fichaJugador - 1) % 3;
            if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
                System.out.println("La posición elegida ya está ocupada. Elige otra.");
                continue;
            }

            switch (fichaJugador) {
                case 1 -> {
                    tablero[0][0] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 2 -> {
                    tablero[0][1] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 3 -> {
                    tablero[0][2] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 4 -> {
                    tablero[1][0] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 5 -> {
                    tablero[1][1] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 6 -> {
                    tablero[1][2] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 7 -> {
                    tablero[2][0] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 8 -> {
                    tablero[2][1] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
                case 9 -> {
                    tablero[2][2] = 'X';
                    System.out.println(" ");
                    mostrarTablero(tablero);
                }
            }

            // Turno del ordenador (O)
            System.out.println("Turno del ordenador (O):");
            do {
                fila = (int) (Math.random() * 3);
                columna = (int) (Math.random() * 3);
            } while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O');
            tablero[fila][columna] = 'O';


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

            // Comprobar vertical usuario
             if (tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') { // x x x
                System.out.println("Has ganado!");
                break;
            }
             if (tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X') {
                System.out.println("Has ganado!");
                break;
            }
             if (tablero[2][0] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X') {
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
            // Comprobar vertical usuario
             if (tablero[0][0] == 'O' && tablero[1][0] == 'O' && tablero[2][0] == '0') { // x x x
                System.out.println("Ha ganado PC");
                break;
            }
             if (tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == '0') {
                System.out.println("Ha ganado PC");
                break;
            }
             if (tablero[2][0] == 'O' && tablero[1][2] == '0' && tablero[2][2] == '0') {
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