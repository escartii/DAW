package Funciones;

public class primerafuncion {

    static int sumar (int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public static String saludar(String nombre) {
        String saludo = "Hola " + nombre;
        return saludo;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int suma = 0;
        suma = sumar(num1, num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " es = " + suma);

        String saludo = saludar("Alvaro");
        System.out.println(saludo);
    }
}
