package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
public class TestFruta {
    Fruta fruta = new Fruta(null, false);

    @Before
    public void setUp() {
        fruta = new Fruta("Fruta del Diablo", true);
    }

    @Test
    public void testPuedoComerFrutaDeliciosa() { 
        Fruta fruta = new Fruta("Manzana", true); 
        assertTrue(fruta.puedoComer());
    }

    @Test public void testNoPuedoComerFrutaDelDiablo() { 
        Fruta fruta = new Fruta("Fruta del Diablo", true); 
        assertFalse(fruta.puedoComer()); 
    }

    @Test
    public void testPuedoComerFrutaNoDeliciosa() {
        Fruta fruta = new Fruta("Durian", false);
        assertFalse(fruta.puedoComer());
    }

}

    
