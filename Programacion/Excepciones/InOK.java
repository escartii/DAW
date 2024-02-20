package Programacion.Excepciones;
import java.util.Scanner;

public class InOK {
    static Scanner sc = new Scanner(System.in);

    public static void Leeint() {
        int comprobar = 0;

        try {
            System.out.println("Primera función");
            comprobar = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error, no es un numero entero.");
            sc.nextLine();
        }

    }

    public static void LeeIntPos(){
        int numero = 0;
        boolean esPositivo = false;

        while (!esPositivo) {
            try {
                System.out.println("Segunda función");
                numero = sc.nextInt();
                if (numero > 0) {
                    esPositivo = true;
                } else {
                    throw new Exception("Error, el número debe ser positivo.");
                }
            } catch (Exception e) {
                //getMessage lo coge de la nueva excepcion que hemos sacado
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } 
    }

    public static void LeeIntRango (){
        try {
            int num = sc.nextInt();
            if ((num > 100) || (num < 0)) {
                throw new Exception("Número fuera del rango [0,100]");
            }
        } catch (Exception e) {
            if (e.getMessage() == null) {
                System.out.println("No has introducido un número");
            }else{
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }

    public static void main(String[] args) {
        // Llamo al metodo
        Leeint();
        LeeIntPos();
        LeeIntRango();



    }
}
