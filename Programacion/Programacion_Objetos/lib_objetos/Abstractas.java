package lib_objetos;
// Definición de la clase abstracta Animal
abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado por las clases hijas
    public abstract void hacerSonido();

    // Método concreto que puede ser utilizado por todas las clases hijas
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

// Clase Perro que hereda de la clase Animal
class Perro extends Animal {
    public Perro(String nombre) {
        // super sirve para invocar la clase
        super(nombre);
    }

    // Implementación del método abstracto hacerSonido()
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau!");
    }
}

// Clase Gato que hereda de la clase Animal
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    // Implementación del método abstracto hacerSonido()
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau!");
    }
}

// Clase principal que utiliza las clases Animal, Perro y Gato
public class Abstractas {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Garfield");

        perro.hacerSonido(); // Imprime "El perro hace: ¡Guau!"
        gato.hacerSonido(); // Imprime "El gato hace: ¡Miau!"

        perro.dormir(); // Imprime "Firulais está durmiendo."
        gato.dormir(); // Imprime "Garfield está durmiendo."
    }
}
