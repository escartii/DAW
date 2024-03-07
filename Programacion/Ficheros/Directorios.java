import java.io.File;
import java.io.IOException;

public class Directorios {
    public static void main(String[] args) throws IOException {
        System.out.println("Vamos a crear un directorio");
        File directorio = new File("Directorio");
        if (directorio.mkdir()){
            System.out.println("Directorio creado: " + directorio.getName());
        } else {
            System.out.println("El directorio ya existe");
        }

        // Métodos de la clase File:
        directorio.delete();
        directorio.renameTo(new File("test"));
        directorio.exists();
        directorio.isFile();
        directorio.isDirectory();
        directorio.listFiles();
        directorio.getName();
        directorio.getPath();
        directorio.getAbsolutePath();
        directorio.getParent();
        directorio.canWrite();
        directorio.canExecute();
        directorio.canRead();

    }
}