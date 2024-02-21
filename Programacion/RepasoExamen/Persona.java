package RepasoExamen;

class Persona {
    // Atributos
    private String nombre ="";
    private int edad = 0;

    public  Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString para imprimir la información de la persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}