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

    public int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length -1;
        while (low <= high){
            int mid = (low + high) /2;
            if (array[mid] == key) {
                return mid;

                
            }else if (array[mid] < key) {
                low = mid +1;

            } else {
                high = mid -1;
            }
        }
        return -1;
    }

    public double celsiusToFarenheit(double celsius){
        return (celsius * 9 / 5) +32;
    }

}
