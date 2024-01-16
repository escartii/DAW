package AceptaElReto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio238 {
    public static void main(String[] args) {
        // Primera linea son los billetes y la segunda las personas entre que se reparten 
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int billetes = sc.nextInt();
        int personas = sc.nextInt();
        int contador = 0;
        System.out.println(billetes + " " + personas);

        for (int i = 0; i <= billetes; i++) {
            sc.nextInt();
            numeros.add(i);
        }

    }
}
