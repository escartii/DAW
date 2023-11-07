package PreparacionExamen;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        boolean shouldBreak = false;
        String colorVerde = "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        String nombre = "Alvaro";
        String apellido = " Escarti";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int respuesta = sc.nextInt();

        for (int i = 0; i < respuesta; i++){
            // Mientras que i sea menor que lo introducido por el usuario, ejecutate
            System.out.println(respuesta);
        }

        System.out.println("Hecho por: " + colorVerde + nombre  + apellido + resetColorCode);
    }
}
        
 
    

