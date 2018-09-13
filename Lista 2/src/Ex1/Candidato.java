package Ex1;

public class Candidato {
	private String nome;
	private String partido;

	public Candidato(String nome, String partido) {
		super();
		this.nome = nome;
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public String getPartido() {
		return partido;
	}

	public void exibirInfoCandidato() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Partido: " + this.getPartido());

	}

	public void trocarPartido(String partido) {
		this.partido = null;
		this.partido = partido;
	}
}
