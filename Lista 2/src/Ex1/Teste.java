package Ex1;

public class Teste {

	public static void main(String[] args) {
		Partido p1 = new Partido("Novo", "Direita", 'N', 30);
		Candidato c1 = new Candidato("Eduardo", "Novo");
		Exibir x = new Exibir();

		x.exibir(c1, p1);
		
		c1.trocarPartido("ABC");
		x.exibir(c1,p1);
	}

}
