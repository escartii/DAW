package Funciones;

import java.util.Arrays;

import ejercicios.libreria.Vector;

public class pruebaLibreriaV {
    public static void main(String[] args) {
        String[] vectorS;
        // Llamamos a la función para rellenar el vector
        vectorS = Vector.rellenaVectorStr(5);
        System.out.println(Arrays.toString(vectorS));
    }
}