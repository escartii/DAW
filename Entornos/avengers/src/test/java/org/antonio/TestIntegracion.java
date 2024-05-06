package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestIntegracion {
    Heroe ironman = null;
    Heroe spiderman = null;
    Heroe capitanAmerica = null;

    GestorHeroes gh = null;

    @Before
    public void setUp(){
        ironman = new Heroe(null, null, null, null);
        spiderman = new Heroe(null, null, null, null);
        capitanAmerica = new Heroe(null, null, null, null);

        gh = new GestorHeroes();

        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    }

    
    @Test(expected = HeroeNoEncontradoException.class)
    public void testGestorHeroes() throws HeroeNoEncontradoException{
        // Creo nuevos héroes
        
        Heroe ironman = (new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo", "patata"));
        Heroe spiderman = (new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "patata"));
        Heroe capitanAmerica = (new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "patata"));
        
        gh = new GestorHeroes();
        
        //Añado los heroes creados a GestorHeroes
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
        
        assertTrue(gh.getHeroes().contains(ironman));
        assertTrue(gh.getHeroes().contains(spiderman));
        assertTrue(gh.getHeroes().contains(capitanAmerica));
        assertFalse(gh.getHeroes().contains(new Heroe("Hulk", "Machacar", "Verde", "patata")));
        assertFalse(gh.getHeroes().contains(new Heroe("Thor", "Thor", "Thor", "patata")));

        // Buscar Heroes

        assertEquals(ironman, gh.buscarHeroe("Iron Man"));
        assertEquals(spiderman, gh.buscarHeroe("Spider-Man"));
        assertNotEquals(ironman, gh.buscarHeroe("Patata"));
    }

}
