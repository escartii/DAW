public class Ejercicio22 {
    public static void main (String[] args) {
        short edad = 22; // Elijo short porque con la variable byte quizás alguien tiene mas de 127 años aunque no es habitual.
        int codigoPostal = 4624; // He comprobado añadiendole una variable, short solo acepta 1 byte.
        double altura = 1.70; 
        double miPeso = 72.5;
        char hombre = 'H';
        char mujer = 'M';
        String nombre = "Alvaro";
        byte numHijos = 11; // Utilizo byte porque nadie tiene mas de 127 hijos.
        int porcentajeIVA = 21;
        System.out.println(porcentajeIVA+" %");
        double precio = 79.99;
        System.out.println(precio+"€");
        String mensaje = "Hola buenas tardes, bienvenido a mi segundo ejercicio de java";
        System.out.println(mensaje);
        int minutos = 60;
        System.out.println(minutos);
        int dias = 30;
        System.out.println(dias);

    }
}