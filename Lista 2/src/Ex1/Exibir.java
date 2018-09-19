package Ex1;

public class Exibir {

	void exibir(Candidato a,Partido b) {
		a.exibirInfoCandidato();
		if (a.getPartido() == b.getNome()) {
			b.exibirInfoPartido();
		} else {
			System.out.println("Partido não encontrado!!!");
		}
		
	}
}
