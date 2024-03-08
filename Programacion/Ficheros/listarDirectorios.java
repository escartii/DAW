import java.io.File;

public class listarDirectorios {

    public static void main(String[] args) {
        if (args.length > 0) {
            String nombre = args[0];
            File archivo = new File(nombre);
            
            if (archivo.exists()) {
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                System.out.println("Tamaño: " + archivo.length() + " bytes");
                System.out.println("Permisos: ");
                System.out.println("  Lectura: " + archivo.canRead());
                System.out.println("  Escritura: " + archivo.canWrite());
                System.out.println("  Ejecución: " + archivo.canExecute());
                
                if (archivo.isDirectory()) {
                    System.out.println(nombre + " es un directorio.");
                } else if (archivo.isFile()) {
                    System.out.println(nombre + " es un fichero.");
                }
            } else {
                System.out.println("El archivo o directorio no existe.");
            }
        } else {
            System.out.println("Debe proporcionar un nombre como argumento.");
        }
    }
}
