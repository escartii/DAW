package org.antonio;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestActualizarInformacion {

    private GestorHeroes gestorHeroes;

    @Before
    public void setUp() {
        gestorHeroes = new GestorHeroes();
        // Crear y agregar héroes de prueba
        Heroe ironman = new Heroe("Iron Man", "Vuelo", "Millonario y filántropo", "patata");
        Heroe spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "Telarañas");
        Heroe capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "Escudo");
        gestorHeroes.agregarHeroe(ironman);
        gestorHeroes.agregarHeroe(spiderman);
        gestorHeroes.agregarHeroe(capitanAmerica);
    }

    @Test
    public void testActualizarHeroe() throws HeroeNoEncontradoException {
       
        Heroe spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "Telarañas");
        Heroe spiderman2 = new Heroe("Spider-Man", "Sentido pataton trepador", "Tímido estudiante de secundaria", "patata");
        gestorHeroes.agregarHeroe(spiderman);
        gestorHeroes.actualizarHeroe(spiderman2);

        assertEquals("Superfuerza, agilidad, resistencia", gestorHeroes.buscarHeroe("Capitán América").getSuperpoderes());
        
    }
}

