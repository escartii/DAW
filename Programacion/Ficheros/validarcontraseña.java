import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class validarcontraseña {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el password: ");
        String password = sc.nextLine();

        try {

            File f = new File("file1.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                // guardamos en el array, todo lo cortado a partir de los dos putos puntos
                String[] palabras = linea.split(":");

                if (palabras[0].equals(nombre)) {
                    if (palabras[1].equals(password)) {
                        System.out.println("El usuario y la contraseña coinciden");
                    } else {
                        System.out.println("contraseña incorrecta");
                    }
                } else {
                    System.out.println("no existe el usuario");
                }
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
