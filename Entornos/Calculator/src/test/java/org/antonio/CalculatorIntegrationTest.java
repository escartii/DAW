package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {

    // Álvaro Escartí -------- 1º DAW

    @Test
    public void testAddAndSubstract(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(10, ejerciciosCalculator.add(5,ejerciciosCalculator.subtract(15, 10)));
        assertEquals(15, ejerciciosCalculator.add(5,ejerciciosCalculator.subtract(20, 10)));
        assertNotEquals(5, ejerciciosCalculator.add(5,ejerciciosCalculator.subtract(15, 10)));
        assertNotEquals(9, ejerciciosCalculator.add(5,ejerciciosCalculator.subtract(10, 2)));
    }

    @Test
    public void testAddWithZero(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(5, ejerciciosCalculator.add(5, 0), 0);
        assertEquals(3, ejerciciosCalculator.add(3, 0), 0);
        assertNotEquals(1, ejerciciosCalculator.add(5, 0), 0);
        assertTrue(5 == ejerciciosCalculator.add(5, 0));
    }

    @Test
    public void testSubtractWithZero(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(5, ejerciciosCalculator.subtract(5, 0), 0);
        assertEquals(3, ejerciciosCalculator.subtract(3, 0), 0);
        assertNotEquals(1, ejerciciosCalculator.subtract(5, 0), 0);
        assertTrue(5 == ejerciciosCalculator.subtract(5, 0));
    }

    @Test
    public void testMultilyAndDivide(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(6.25, ejerciciosCalculator.multiply(5, ejerciciosCalculator.divide(5,4)),0.01);
        assertEquals(10, ejerciciosCalculator.multiply(5, ejerciciosCalculator.divide(10,2)),0);
        assertNotEquals(5, ejerciciosCalculator.multiply(5, ejerciciosCalculator.divide(5,4)),0);
        assertTrue(6.25 == ejerciciosCalculator.multiply(5, ejerciciosCalculator.divide(5,4)));
    }

    @Test
    public void testMultiplyWithZero(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(0, ejerciciosCalculator.multiply(5, 0), 0);
        assertEquals(0, ejerciciosCalculator.multiply(0, 5), 0);
        assertNotEquals(5, ejerciciosCalculator.multiply(5, 0), 0);
        assertTrue(0 == ejerciciosCalculator.multiply(5, 0));
    }

    @Test
    public void testDivideWithZero(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(0, ejerciciosCalculator.divide(0, 5), 0);
        assertEquals(0, ejerciciosCalculator.divide(0, 1), 0);
        assertNotEquals(5, ejerciciosCalculator.divide(0, 5), 0);
        assertTrue(0 == ejerciciosCalculator.divide(0, 5));
    }
}
