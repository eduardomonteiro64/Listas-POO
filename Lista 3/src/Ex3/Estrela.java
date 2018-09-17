package Ex3;

public class Estrela {

	private String nome, cor;
	private static double temperatura;

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public static double getTemperatura() {
		return temperatura;
	}

	public static void setTemperatura(double temperatura) {
		Estrela.temperatura = temperatura;
	}

	public String toString() {
		return ("Nome: " + this.getNome() + " Cor:" + this.getCor() + " Temperatura: " + this.getTemperatura());

	}

	public String mostrar() {
		return this.toString();
	}

	public Estrela(String nome, String cor) {
		super();
		this.nome = nome;
		this.cor = cor;
	}

}
