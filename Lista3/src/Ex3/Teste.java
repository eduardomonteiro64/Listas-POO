package Ex3;

public class Teste {

	public static void main(String[] args) {
		Estrela x = new Estrela("Alfa", "Azul", 30.3);
		Estrela y = new Estrela("Beta", "Branca", 40.3);

		Constelacao a = new Constelacao();
		a.adicionarEstrela(x);
		a.adicionarEstrela(y);
		a.infoEstrelas();

		a.maiorTemp();
		a.tempConstelacao();
	}
}
