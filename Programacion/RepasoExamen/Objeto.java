package RepasoExamen;
import java.util.ArrayList;


    public class Objeto {
        public static void main(String[] args) {
            ArrayList<Persona> personasList = new ArrayList<Persona>();

            // Crear instancias de la clase Persona
            Persona persona1 = new Persona("Juan", 30);
            Persona persona2 = new Persona("Ana", 25);
            Persona persona3 = new Persona("Luis", 33);

            // Agregar las personas al ArrayList
            personasList.add(persona1);
            personasList.add(persona2);
            personasList.add(persona3);

            // Imprimir la información de las personas en el ArrayList
            System.out.println("Personas en el ArrayList:");
            for (Persona persona : personasList) {
                System.out.println(persona);
            }
        }
    }

