public class PokemonAgua extends Pokemon {
    public PokemonAgua(String nombre, int nivel) {
        super(nivel, nombre, Tipo.AGUA);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

    setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Hidrovapor"));
    setMovimiento(1, listaMovimientos.buscarMovimientoPorNombre("Hidrobomba"));
    setMovimiento(2, listaMovimientos.buscarMovimientoPorNombre("Terra temblor"));
    setMovimiento(3, listaMovimientos.buscarMovimientoPorNombre("Meteoros"));
    }
    
    @Override
    public double obtenerEfectividad (Pokemon pokemon) {
            double efectividad = 1.0;
    
            
            if(pokemon.getTipo() == Tipo.FUEGO) efectividad = 2.0;
            if(pokemon.getTipo() == Tipo.ROCA) efectividad = 2.0;
            if(pokemon.getTipo() == Tipo.TIERRA) efectividad = 2.0;
            if(pokemon.getTipo() == Tipo.AGUA) efectividad = 0.5;
            if(pokemon.getTipo() == Tipo.DRAGON) efectividad = 0.5;
            if(pokemon.getTipo() == Tipo.PLANTA) efectividad = 0.5;
    
            return efectividad;
        }
}
