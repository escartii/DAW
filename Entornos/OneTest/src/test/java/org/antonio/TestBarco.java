package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
public class TestBarco {

    Barco barco = new Barco(null, 0);

    @Before
    public void setUp() {
        barco = new Barco("Thousand Sunny", 5);
    }

    @Test
    public void testAgregarTripulante() {
        assertTrue(barco.agregarTripulante());
        assertEquals(6, barco.getCapacidad());
    }

    @Test
    public void testAgregarTripulanteMaximo() {
        Barco barcoMaximo = new Barco("Going Merry", 10);
        assertFalse(barcoMaximo.agregarTripulante());
        assertEquals(10, barcoMaximo.getCapacidad());
    }
    
}
