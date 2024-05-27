package com.acalabuig.model;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MaquinariaTest {

    private Maquinaria maquinaria;

    @Before
    public void setUp(){
        maquinaria = new Maquinaria("Tractor", 50, 4);
    }

    @Test
    public void testCalcularTiempoArado(){
        assertEquals(2.5, maquinaria.calcularTiempoArado(10.0), 0.01);
    }

    @Test
    public void testAnyadirHorasTrabajo(){
        maquinaria.anyadirHorasTrabajo(40);
        assertEquals(90, maquinaria.getHoraUso(), 0.01);
    }

}
