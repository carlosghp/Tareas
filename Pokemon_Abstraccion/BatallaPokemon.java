/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */

import pokemon.PokemonAgua;
import pokemon.PokemonFuego
public class BatallaPokemon {
    public static void main (String[]args){
           Pokemon flameron = new PokemonFuego("flameron", 10);
           Pokemon poliwag = new PokemonAgua("poliwag", 10);

           flameron.atacar(2, poliwag);
           poliwag.atacar(3, flameron);
    }
}