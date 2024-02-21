package RepasoExamen;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creamos un ArrayList para almacenar objetos Camión
        ArrayList<Camion> camiones = new ArrayList<Camion>();

        camiones.add(new Camion("Toyota", "tuprima", 1234));
        camiones.add(new Camion("Toyota", "tuprima", 1234));
        camiones.add(new Camion("Toyota", "tuprima", 1234));
        // Imprimimos los objetos del ArrayList usando un bucle foreach
        for (Camion camion : camiones) {
            System.out.println(camion);
        }
    }
}
