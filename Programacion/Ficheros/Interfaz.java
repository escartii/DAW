import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        ArrayList<Galaxias> objetos = new ArrayList<>();
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SAC.bin"));
            
            while (true) {
                // Deserializar el fichero
                try {
                    Galaxias objeto = (Galaxias) ois.readObject();
                    objetos.add(objeto);
                } catch (ClassNotFoundException e) {
                    System.out.println("Clase no encontrada: " + e.getMessage());
                } catch (IOException e) {
                    break;
                }
            }
            ois.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Nombre del objeto");
            System.out.println("2. Constelación");
            System.out.println("3. Magnitud límite");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre del objeto: ");
                    String nombre = sc.next();
                    int i = 0;
                    while (i < objetos.size()) {
                        Galaxias galaxia = objetos.get(i);
                        if (galaxia.getObject().equalsIgnoreCase(nombre)) {
                            System.out.println(galaxia.getObject());
                        }
                        i++;
                    }
                    break;
                case 2:
                    System.out.print("Introduce la constelacion: ");
                    String constelacion = sc.next();
                    for (Galaxias galaxia : objetos) {
                        // por si acaso introduce en minusculas
                        if (galaxia.getCON().equalsIgnoreCase(constelacion)) {
                            System.out.println(galaxia.getCON()
                             + " " + galaxia.getRA()
                             + " " + galaxia.getDEC()
                             + " " + galaxia.getDEC()
                             );
                        }
                    }
                    break;
                case 3:
                    System.out.print("Introduce la magnitud: ");
                    double magni = sc.nextDouble();
                    for (Galaxias galaxia : objetos) {
                        if (Double.parseDouble(galaxia.getMAG()) <= magni) {
                            System.out.println(galaxia.getMAG());
                        }
                    }
                    break;
                case 4:
                    System.out.println("FIN DEL PROGRAMA");
                    System.exit(0);
                default:
                    System.out.println("Introduce un numero valido.");
            }
        } while (opcion != 4);
        sc.close();
    }
}
