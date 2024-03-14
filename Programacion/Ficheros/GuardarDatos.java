import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Introduce el texto (escribe 'salir' para terminar):");
            String respuesta = sc.nextLine();

            if (respuesta.equals("salir")) {
                System.out.println("Hasta luego");
                salir = true;
            } else {
                try {
                    // el true es para añadir al fichero.
                    FileWriter fileWriter = new FileWriter("file1.txt", true);
                    fileWriter.write(respuesta + "\n");
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
