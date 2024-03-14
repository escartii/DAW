import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Galaxias> objects = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("SAC.bin");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Galaxias obj;
            while ((obj = (Galaxias) objectIn.readObject()) != null) {
                objects.add((Galaxias) obj);
                System.out.println(obj);
            }

            objectIn.close();
        } catch (EOFException e) {
            // End of file reached, do nothing
        } catch (Exception e) {
           
        }

        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Menu:");
            System.out.println("1. Filtrar por nombre del objeto");
            System.out.println("2. Filtrar por constelación");
            System.out.println("3. Filtrar por magnitud límite");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del objeto: ");
                    String nombre = sc.next();
                    for (Galaxias obj : objects) {
                        if (obj.getObject().equals(nombre)) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la constelación: ");
                    String constelacion = sc.next();
                    for (Galaxias obj : objects) {
                        if (obj.getCON().equals(constelacion)) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la magnitud límite: ");
                    double magnitudLimite = sc.nextDouble();
                    for (Galaxias obj : objects) {
                        if (Double.parseDouble(obj.getMAG()) <= magnitudLimite) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
