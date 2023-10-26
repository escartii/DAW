package Programacion_estructurada.Extra;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int preguntas = 10;
    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;
    int contador = 0; 

    while (contador != preguntas){
        System.out.print("Cómo se llama el profesor de programación?");
        String respuesta = sc.nextLine();

        if (respuesta.equals("Gines")){
            System.out.println("Correcto");
            respuestasCorrectas++;
            System.out.print("Cuántos años tiene Gines?");
            int respuesta2 = sc.nextInt();
            if (respuesta2 == 30){
                System.out.println("Correcto");
                respuestasCorrectas++; 
            }else{
                System.out.println("Incorrecto");
                respuestasIncorrectas++;
            }   
        }else{
            System.out.println("Incorrecto");
            respuestasIncorrectas++;
        }
        contador++;
        }
    }
}


