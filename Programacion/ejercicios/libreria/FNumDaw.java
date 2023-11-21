package libreria;
import java.util.Scanner;
 // Para commit

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

     public static boolean kaprekar(int num){
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
    }

    // LIbreria para vectores

    



    public static void main(String[] args) {
        int base;
        int exponente;
        double resultado;
        int number;
        int largaria;
        int numero;
        int numeroInvert;
        int numCapi;
        boolean esCapicua;
        boolean esPrimo;
        int primoSiguiente;
        int primoAnterior;
        int segundoNumero;
        String concatenacion = "";

        System.out.println("Ejercicio de: **Alvaro Escarti**");
        Scanner sc = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Dime la base: ");
        base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        exponente = sc.nextInt();
        resultado = potencia(base, exponente);
        System.out.println(resultado);
        
        // Ejercicio 2
        System.out.print("Escribe un numero: ");
        number = sc.nextInt();
        largaria = cuentaDigitos(number);
        System.out.println(largaria);

        // Ejercicio 3
        System.out.print("Escribe el numero para darle la vuelta: ");
        numero = sc.nextInt();
        numeroInvert = voltea(numero);
        System.out.println(numeroInvert);

        // Ejercicio 4
        System.out.print("Escribe un numero para comprobar si es capicua: ");
        numCapi = sc.nextInt();
        esCapicua = esCapicua(numCapi);
        System.out.println(esCapicua);

        // Ejercicio 5
        System.out.print("Escribe un numero para comprobar si es primo: ");
        numero = sc.nextInt();
        esPrimo = esPrimo(numero);
        System.out.println(esPrimo);

        // Ejercicio 6
        System.out.print("Escribe un numero: ");
        numero = sc.nextInt();
        primoSiguiente = siguientePrimo(numero);
        System.out.println("Has introducido: "+ numero + " y el primo siguiente es:  " + primoSiguiente);

        // Ejercicio 7
        System.out.print("Escribe un numero: ");
        numero = sc.nextInt();
        primoAnterior = anteriorPrimo(numero);
        System.out.println("Has introducido: "+ numero + " y el primo anterior es:  " + primoAnterior);

        // Ejercicio 8
        System.out.print("Introduce dos numeros: ");
        numero = sc.nextInt();
        System.out.print("Escribe el segundo numero: ");
        segundoNumero = sc.nextInt();
        concatenacion = pegarNumeros(numero, segundoNumero);
        System.out.println(concatenacion);

        // Ejercicio kaprekar

        System.out.print("Introduce un numero para saber si es kaprekar: ");
        numero = sc.nextInt();
        boolean eskaprekar = kaprekar(numero);
        System.out.println(eskaprekar);

    }
}
