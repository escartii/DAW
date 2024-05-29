package com.acalabuig;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;
public class TestUnitarios {
    

    private Cultivo cultivo;
    private Empleado empleado;
    private Maquinaria maquinaria;
    private Producto producto;

    @Before
    public void setUp(){
        cultivo = new Cultivo("Alvaro", 10, 1);
        empleado = new Empleado("Alvaro", "Director de orquesta", 5000);
        maquinaria = new Maquinaria("Jardineria", 10, 50);
        producto = new Producto("Balon", 10);
    }

    @Test
    public void testCultivo(){
        assertEquals("Alvaro", cultivo.getNombre());
        assertNotEquals("Jardineria", cultivo.getNombre());
        assertEquals(10, cultivo.getArea(), 0.00001);
        assertEquals(1, cultivo.getRendimiento(), 0.0001);
        cultivo.setNombre("Javi");
        assertEquals("Javi", cultivo.getNombre());
        cultivo.setArea(33.33);
        assertEquals(33.33, cultivo.getArea(), 0.001);
        cultivo.setRendimiento(10);
        assertEquals(10, cultivo.getRendimiento(), 0.001);
    }

    @Test
    public void testEmpleado(){
        assertEquals("Alvaro", empleado.getNombre());
        assertEquals("Director de orquesta", empleado.getCargo());
        assertEquals(5000, empleado.getSalario(), 0.0001);
        empleado.setNombre("Antonio");
        assertEquals("Antonio", empleado.getNombre());
        empleado.setCargo("Jefe");
        assertEquals("Jefe", empleado.getCargo());
        empleado.setSalario(3000);
        assertEquals(3000, empleado.getSalario(), 0.0001);
    }

    @Test
    public void testMaquinaria(){
        assertEquals("Jardineria", maquinaria.getTipo());
        assertEquals(10, maquinaria.getHoraUso(), 0.0001);
        assertEquals(50, maquinaria.getEficiencia(), 0.001);
    }


}
