import java.io.File;

public class rmj {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No has pasado ningun parametro");
        } else {
            String nombrearchivo = args[0];
            File archivo = new File(nombrearchivo);

            if (archivo.isDirectory()){
                System.out.println("Has introducido un directorio");
            } else {
                if (archivo.exists()){
                    boolean borrado = archivo.delete();
                    System.out.println("El archivo: " + nombrearchivo + "Ha sido borrado exitosamente");
                } else {
                    System.out.println("No existe");
                }
            }
        }
    }
}