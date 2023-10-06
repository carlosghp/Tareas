/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon_Herencia;

/**
 *
 * @author carlo
 */
public class BatallaPokemon {
    public static void main (String[]args){
        PokemonFuego flareon = new PokemonFuego("flareon", 10);
        PokemonAgua poliwag = new PokemonAgua("Poliwag", 10);
        flareon.atacar("colmillo igneo", poliwag);
        System.out.println("A " + flareon.getNombre() + " le quedan " + flareon.getHp() + " puntos de vida");
        poliwag.atacar("hidrobomba", flareon);
        System.out.println("A " + poliwag.getNombre() + " le quedan " + poliwag.getHp() + " puntos de vida");   
    }
}
