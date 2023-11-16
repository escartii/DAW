package CadenasString;

public class cadenas {
    public static void main(String[] args) {
        // length() - Obtener la longitud de la cadena:
        String str = "Hola, mundo!";
        int longitud = str.length();
        System.out.println("Longitud de la cadena: " + longitud);
        // charAt(int index) - Obtener el carácter en una posición específica:
        char caracter = str.charAt(7);
        System.out.println("Carácter en la posición 7: " + caracter);
        //substring(int beginIndex) - Obtener una subcadena desde el índice especificado:
        String subcadena = str.substring(6);
        System.out.println("Subcadena desde la posición 6: " + subcadena);
        //substring(int beginIndex, int endIndex) - Obtener una subcadena desde el índice de inicio hasta el índice de fin (no incluido):
        String subcadena2 = str.substring(0, 4);
        System.out.println("Subcadena desde la posición 0 hasta la 3: " + subcadena2);
        // toLowerCase() - Convertir la cadena a minúsculas:
        String minusculas = str.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);
        //toUpperCase() - Convertir la cadena a mayúsculas:
        String mayusculas = str.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);
        //indexOf(String str) - Encontrar la posición de una subcadena dentro de la cadena:
        int indice = str.indexOf("mundo");
        System.out.println("Índice de la subcadena 'mundo': " + indice);
        //replace(char oldChar, char newChar) - Reemplazar un carácter en la cadena:
        String nuevaCadena = str.replace('o', '0');
        System.out.println("Reemplazar 'o' con '0': " + nuevaCadena);
        // startsWith(String prefix) - Verificar si la cadena comienza con un prefijo dado:
        boolean comienzaCon = str.startsWith("Hola");
        System.out.println("¿La cadena comienza con 'Hola'? " + comienzaCon);
        // endsWith(String suffix) - Verificar si la cadena termina con un sufijo dado:
        boolean terminaCon = str.endsWith("!");
        System.out.println("¿La cadena termina con '!'? " + terminaCon);
    }
}
