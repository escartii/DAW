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
        
    }

}
