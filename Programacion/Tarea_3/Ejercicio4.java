import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);  // Creamos el objeto 

    System.out.println("Dime un número de insectos: ");
    int patasInsectos = myObj.nextInt();
    System.out.println("Dime un número de arácnidos: ");
    int patasAracnidos = myObj.nextInt();
    System.out.println("Dime un número de crustáceos: ");
    int patasCrustaceos = myObj.nextInt();
    System.out.println("Dime un número de ciempiés: ");
    int numCiempies = myObj.nextInt();
    System.out.println("Dime cuántos segmentos tiene ciempiés: ");
    int segmentosCiempies = myObj.nextInt();
    System.out.println("Dime un número de milpiés: ");
    int numMilpies = myObj.nextInt();
    System.out.println("Dime cuántos segmentos tiene milpiés: ");
    int patasMilpies = myObj.nextInt();
    // Cálculos

    int calcularPatasInsectos = patasInsectos * 6;
    int calcularPatasAracnidos = patasAracnidos * 8;
    int calcularPatasCrustaceos = patasCrustaceos * 10;
    int calcularSegmentos =  numCiempies*segmentosCiempies * 2;
    int calcularSegmentos2 = numMilpies*patasMilpies *4;

    System.out.println(calcularPatasInsectos+calcularPatasAracnidos+calcularPatasCrustaceos+calcularSegmentos+calcularSegmentos2);


    }

}