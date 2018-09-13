package Ex1;

public class Partido {
	private String nome, ideologia;
	private char sigla;
	private int numeroPartido;

	public Partido(String nome, String ideologia, char sigla, int numeroPartido) {
		super();
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numeroPartido = numeroPartido;
	}

	public String getNome() {
		return nome;
	}

	public String getIdeologia() {
		return ideologia;
	}

	public char getSigla() {
		return sigla;
	}

	public int getNumeroPartido() {
		return numeroPartido;
	}

	public void exibirInfoPartido() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Ideologia: " + this.getIdeologia());
		System.out.println("Sigla: " + this.getSigla());
		System.out.println("Numero: " + this.getNumeroPartido());

	}
}
