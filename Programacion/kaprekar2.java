import java.util.Scanner;
import java.util.Scanner;

public class kaprekar2 {

    public static void main(String[] args) {
        int num;
        int cuadrado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        cuadrado = num * num;
        String cuadradoStr = String.valueOf(cuadrado);
        int numDigitos = cuadradoStr.length();
        int mitad = numDigitos / 2;
        int primeraParte = Integer.parseInt(cuadradoStr.substring(0, mitad));
        int segundaParte = Integer.parseInt(cuadradoStr.substring(mitad));
        if (num == primeraParte + segundaParte) {
            System.out.println("El numero "+ primeraParte + " + "+ segundaParte + " = " + num + " es Kaprekar");
        } else {
            System.out.println("El numero " + num + " no es Kaprekar.");
        }
    }
}
