import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);  // Creamos el objeto

    System.out.println("Cuántos huevos caben en la cazuela ? : ");
    int numHuevos = myObj.nextInt();
    System.out.println("Cuántos huevos quieres cocer? : ");
    int huevosCocidos = myObj.nextInt();
    // Tardas 10 minutos hasta que llenas la cazuela
    
    int tiempoTotalCoccion = (int) Math.ceil((double) huevosCocidos / numHuevos) * 10;
    // Math.ceil es una clase que permite redondear al siguiente número
    // dividimos los huevos que cocer entre huevos que caben
    // El resultado de la división redondea a 1 y lo multiplica por 10
    // y el double redondea al siguiente numero

    System.out.println("El tiempo total de cocción será de " + tiempoTotalCoccion + " minutos.");
    }
}