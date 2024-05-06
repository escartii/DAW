package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;


public class TestAgregarHeroes {
    @Test
    public void testAgregarHeroes() throws HeroeNoEncontradoException {
        GestorHeroes gestorHeroes = new GestorHeroes();
        Heroe ironman = new Heroe("Iron Man", "Tony Stark", "2024", "patata");
        Heroe capitanAmerica = new Heroe("Captain America", "Steve Rogers", "2024", "patat");
        Heroe blackWidow = new Heroe("Black Widow", "Natasha Romanoff", "2024" , "patata");
        
        gestorHeroes.agregarHeroe(ironman);
        gestorHeroes.agregarHeroe(capitanAmerica);
        gestorHeroes.agregarHeroe(blackWidow);
        
        assertEquals(ironman, gestorHeroes.buscarHeroe("Iron Man"));
        assertEquals(capitanAmerica, gestorHeroes.buscarHeroe("Captain America"));
        assertEquals(blackWidow, gestorHeroes.buscarHeroe("Black Widow"));
        assertNotEquals(blackWidow, gestorHeroes.buscarHeroe("Capitan America"));
    }
}