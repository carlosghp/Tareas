/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbho8st/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pokemon_Herencia;

/**
 *
 * @author carlo
 */
public class Pokemon {
    private int hp;
    private String tipo;
    private String nombre;
    
    public Pokemon(String nombre, String tipo, int hp) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 100;
}
    public String getNombre(){
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public String getTipo() {
        return tipo;
    }
    
    private void calculaDanio(int danio){
        this.hp-= danio;
        System.out.printf("%s recibe %d puntos de danio\n",
this.getNombre(),danio);
    }
    
    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        calculaDanio((int)(Math.random()*10 + 1));
      
    }
    
    public void atacar(String movimiento, Pokemon pokemon){
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }

}
