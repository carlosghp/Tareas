import javax.swing.JOptionPane;

public class computadora {
    
    int discoDuro;
    float velocidadProcesador;
    computadora peer;
    String sistemaOperativo;
    String nombre;
    String[] memoria = new String[10];

public computadora(int discoDuro, float velocidadProcesador, computadora peer, String sistemaOperativo,
            String nombre, String[] memoria) {
        this.discoDuro = discoDuro;
        this.velocidadProcesador = velocidadProcesador;
        this.peer = peer;
        this.sistemaOperativo = sistemaOperativo;
        this.nombre = nombre;
        this.memoria = memoria;
    }

public computadora(String nombreEquipo){
    discoDuro = 640;
    velocidadProcesador = 3.1f;
    sistemaOperativo = "Microsoft Windows 7";
    nombre = nombreEquipo;
				
}
	
public void encender(){
    JOptionPane.showMessageDialog(null, nombre + ": Iniciando Windows...");
    memoria[0] = sistemaOperativo;		
    JOptionPane.showMessageDialog(null, nombre + ": Bienvenido");
}
	
public boolean ejecutar(String programa, int posicion){
    if(posicion != 0){
	memoria[posicion] = programa;
	JOptionPane.showMessageDialog(null, nombre + ": Ejecutando el programa " + programa);
    }
    return true;
}
	
	
public void recibirDatos(String mensaje){
    JOptionPane.showMessageDialog(null, peer.nombre + " dice: " + mensaje);
}
	
public void enviarDatos(){
    peer.recibirDatos(JOptionPane.showInputDialog("Escribe el dato a enviar"));
    //return 0;
}
	
public void conectar(computadora c){
    this.peer = c;
    c.peer = this;
    JOptionPane.showMessageDialog(null, nombre + ": Conectado a " + peer.nombre);
}
	
public void desconectar(){
    JOptionPane.showMessageDialog(null, nombre + ": Desconectado de " + peer.nombre);
    peer.peer = null;
    this.peer = null;
}
	
public void apagar(){
    JOptionPane.showMessageDialog(null, "Cerrando sesión...");
    for(int i = 0; i < 10; i++){
    memoria[i] = null;
}
JOptionPane.showMessageDialog(null, nombre + ": Windows se está cerrando");
    memoria[0] = null;
}
	
public void aumentarDiscoDuro(){
    discoDuro = 1000;
}
    
public static void main(String[] args) {
    computadora laptop = new computadora("Laptop");
    laptop.encender();
    laptop.ejecutar("Windows Live Messenger", 1);
		
    computadora tablet = new computadora("Tablet");
    tablet.encender();
    tablet.ejecutar("Windows Live Messenger", 1);
		
    laptop.conectar(tablet);	
    laptop.enviarDatos();
    laptop.desconectar();
		
    tablet.apagar();
    laptop.apagar();
    }
    
}
