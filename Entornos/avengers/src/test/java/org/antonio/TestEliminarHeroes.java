package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;


public class TestEliminarHeroes {
    @Test(expected = HeroeNoEncontradoException.class)
    public void testEliminarHeroe() throws HeroeNoEncontradoException {

        GestorHeroes gestorHeroes = new GestorHeroes();
        
        Heroe spiderman = (new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "patata"));
        
        gestorHeroes.agregarHeroe(spiderman);
        // Eliminar el héroe del GestorHeroes
        gestorHeroes.eliminarHeroe("Spider-Man");

        assertNull(gestorHeroes.buscarHeroe("Spider-Man"));
        assertEquals(1, gestorHeroes.getHeroes().size());
        assertEquals(null,  gestorHeroes.buscarHeroe("Spider-Man")); 

        
    }
}
