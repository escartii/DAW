import java.io.File;
import java.util.Scanner;

public class listarDirectorios {

    public static void main(String[] args) {
        String ruta = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la ruta del directorio a listar");
        ruta = sc.nextLine();
        if (ruta.length() > 0){
            // Crea un objeto File con la ruta proporcionada por el usuario
            File f = new File(ruta);
            if(f.isDirectory()) {
                File[] ficheros = f.listFiles();
                System.out.println("Listado de los ficheros");
                for (File file : ficheros) {
                    System.out.println("\t" + file.getName());
                }
            }
        }
    }
}