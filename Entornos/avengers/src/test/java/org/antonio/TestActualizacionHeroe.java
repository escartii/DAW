package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestActualizacionHeroe {
    @Test
    public void testActualizarDescripcionHeroe() {
        
        GestorHeroes gestorHeroes = new GestorHeroes();
        Heroe capitanAmerica = new Heroe("Capitán América", "Super soldado", "Escudo indestructible", "patata");
        gestorHeroes.agregarHeroe(capitanAmerica);

        // Aqui le cambio la descripción
        capitanAmerica.setDescripcion("Líder de los Vengadores");

        assertEquals("Líder de los Vengadores", capitanAmerica.getDescripcion());
        assertNotEquals("Super soldado", capitanAmerica.getDescripcion());
        assertNotNull(capitanAmerica.getDescripcion());
    }
}
