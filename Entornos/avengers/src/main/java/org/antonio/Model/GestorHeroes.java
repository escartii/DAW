package org.antonio.Model;

import org.antonio.Exception.HeroeNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class GestorHeroes {
    private List<Heroe> heroes;

    public GestorHeroes() {
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe) {
        this.heroes.add(heroe);
    }

    public Heroe buscarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }

    public List<Heroe> getHeroes() {
        return heroes;
    }
    
    public void eliminarHeroe(String nombre) throws HeroeNoEncontradoException{
        Heroe eliminaHeroe = null;
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                eliminaHeroe = heroe;
            }
        }
        if (eliminaHeroe != null) {
            this.heroes.remove(eliminaHeroe);
        }
    }

    public Heroe buscarHeroePorSuperpoder(String superpoder) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            String superpoderes = heroe.getSuperpoderes();
            if (superpoderes.contains(superpoder)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException("No se encontró ningún héroe con el superpoder: " + superpoder);
    }

    public void actualizarHeroe(Heroe heroeActualizado) throws HeroeNoEncontradoException {
        String nombre = heroeActualizado.getNombre();
        boolean encontrado = false;
        for (int i = 0; i < this.heroes.size(); i++) {
            Heroe heroe = this.heroes.get(i);
            if (heroe.getNombre().equals(nombre)) {
                this.heroes.set(i, heroeActualizado);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new HeroeNoEncontradoException(nombre);
        }
    }

    public String listarHeroes() {
        String listaHeroes = "";
        for (Heroe heroe : this.heroes) {
            listaHeroes += heroe.getNombre() + ", ";
        }
        // Eliminar la última coma y espacio
        if (!listaHeroes.isEmpty()) {
            listaHeroes = listaHeroes.substring(0, listaHeroes.length() - 2);
        }
        return listaHeroes;
    }
    
    public List<Heroe> listaHeroesPorSuperpoderes(String superpoder){
        List <Heroe> heroesConSuperpoderes = new ArrayList<Heroe>();
        for (Heroe heroe : this.heroes) {
            if (heroe.getSuperpoderes().toLowerCase().contains(superpoder)) {
                heroesConSuperpoderes.add(heroe);
            }
        }

        return heroesConSuperpoderes;
    }
}   
