package Programacion_Dinamica;
import java.util.Scanner;
public class calculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();


        switch (respuesta) {
            case 1:
                System.out.println("Has elegido sumar: ");
                break;
            case 2:
                System.out.println("Has elegido restar:");
            default:
                break;
        }






    }
}
