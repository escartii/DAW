package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestFuncionales {
@Test(expected = HeroeNoEncontradoException.class)
    public void testComprobarInformacion() throws HeroeNoEncontradoException {

        Heroe ironman = (new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo", "patata"));
        Heroe spiderman = (new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "patata"));
        Heroe capitanAmerica = (new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "patata"));

        GestorHeroes gh = new GestorHeroes();
        assertEquals(null, gh.buscarHeroe("alvaro"));
        assertEquals("Iron Man", gh.buscarHeroe("Iron Man"));
        assertNotEquals(null, gh.buscarHeroe("Spider-Man"));
        assertEquals(ironman, gh.buscarHeroe("Iron Man"));
        assertEquals(spiderman, gh.buscarHeroe("Spider-Man"));
        assertEquals(capitanAmerica, gh.buscarHeroe("Capitan América"));
        assertNotEquals(ironman, gh.buscarHeroe("Alvaro Escarti"));
        
        gh.buscarHeroe("alvaro");
        gh.buscarHeroe("Javi");


    }  
}

