package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
public class TestUnitarios {

    Luffy luffy = new Luffy(null, 0);
    Fruta fruta = new Fruta(null, false);
    Barco barco = new Barco(null, 0);
    Zoro zoro = new Zoro(null, 0);

    @Before
    public void setUp() {
        luffy = new Luffy("Luffy", 100);
        fruta = new Fruta("Fruta del Diablo", true);
        barco = new Barco("Titanic", 1000);
        zoro = new Zoro("Zoro", 100);
    }
    
    @Test
    public void testGetNombreBarco() {
        assertEquals("Titanic", barco.getNombre());
        assertNotEquals("Real madrid = ROBO", barco.getNombre());
        assertTrue(barco.getNombre().equals("Titanic"));
    }

    @Test
    public void testGetCapacidadBarco() {
        assertEquals(1000, barco.getCapacidad());
    }

    @Test
    public void testSetNombreBarco() {
        barco.setNombre("Barco pirata");
        assertEquals("Barco pirata", barco.getNombre());
    }

    @Test
    public void testSetCapacidadBarco() {
        barco.setCapacidad(2000);
        assertEquals(2000, barco.getCapacidad());
    }

    // Test Fruta
    @Test
    public void testGetNombreFruta() {
        assertEquals("Fruta del Diablo", fruta.getNombre());
    }

    @Test
    public void testSetEsDeliciosaFruta() {
        fruta.setEsDeliciosa(true);
        assertTrue(fruta.esDeliciosa());
    }

    @Test
    public void testSetNombreFruta() {
        fruta.setNombre("Fruta del Diablo");
        assertEquals("Fruta del Diablo", fruta.getNombre());
        assertNotEquals("Pataton", fruta.getNombre());
    }

    // Test Luffy
    @Test
    public void testGetNombreLuffy() {
        assertEquals("Luffy", luffy.getNombre());
    }

    @Test
    public void testGetPoderLuffy() {
        assertEquals(100, luffy.getPoder());
    }

    @Test
    public void testSetNombreLuffy() {
        luffy.setNombre("Luffy el rey de los piratas");
        assertEquals("Luffy el rey de los piratas", luffy.getNombre());
    }

    @Test
    public void testSetPoderLuffy() {
        luffy.setPoder(200);
        assertEquals(200, luffy.getPoder());
    }

    // Test Zoro
    @Test
    public void testGetNombreZoro() {
        assertEquals("Zoro", zoro.getNombre());
    }

    @Test
    public void testGetPoderZoro() {
        assertEquals(100, zoro.getPoder());
    }

    @Test
    public void testSetNombreZoro() {
        zoro.setNombre("Zorito");
        assertEquals("Zorito", zoro.getNombre());
        assertNotEquals("Zoro", zoro.getNombre());
    }

    @Test
    public void testSetPoderZoro() {
        zoro.setPoder(200);
        assertEquals(200, zoro.getPoder());
        assertNotEquals(100, zoro.getPoder());
    }

} 

