package com.acalabuig.model;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.acalabuig.model.Cultivo;

public class CultivoTest {
    private Cultivo cultivo;

    @Before
    public void setUp(){
        cultivo = new Cultivo("Villa Javi", 300, 1000);
    }
    
    @Test
    public void testCalcularRendimientoTotal(){
        assertEquals(300000, cultivo.calcularRendimientoTotal(), 0.01);
        assertNotEquals(30, cultivo.calcularRendimientoTotal(), 0.01);
        assertTrue (300000 == cultivo.calcularRendimientoTotal());
    }

    @Test
    public void testCalcularIngresos(){
        assertEquals(1500000, cultivo.calcularIngresos(5), 0.01);
        assertNotEquals(1500, cultivo.calcularIngresos(5), 0.01);
        assertTrue (1500000 == cultivo.calcularIngresos(5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNombreNoPuedeSerVacio(){
        cultivo = new Cultivo("", 50, 50);
        assertEquals("", cultivo.getNombre());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAreaDebeSerPositivo(){
        cultivo = new Cultivo("Alvaro", -50, 50);
    }

}
