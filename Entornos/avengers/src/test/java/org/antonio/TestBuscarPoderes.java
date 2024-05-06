package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestBuscarPoderes {

    @Test(expected = HeroeNoEncontradoException.class)
    public void testBuscarHeroePorSuperpoder() throws HeroeNoEncontradoException {
        GestorHeroes gestorHeroes = new GestorHeroes();
        Heroe ironman = new Heroe("Iron Man", "Vuelo", "Millonario y filántropo", "Vuelo");
        Heroe spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "Telarañas");
        Heroe capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "Escudo");

        gestorHeroes.agregarHeroe(ironman);
        gestorHeroes.agregarHeroe(spiderman);
        gestorHeroes.agregarHeroe(capitanAmerica);

        assertEquals(ironman, gestorHeroes.buscarHeroePorSuperpoder("Vuelo"));
        assertEquals(spiderman, gestorHeroes.buscarHeroePorSuperpoder("Telarañas"));
        assertEquals(capitanAmerica, gestorHeroes.buscarHeroePorSuperpoder("Escudo"));
        assertNull(gestorHeroes.buscarHeroePorSuperpoder("Invisibilidad"));
    }
}
