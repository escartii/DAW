package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestBuscarSuperPoderes {
    @Test
    public void listaHeroesPorSuperpoderes() throws HeroeNoEncontradoException {
        Heroe ironman = new Heroe("Iron Man", "Trepar y volar", "2024", "patata");
        Heroe Hulk = new Heroe("Hulk", "Trepar", "2024", "patata");

        GestorHeroes gestorHeroes = new GestorHeroes();

        gestorHeroes.agregarHeroe(Hulk);
        gestorHeroes.agregarHeroe(ironman);

        List<Heroe> heroesConSuperpoderes = new ArrayList<Heroe>();
        heroesConSuperpoderes.add(Hulk);
        heroesConSuperpoderes.add(ironman);

        assertArrayEquals(heroesConSuperpoderes.toArray(), gestorHeroes.listaHeroesPorSuperpoderes("Trepar").toArray());
        assertTrue(heroesConSuperpoderes.toArray().length < gestorHeroes.listaHeroesPorSuperpoderes("Trepar").toArray().length);

        

    }
}

