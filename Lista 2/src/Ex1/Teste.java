package Ex1;

public class Teste {

	public static void main(String[] args) {
		Partido p1 = new Partido("Novo", "Direita", 'N', 30);
		Candidato c1 = new Candidato("Eduardo", "Novo");

		c1.exibirInfoCandidato();
		if (c1.getPartido() == p1.getNome()) {
			p1.exibirInfoPartido();
		} else {
			System.out.println("Partido não encontrado!!!");
		}
		c1.trocarPartido("ABC");
		c1.exibirInfoCandidato();
	}

}
