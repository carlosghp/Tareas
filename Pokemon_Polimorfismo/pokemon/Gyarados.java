import java.util.Random;

public class Gyarados extends PokemonDosTipos implements Pokemon {

    private double danio;

    public Gyarados(String nombre, int ps, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, double velocidad, int nivel, Tipo tipo1, Tipo tipo2, String clase) {
        super(nombre, ps, ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, nivel, tipo1, tipo2, clase);
    }

    @Override
    public int getAtaqueEspecial() {
        return 0;
    }

    @Override
    public int getAtaque() {
        return 0;
    }
    @Override
    public int getDefensa() {
        return 0;
    }

    @Override
    public int getDefensaEspecial() {
        return 0;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public Double getVelocidad() {
        return null;
    }

    @Override
    public int getPs() {
        return 0;
    }

    @Override
    public int getNivel() {
        return 0;
    }

    @Override
    public Tipo getTipo1() {
        return null;
    }

    @Override
    public Tipo getTipo2() {
        return null;
    }

    @Override
    public String getClase() {
        return super.getClase();
    }


    public double calcularDanio(double efectividad, double variacion, int nivel, int ataque, int defensa, Pokemon pokemon) {

            Random random = new Random();
            variacion = (random.nextInt(16) + 85);
            danio = (((0.2 * nivel + 1)*(this.getAtaqueEspecial()))/(25 * defensa)) +1; 

            return danio;
        }

    public int calcularVida(int ps) {
        double vida = (ps - danio);
        return  (int)vida;
    }


}