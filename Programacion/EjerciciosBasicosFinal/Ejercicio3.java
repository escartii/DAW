import java.util.Scanner;
import java.lang.Math;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("¿Cuánto vale 'A':  ");
        double a = myObj.nextDouble();
        System.out.println("¿Cuánto vale 'B': ");
        double b = myObj.nextDouble();
        System.out.println("¿Cuánto vale 'C': ");
        double c = myObj.nextDouble();

        double d = b * b - 4.0 * a * c;  // Calculo que el numero sea real 
        if (d> 0.0) {  // si es menor que 0.0 no lo puede calcular 
            double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
            System.out.println("El resultado de X es: " + x1 + " El resultado de x2 es: " + x2);  
        } else {  
            System.out.println("No puedo calcular numeros negativos");  
        }  
    }  
}
