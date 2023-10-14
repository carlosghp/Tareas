import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>(); 

    public ListaMovimientos() {
        movimientos.add(new Movimiento("Colmillo igneo", 65, 30, Tipo.FUEGO));
        movimientos.add(new Movimiento("Bomba Ignea", 100, 40, Tipo.FUEGO));

        movimientos.add(new Movimiento("Hidrobomba", 110, 20, Tipo.AGUA));
        movimientos.add(new Movimiento("Hidrovapor", 80, 30, Tipo.AGUA));

        movimientos.add(new Movimiento("Terra Temblor", 60, 20, Tipo.TIERRA));
        movimientos.add(new Movimiento("Excavar", 80, 10, Tipo.TIERRA));

        movimientos.add(new Movimiento("Meteoros", 60, 20, Tipo.NORMAL));


    }

    public Movimiento buscarMovimientoPorNombre (String nombre) {
        for(Movimiento movimiento : movimientos) {
            if(movimiento.getNombre().equals(nombre)) {
                return movimiento;
            }
        }
        return null;
    }


    
}