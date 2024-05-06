package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestUnitarios {

    Heroe ironman = new Heroe(null, null, null, null);
    Heroe spiderman = new Heroe(null, null, null, null);
    Heroe capitanAmerica = new Heroe(null, null, null, null);

    GestorHeroes gh = null;

    @Before
    public void setUp(){
        ironman = new Heroe("Iron man", "Traje de alta tecnología", "Millonario y filántropo", "patata");
        spiderman = new Heroe(null, null, null, null);
        capitanAmerica = new Heroe(null, null, null, null);
        gh = new GestorHeroes();
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    }

    @Test
    public void testGettersHeroe() {
        assertEquals("Iron man", ironman.getNombre());
        assertEquals("Traje de alta tecnología", ironman.getSuperpoderes());
        assertEquals("Millonario y filántropo", ironman.getBiografia());
    }

    @Test
    public void testSettersHeroe(){
        Heroe catWoman = new Heroe(null, null, null, null);
        catWoman.setNombre("Cat woman");
        catWoman.setSuperpoderes("Trepar y arañar");
        catWoman.setBiografia("Es la amiga de Batman");

        assertEquals("Cat woman", catWoman.getNombre());
        assertEquals("Trepar y arañar", catWoman.getSuperpoderes());
        assertEquals("Es la amiga de Batman", catWoman.getBiografia());

        assertNotEquals("Capitan América", catWoman.getNombre());
    }
}


