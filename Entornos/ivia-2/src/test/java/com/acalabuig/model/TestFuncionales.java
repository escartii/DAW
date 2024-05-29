package com.acalabuig.model;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;
public class TestFuncionales {
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

    @Test(expected = IllegalArgumentException.class)
    public void testCultivoConstructorException(){
        cultivo = new Cultivo("Rodolfo", -12, -14);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpleadoConstructorException(){
        empleado = new Empleado("Marc", "rascarse los huevos", -10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testProductoConstructorException(){
        producto = new Producto("Balon", -50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaquinariaConstructorException(){
        maquinaria = new Maquinaria("tractor", 50, -40);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaquinariaHorasNegativas(){
        maquinaria = new Maquinaria("tractoraco", -5, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaquinariaHectareasnegativas(){
        maquinaria = new Maquinaria("tractoraco", 4, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAumentoNegativo(){
        empleado.darAumento(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorAbajo(){
        producto.calcularPrecioConDescuento(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorArribaExcepcion(){
        producto.calcularPrecioConDescuento(120);
    }
    
}
