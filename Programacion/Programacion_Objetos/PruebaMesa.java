import lib_objetos.Mesa;

public class PruebaMesa {

    public static void main(String[] args) {
        // Creo mi objeto a partir de la clase Mesa de lib_objetos
        Mesa miMesa = new Mesa();
        System.out.println(miMesa.getColor());
        // Le cambiamos el color al objeto
        miMesa.setColor("Amarillo");
        System.out.println("Nuevo color: " + miMesa.getColor());
        System.out.println("Area: " + miMesa.area());
        System.out.println("Area en metros: " + miMesa.area("m"));
        System.out.println("Area en pulgadas: " + miMesa.area("in"));
        System.out.println("Otro area x: " + miMesa.area("x"));
        
        System.out.println("----");
        // le asignamos un valor a la variable color
        Mesa otraMesa = new Mesa("Azul",3,50,60, "Acero");
        System.out.println(otraMesa.getColor());

        
    }
}
