package PreparacionExamen;
import java.util.Scanner;

public class dni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Dni;
        int resto;
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M',  'Y', 'F', 'P',  'D', 'X', 'B',  'N', 'J', 'Z',  'S', 'Q', 'V',  'H', 'L', 'C',  'K', 'E'};
        System.out.print("Yo te dire la letra ");
        System.out.print("Numero del DNI: ");
        Dni = sc.nextInt();
        resto = Dni % 23;
        System.out.print("Tu letra es "+letras[resto]);
        System.out.print("Tu DNI queda asi "+Dni+letras[resto]);

    }
}