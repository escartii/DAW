package ejercicios.libreria;

import java.util.Scanner;

public class Vector {

    public static int[] generaArrayInt(int largo, int minimo, int maximo) {
        int[] array = new int[largo];
        for (int i = 0; i < largo; i++) {
            int numeroAleatorio = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
            array[i] = numeroAleatorio;
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int saberMinimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (saberMinimo > array[i]) {
                saberMinimo = array[i];
            }
        }

        return saberMinimo;
    }

    public static int maximoArrayInt(int[] array) {
        // 8 5 9 6 3 7 2 7 2
        int saberMaximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (saberMaximo < array[i]) {
                saberMaximo = array[i];
            }
        }
        return saberMaximo;
    }

    public static int mediaArrayInt(int[] array) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        media = suma / array.length;
        return media;
    }

    public static boolean estaEnArrayInt(int[] array, int num) {
        boolean saberNum = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                saberNum = true;
            }
        }
        return saberNum;
    }

    public static int posicionEnArrayInt(int[] array, int num) {
        int encontrarNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                encontrarNum = i;
            }
        }
        return encontrarNum;
    }
}
