package com.escarti;

import static org.junit.Assert.*;

import org.junit.Test;

public class EjerciciosTest {
    
    int [] array = {3, 0, -1};

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
    public void testAverage(){
        Ejercicios ejercicios = new Ejercicios();
        assertEquals(2.5, ejercicios.average(new int[] {1,2,3,4}), 0.01);
    }

    
}
