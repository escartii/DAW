package com.escarti;

import static org.junit.Assert.*;

import org.junit.Test;

public class EjerciciosTest {
    
    int [] array = {0,1,2};

    @Test
    public void testSuma() {
        // creo un objeto de la clase Ejercicios
        Ejercicios ejercicios = new Ejercicios();
        assertEquals(5, ejercicios.suma(2, 3));
        assertEquals(-5, ejercicios.suma(-3, -2));
        assertEquals(3, ejercicios.suma(6, -3));
        assertEquals(3, ejercicios.suma(3, 0));

        assertNotEquals(7, ejercicios.suma(4, 2));
    }

    @Test
    public void testOrdenar() {
        Ejercicios ejercicios = new Ejercicios();
        assertArrayEquals(new int[]{-1, 0, 3}, ejercicios.ordenar(array));
        // primero es el que se espera, segundo es el que se obtiene
        assertArrayEquals(new int[]{-1, 3, 0}, ejercicios.ordenar(array));
    }

    @Test
    // el delta sirve para que un valor tenga un margen
    public void testAverage(){
        Ejercicios ejercicios = new Ejercicios();
        assertEquals(2.5, ejercicios.average(new int[] {1,2,3,4}), 0.01);
        assertEquals(-2.5, ejercicios.average(new int[] {-1,-2,-3,-4}), 0.01);
        assertNotEquals(-2.6, ejercicios.average(new int[] {-1,-2,-3,-4}), 0.01);       
    }

    @Test
    public void testBinarySearch(){
        Ejercicios ejercicios = new Ejercicios();
        assertTrue(0 <= ejercicios.binarySearch(array, 999));
        assertFalse(-1 == ejercicios.binarySearch(array, 0));
    }

    @Test
    public void testCelsiusToFarenheit(){
        Ejercicios ejercicios = new Ejercicios();
        assertEquals(41, ejercicios.celsiusToFarenheit(5), 0.01);
    }
}
