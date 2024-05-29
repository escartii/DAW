package com.acalabuig.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmpleadoTest {
    
    private Empleado empleado;

    @Before
    public void setUp(){
        empleado = new Empleado("Alvaro", "Jefe", 5000);
    }

    @Test
    public void testCalculaSalarioAnual(){
        assertEquals(60000, empleado.calculaSalarioAnual(), 0.001);
        assertNotEquals(500, empleado.calculaSalarioAnual(), 0.001);
    }
    
    @Test
    public void testDarAumento(){
        empleado.darAumento(30);
        assertEquals(6500, empleado.getSalario(), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNombreCultivoNoPuedeSerVacio(){
        empleado = new Empleado("", "jefecito", 5550);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSalarioDebeSerPositivo(){
        empleado = new Empleado("alvaro", "jefe", -50);
    }
}
