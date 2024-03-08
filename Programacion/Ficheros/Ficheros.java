import java.io.File;
import java.io.IOException;

public class Ficheros {
    public static void main(String[] args) {
        try {
            System.out.println("Vamos a crear un fichero");
            File file = new File("fichero.txt");
            if (file.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("El fichero ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error: no puedo crear el fichero");
        }
    }
}