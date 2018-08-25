
public class Lampada {

	public static void main(String[] args) {
		Estado x = new Estado(false, 999);
		x.ligar();	
		x.ligar();
		x.estragada();		
		x.mostrar();		
	}
}
