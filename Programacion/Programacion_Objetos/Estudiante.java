public class Estudiante extends Persona {
    private String IDestudiante;

    public Estudiante() {
        // Como no se lo paso por parametro, viene vacio
        super("", "", "");
    }

    public Estudiante(String nombre, String apellidos, String NIF, Direccion Direccion, String IDestudiante) {
        super(nombre, apellidos, NIF, Direccion);
        this.IDestudiante = IDestudiante;
    }

    public Estudiante(String nombre, String apellidos, String NIF, String IDestudiante) {
        super(nombre, apellidos, NIF);
        this.IDestudiante = IDestudiante;
    }

    public String getIDestudiante() {
        return IDestudiante;
    }

    public void setIDestudiante(String iDestudiante) {
        IDestudiante = iDestudiante;
    }

    
    public String toString() { 
        return super.toString() + "Estudiante IDestudiante=" + IDestudiante;
    }

     // Método toString
     

    

}
