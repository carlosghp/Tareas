public abstract class Pokemon {
    private int hp;
    private int nivel;
    private String nombre;
    private Tipo tipo;
    private Movimiento movimientos[];

    public Pokemon(String nombre, Tipo tipo, int hp) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 250;
        this.nivel = nivel;
        this.movimientos = new Movimiento[4]; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setMovimiento(int i, Movimiento movimientos) {
        this.movimientos[i] = movimientos;
    }
    public Movimiento getMovimiento(int i) {
        return this.movimientos[i];
    }

    public void calculaDanio(int danio, double efectividad){
        double puntosRestados = danio * efectividad;
        this.hp -= puntosRestados;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(),puntosRestados);
    }
    public void recibirAtaque(Movimiento movimiento, double efectividad ) {
        System.out.printf("%s Recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);

        if(movimiento.getPp() > 0) {
            pokemon.recibirAtaque(movimiento, efectividad);
            return true;
        } else {
            System.err.println("El movimiento no tiene puntos pp");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimiento(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if(seHaConcretadoAtaque) {
            pokemon.getMovimiento(m).setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double obtenerEfectividad(Pokemon pokemon);
}