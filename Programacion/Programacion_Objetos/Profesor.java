public class Profesor extends Persona {
    private String nDespacho;

    public Profesor(){
        super("", "", "");
    }

    public Profesor(String nombre, String apellidos, String NIF, Direccion Direccion, String nDespacho){
        super(nombre,apellidos,NIF,Direccion);
        this.nDespacho = nDespacho;
    }

    public Profesor(String nombre, String apellidos, String NIF, String nDespacho){
        super(nombre,apellidos,NIF);
        this.nDespacho = nDespacho;
    }

 
    public String toString() {
        return super.toString() + "Numero despacho : " + nDespacho;
    }
}
