package com.escarti;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicios {

    public int suma(int a, int b) {
        return a + b;
    }


    public int[] ordenar(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public double average (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

}
