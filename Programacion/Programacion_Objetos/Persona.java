/**
 * The Persona class represents a person with a name, last name, NIF, and address.
 * It provides constructors to initialize the object with different sets of parameters,
 * and a toString() method to return a string representation of the object.
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;
    
    /**
     * Constructs a Persona object with the specified name, last name, NIF, and address.
     * 
     * @param nombre the name of the person
     * @param apellidos the last name of the person
     * @param NIF the NIF (identification number) of the person
     * @param direccion the address of the person
     */
    public Persona(String nombre, String apellidos, String NIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    /**
     * Constructs a Persona object with the specified name, last name, and NIF.
     * The address is set to an empty address.
     * 
     * @param nombre the name of the person
     * @param apellidos the last name of the person
     * @param NIF the NIF (identification number) of the person
     */
    public Persona(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = new Direccion("", "", "", "");
    }

    /**
     * Returns a string representation of the Persona object.
     * 
     * @return a string representation of the object
     */
    public String toString() {
        return "Nombre: " + nombre + " apellidos: " + apellidos + " NIF: " + NIF + " Direccion: " + direccion.toString();
    }
}
