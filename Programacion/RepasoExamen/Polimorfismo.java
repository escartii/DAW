class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo un sonido genérico...");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau miau!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal miAnimal;

        // Creamos un objeto de tipo Perro
        miAnimal = new Perro();
        miAnimal.hacerSonido(); // Salida: El perro ladra: ¡Guau guau!

        // Creamos un objeto de tipo Gato
        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Salida: El gato maúlla: ¡Miau miau!
    }
}
