import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        // aux contador
        int intentos = 0;
        // condicion para salir del bucle
        boolean condicion = true;
        int anios;
        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);

        do {
            System.out.println("Sabes programar?");
            respuesta = sc.nextLine();
            if (respuesta.equals("Si")) {
                System.out.println("Cuantos años llevas programando?");
                anios = sc.nextInt();
                if (anios <= 1) {
                    System.out.println("Novato!");
                } else if (anios <= 5) {
                    System.out.println("Experto!");
                } else {
                    System.out.println("Oh maestro, te adoramos!");
                }
                condicion = false;
            } else if (respuesta.equals("No")) {
                System.out.println("Loooser!");
                condicion = false;
            } else {
                // incrementa el contador
                intentos++;
                // Salimos del bucle cuando fallemos 3 veces
                if (intentos == 3) {
                    System.out.println("Si no contestas bien me voy");
                    condicion = false;
                }
            }
        } while (condicion);
    }
}
