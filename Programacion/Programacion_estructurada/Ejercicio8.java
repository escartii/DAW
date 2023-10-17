import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Declaro las variables
        int numUsuario;
        int numeroAleatorio;

        Scanner sc = new Scanner(System.in);
        // Compruebo que el dia introducido es correcto
        do {
            System.out.println("Opcion 1) Piedra");
            System.out.println("Opcion 2) Papel");
            System.out.println("Opcion 3) Tijera");
            System.out.println("Opcion 4) Lagarto");
            System.out.println("Opcion 5) Spock");

            System.out.print("Elige una opción: ");
            numUsuario = sc.nextInt();
        } while (numUsuario <= 0 || numUsuario >= 6);
        // Numero random que juega el PC
        numeroAleatorio = (int) (Math.random()*5+1);

        if (numUsuario == numeroAleatorio) {
            System.out.println("Empate");
        } else if (numUsuario == 1 && numeroAleatorio == 2) {
            System.out.println("Has elegido: Piedra" + "\nEl PC ha elegido: Papel");
            System.out.println("Gana el PC");
        } else if (numUsuario == 1 && numeroAleatorio == 3) {
            System.out.println("Has elegido Piedra" + "\nEl PC ha elegido: Tijera");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 2 && numeroAleatorio == 1) {
            System.out.println("Has elegido Papel" + "\nEl PC ha elegido: Piedra");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 2 && numeroAleatorio == 3) {
            System.out.println("Has elegido Papel" + "\nEl PC ha elegido: Tijera");
            System.out.println("Gana el PC");
        } else if (numUsuario == 3 && numeroAleatorio == 1) {
            System.out.println("Has elegido Tijera" + "\nEl PC ha elegido: Piedra");
            System.out.println("Gana el PC");
        } else if (numUsuario == 3 && numeroAleatorio == 2) {
            System.out.println("Has elegido Tijera" + "\nEl PC ha elegido: Papel");
            System.out.println("Gana el usuario");

            // EMPIEZA EL JUEGO AÑADIENTO LA OPCION SPOCK
        } else if (numUsuario == 4 && numeroAleatorio == 1) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Piedra");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 4 && numeroAleatorio == 2) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Papel");
            System.out.println("Gana el PC");
        } else if (numUsuario == 4 && numeroAleatorio == 3) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Tijera");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 1 && numeroAleatorio == 4) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Spock");
            System.out.println("Empate");
        } else if (numUsuario == 2 && numeroAleatorio == 4) {
            System.out.println("Has elegido Papel" + "\nEl PC ha elegido: Spock");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 3 && numeroAleatorio == 4) {
            System.out.println("Has elegido Tijera" + "\nEl PC ha elegido: Spock");
            System.out.println("Gana el PC");

            // Empieza el juego Spock
        }else if (numUsuario == 5 && numeroAleatorio == 1) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Spock");
            System.out.println("Empate");
        } else if (numUsuario == 5 && numeroAleatorio == 2) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Papel");
            System.out.println("Gana el PC");
        } else if (numUsuario == 5 && numeroAleatorio == 3) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Tijera");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 5 && numeroAleatorio == 4) {
            System.out.println("Has elegido Spock" + "\nEl PC ha elegido: Spock");
            System.out.println("Empate");
        } else if (numUsuario == 1 && numeroAleatorio == 5) {
            System.out.println("Has elegido Piedra" + "\nEl PC ha elegido: Spock");
            System.out.println("Gana el PC");
        } else if (numUsuario == 2 && numeroAleatorio == 5) {
            System.out.println("Has elegido Papel" + "\nEl PC ha elegido: Spock");
            System.out.println("Gana el usuario");
        } else if (numUsuario == 3 && numeroAleatorio == 5) {
            System.out.println("Has elegido Tijera" + "\nEl PC ha elegido: Spock");
            System.out.println("Gana el PC");
        }
    }
}