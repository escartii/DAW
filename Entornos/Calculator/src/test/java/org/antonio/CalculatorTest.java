package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    // Álvaro Escartí -------- 1º DAW

    @Test
    public void testAdd(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(5, ejerciciosCalculator.add(3,2), 0);
        assertTrue(5 == ejerciciosCalculator.add(3, 2));
        assertNotEquals(6, ejerciciosCalculator.add(3, 2));
    }

    @Test
    public void testSubstract(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(1, ejerciciosCalculator.subtract(3,2), 0);
        assertTrue(1 == ejerciciosCalculator.subtract(3, 2));
        assertNotEquals(6, ejerciciosCalculator.subtract(3, 2));
        
    }

    @Test
    public void testMultiply(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(6, ejerciciosCalculator.multiply(3,2), 0);
        assertTrue(6 == ejerciciosCalculator.multiply(3, 2));
        assertNotEquals(9, ejerciciosCalculator.multiply(3, 2));
        
    }

    @Test
    public void testDivide(){
        Calculator ejerciciosCalculator = new Calculator();
        assertEquals(2, ejerciciosCalculator.divide(4,2), 0);
        assertTrue(2 == ejerciciosCalculator.divide(4, 2));
        assertNotEquals(16, ejerciciosCalculator.divide(3, 2));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        Calculator ejerciciosCalculator = new Calculator();
        ejerciciosCalculator.divide(3, 0);
    }

}
