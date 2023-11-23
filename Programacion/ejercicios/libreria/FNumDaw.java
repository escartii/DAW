package libreria;
import java.util.Scanner;


public class FNumDaw {
    
    public static double potencia(double base, double exponente) {
    
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

    public static int cuentaDigitos(int number) {

        int resultado = String.valueOf(number).length();
        return resultado;
    }

    public static int voltea(int numero){
        String numeroString = String.valueOf(numero);
        String numeroInvertidoString = new StringBuilder(numeroString).reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoString);
        return numeroInvertido;
    }

    public static boolean esCapicua(int numero) {
        int numeroInvertido = voltea(numero);
        return numero == numeroInvertido;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    public static int anteriorPrimo(int numero) {
        int primoAnterior = numero - 1;
        while (!esPrimo(primoAnterior)) {
            primoAnterior--;
        }
        return primoAnterior;
    }

    public static int digitoN(int numero, int posicion) {
        String numeroString = String.valueOf(numero);
        char digito = numeroString.charAt(posicion);
        return Character.getNumericValue(digito);
    }

    public static int posicionDeDigito(int numero, int digito) {
        String numeroString = String.valueOf(numero);
        String digitoString = String.valueOf(digito);
        int posicion = numeroString.indexOf(digitoString);
        return posicion;
    }

    public static int parteNumero(int numero, int posicionInicial, int posicionFinal) {
        String numeroString = String.valueOf(numero);
        String trozo = numeroString.substring(posicionInicial, posicionFinal + 1);
        return Integer.parseInt(trozo);
    }

    public static String pegarNumeros(int numero, int segundoNumero){
        String resultado = (numero + "" + segundoNumero);
        return resultado;
    }

     public static boolean esKaprekar(int num){
        boolean EsKaprekar;
        int cuadrado = num * num;
        String cuadradoStr = String.valueOf(cuadrado);
        int numDigitos = cuadradoStr.length();
        int mitad = numDigitos / 2;
        int primeraParte = Integer.parseInt(cuadradoStr.substring(0, mitad));
        int segundaParte = Integer.parseInt(cuadradoStr.substring(mitad));
        if (num == primeraParte + segundaParte) {
            EsKaprekar = true;
        } else {
            EsKaprekar = false;
        }
        return EsKaprekar;
    }  // Libreria para vectores
}

