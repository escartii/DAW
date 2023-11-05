package PreparacionExamen;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int respuesta = sc.nextInt();

        for (int i = 0; i < respuesta; i++){
            // Mientras que i sea menor que lo introducido por el usuario, ejecutate
            System.out.println(respuesta);
        }
    }
}
