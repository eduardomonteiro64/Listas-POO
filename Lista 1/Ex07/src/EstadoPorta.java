
public class EstadoPorta {

	public static void main(String[] args) {
		Porta a = new Porta(false, 0);
		a.abrir();
		a.fechar();
		a.abrir();
		a.fechar();
		a.exibir();
	}

}
