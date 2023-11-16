package CadenasString;

import java.util.Arrays;

public class cadenas {
    public static void main(String[] args) {
        // Crear una cadena para los ejemplos
        String cadena = "Hola, Mundo!";

        // charAt(int index)
        char caracterEnPosicion = cadena.charAt(7);
        System.out.println("charAt(7): " + caracterEnPosicion);

        // compareTo(String otraCadena)
        String otraCadena = "Hola";
        int comparacion = cadena.compareTo(otraCadena);
        System.out.println("compareTo('Hola'): " + comparacion);

        // concat(String str)
        String concatenada = cadena.concat(" ¡Bienvenido!");
        System.out.println("concat(' ¡Bienvenido!'): " + concatenada);

        // endsWith(String sufijo)
        boolean terminaCon = cadena.endsWith("Mundo!");
        System.out.println("endsWith('Mundo!'): " + terminaCon);

        // equalsIgnoreCase(String otraCadena)
        boolean igualesIgnorandoMayusculas = cadena.equalsIgnoreCase("hola, mundo!");
        System.out.println("equalsIgnoreCase('hola, mundo!'): " + igualesIgnorandoMayusculas);

        // getBytes()
        byte[] bytes = cadena.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes));

        // indexOf(int ch)
        int indice = cadena.indexOf('M');
        System.out.println("indexOf('M'): " + indice);

        // lastIndexOf(int ch)
        int ultimoIndice = cadena.lastIndexOf('o');
        System.out.println("lastIndexOf('o'): " + ultimoIndice);

        // length()
        int longitud = cadena.length();
        System.out.println("length(): " + longitud);

        // replace(char viejo, char nuevo)
        String reemplazada = cadena.replace('o', '0');
        System.out.println("replace('o', '0'): " + reemplazada);

        // substring(int inicio, int final)
        String subcadena = cadena.substring(6, 11);
        System.out.println("substring(6, 11): " + subcadena);

        // toLowerCase()
        String enMinusculas = cadena.toLowerCase();
        System.out.println("toLowerCase(): " + enMinusculas);

        // toUpperCase()
        String enMayusculas = cadena.toUpperCase();
        System.out.println("toUpperCase(): " + enMayusculas);

        // trim()
        String conEspacios = "   Hola   ";
        String sinEspacios = conEspacios.trim();
        System.out.println("trim(): '" + sinEspacios + "'");
    }
}

