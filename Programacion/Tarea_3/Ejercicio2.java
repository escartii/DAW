import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Creamos el objeto 
        
        
        System.out.println("¿Cuánto Pesas: ");
        double kilos = myObj.nextDouble();  
        System.out.println("¿Cuánto mides (en metros) : ");
        double altura = myObj.nextDouble(); 

        int b = 2; // defino el exponente
        double prueba = (Math.pow(altura, b));
        System.out.println(kilos/prueba);
        

    }
}