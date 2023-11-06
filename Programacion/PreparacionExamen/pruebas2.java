package PreparacionExamen;

import java.util.Scanner;

public class pruebas2 {
    public static void main(String[] args) {

        boolean salir = true;
        String usuario = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un nombre de usuario");
            usuario = sc.nextLine();
            if (usuario.equals("Alvaro") ||
                    (usuario.equals("Javi") ||
                    (usuario.equals("Marc")))) {
                    salir = false;
            }
        } while (salir);
    }
}
