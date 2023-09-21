package Tarea_3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

    Scanner myObj = new Scanner(System.in);  // Creamos el objeto 
    System.out.println("Introduce un número: ");

    int parametro = myObj.nextInt();  // Leemos la información que ha escrito el usuario
    System.out.println("Has introducido: " + parametro);  // Imprimo por pantalla lo que ha escrito el usuario


    int multiplicar0 = parametro * 0; // Cojo la variable introducida por el usuario y la multiplico 
    int multiplicar1 = parametro * 1;
    int multiplicar2 = parametro * 2;
    int multiplicar3 = parametro * 3;
    int multiplicar4 = parametro * 4;
    int multiplicar5 = parametro * 5;
    int multiplicar6 = parametro * 6;
    int multiplicar7 = parametro * 7;
    int multiplicar8 = parametro * 8;
    int multiplicar9 = parametro * 9;
    int multiplicar10 = parametro * 10;
    System.out.println(+parametro+ " * 0 es = "+multiplicar0);
    System.out.println(+parametro+ " * 1 es = "+multiplicar1);
    System.out.println(+parametro+ " * 2 es = "+multiplicar2); 
    System.out.println(+parametro+ " * 3 es = "+multiplicar3);
    System.out.println(+parametro+ " * 4 es = "+multiplicar4);
    System.out.println(+parametro+ " * 5 es = "+multiplicar5); 
    System.out.println(+parametro+ " * 6 es = "+multiplicar6); 
    System.out.println(+parametro+ " * 7 es = "+multiplicar7);  
    System.out.println(+parametro+ " * 8 es = "+multiplicar8);
    System.out.println(+parametro+ " * 9 es = "+multiplicar9);
    System.out.println(+parametro+ " * 10 es = "+multiplicar10);       
    //System.out.println(multiplicar0+ " " +multiplicar1);
    }


}
