import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class usuarioycontraseña {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el password: ");
        String password = sc.nextLine();

        try {
            // el true es para añadir al fichero.
            FileWriter fileWriter = new FileWriter("file1.txt");
            // Formateo la salida 
            fileWriter.write(nombre + ":" + password + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
