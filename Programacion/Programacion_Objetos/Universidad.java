import java.util.ArrayList;
import java.util.List;
public class Universidad {
    public static void main(String[] args) {
        // Crear direcciones
        // Crear direcciones
        Direccion direccion1 = new Direccion("Calle Principal", "Ciudad A", "12345", "País A");
        Direccion direccion2 = new Direccion("Calle Secundaria", "Ciudad B", "54321", "País B");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "12345678A", "1");
        Estudiante estudiante2 = new Estudiante("María", "López", "87654321B", direccion2, "2");

        // Crear profesores
        Profesor profesor1 = new Profesor("Pedro", "García", "A1B2C3D4", direccion1, "Despacho 1");
        Profesor profesor2 = new Profesor("Ana", "Martínez", "D4C3B2A1", direccion2, "Despacho 2");

        // Crear lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(estudiante1);
        personas.add(estudiante2);
        personas.add(profesor1);
        personas.add(profesor2);

        // Mostrar información de todas las personas en la lista
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        
    }

}