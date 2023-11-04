import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        // Declaro mis variables
        int fichaJugador;
        int fila;
        int columna;
        // mientras que la posibilidades sean menor que 9 se puede seguir jugando
        boolean posibilidades = true;
        // para salir del programa si hay ganador
        boolean hayGanador = false;
        int numInt = 0;
        // Uso Scanner
        Scanner sc = new Scanner(System.in);
        // Matriz de 3 x 3 con char, porque necesito usar la X y O
        char[][] tablero = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };

        while (posibilidades) {
            while (hayGanador == false) {
                do {
                    System.out.print("\033[H\033[2J");
                    mostrarTablero(tablero);
                    System.out.println(" ");
                    System.out.print("Dime en qué posición colocas la ficha (1-9): ");
                    fichaJugador = sc.nextInt();

                } while (fichaJugador <= 0 || fichaJugador > 9);
                numInt++;
                // Comprobar si la posición elegida está libre
                // flag1
                fila = (fichaJugador - 1) / 3;
                columna = (fichaJugador - 1) % 3;
                if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
                    System.out.println("La posición elegida ya está ocupada. Elige otra.");
                    continue;
                }
                // Hago un switch para cada opción y que muestre el tablero otra vez con lo
                // añadido
                switch (fichaJugador) {
                    case 1:
                        tablero[0][0] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 2:
                        tablero[0][1] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 3:
                        tablero[0][2] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 4:
                        tablero[1][0] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 5:
                        tablero[1][1] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 6:
                        tablero[1][2] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 7:
                        tablero[2][0] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 8:
                        tablero[2][1] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                    case 9:
                        tablero[2][2] = 'X';
                        System.out.println(" ");
                        mostrarTablero(tablero);
                        break;
                }

                // Juega el ordenador
                if (numInt >= 9) {
                    posibilidades = false;
                    hayGanador = true;
                } else {
                    System.out.println("Turno del ordenador (O):");
                    System.out.println(" ");
                    do {
                        fila = (int) (Math.random() * 3);
                        columna = (int) (Math.random() * 3);
                    } while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O');
                    tablero[fila][columna] = 'O';
                }
                numInt++;
                // flag2
                // Cogemos una posición de la matriz
                // System.out.println(tablero[1][1]);

                // Comprobar Usuario Diagonales
                if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }

                if (tablero[2][0] == 'X' && tablero[1][1] == 'X' && tablero[0][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }

                // Comprobar Usuario horizontal
                if (tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }

                // Comprobar vertical usuario
                if (tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') { // x x x
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[0][2] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X') {
                    System.out.println("Has ganado!");
                    posibilidades = false;
                    hayGanador = true;
                }

                // Comprobar Diagonales PC
                if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }

                if (tablero[2][0] == 'O' && tablero[1][1] == 'O' && tablero[0][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                // Comprobar PC horizontal
                if (tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[1][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[2][0] == 'O' && tablero[2][1] == 'O' && tablero[2][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                // Comprobar vertical PC
                if (tablero[0][0] == 'O' && tablero[1][0] == 'O' && tablero[2][0] == 'O') { // x x x
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[0][1] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (tablero[0][2] == 'O' && tablero[1][2] == 'O' && tablero[2][2] == 'O') {
                    System.out.println("Ha ganado PC");
                    posibilidades = false;
                    hayGanador = true;
                }
                if (numInt > 9) {
                    posibilidades = false;
                }
                if (!hayGanador) {
                    System.out.println("No hay ganador");

                }
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