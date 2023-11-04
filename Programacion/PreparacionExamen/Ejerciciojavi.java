package PreparacionExamen;

import java.util.Scanner;

public class Ejerciciojavi {
    public static void main(String[] args) {

        int[] mivector = new int[23];
        mivector[0] = 'T';
        mivector[1] = 'R';
        mivector[2] = 'W';
        mivector[3] = 'A';
        mivector[4] = 'G';
        mivector[5] = 'M';
        mivector[6] = 'Y';
        mivector[7] = 'F';
        mivector[8] = 'P';
        mivector[9] = 'D';
        mivector[10] = 'X';
        mivector[11] = 'B';
        mivector[12] = 'N';
        mivector[13] = 'J';
        mivector[14] = 'Z';
        mivector[15] = 'S';
        mivector[16] = 'Q';
        mivector[17] = 'V';
        mivector[18] = 'H';
        mivector[19] = 'L';
        mivector[20] = 'C';
        mivector[21] = 'K';
        mivector[22] = 'E';


        Scanner sc = new Scanner(System.in);
        int dni;
        int division;
        int resto;

        System.out.println("Introduce tu DNI: ");
        dni = sc.nextInt();

        resto = dni % 23;
        //System.out.println(resto);

        int posicion = resto;
        char letra = (char) mivector[posicion];
        System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);

    }
}