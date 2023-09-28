import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        int edad;
        String titulacion;
        int experiencia;

        //Pedimos los datos al usuario mediante el metodo Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        edad = myObj.nextInt();
        //System.out.print("Introduce tu titulación académica: ");
        //titulacion = myObj.next();
        //System.out.print("Introduce tu experiencia laboral (en años): ");
        //experiencia = myObj.nextInt();
        boolean puedeAcceder = (edad >= 18); // Booleano para comprobar si es mayor o igual que 18 años.
        if (puedeAcceder){
            System.out.println("Eres mayor de edad, cumples un requisito");
        }else{
            System.out.println("Lo siento, no puedes acceder al Grado Superior");
        }

    }
}