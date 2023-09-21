package Tarea_3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

    Scanner myObj = new Scanner(System.in);  // Creamos el objeto 
    System.out.println("Introduce un número: ");

    int parametro = myObj.nextInt();  // Leemos la información que ha escrito el usuario
    System.out.println("Has introducido: " + parametro);  // Imprimo por pantalla lo que ha escrito el usuario

    // Cojo la variable introducida por el usuario y la multiplico 
    System.out.println(parametro+" * 0 = " +parametro * 0);
    System.out.println(parametro+" * 1 = " +parametro * 1);
    System.out.println(parametro+" * 2 = " +parametro * 2);
    System.out.println(parametro+" * 3 = " +parametro * 3);
    System.out.println(parametro+" * 4 = " +parametro * 4);
    System.out.println(parametro+" * 5 = " +parametro * 5);
    System.out.println(parametro+" * 6 = " +parametro * 6);
    System.out.println(parametro+" * 7 = " +parametro * 7);
    System.out.println(parametro+" * 8 = " +parametro * 8);
    System.out.println(parametro+" * 9 = " +parametro * 9);
    System.out.println(parametro+" * 10 = " +parametro * 10); 
    }


}
