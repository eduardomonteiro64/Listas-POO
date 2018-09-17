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

	public String toString() {
		return ("Nome: " + this.getNome() + " Cor:" + this.getCor() + " Temperatura: " + this.getTemperatura());

	}

	public void mostrar() {
		System.out.println(this.getNome());
		System.out.println(this.getCor());
		System.out.println(this.getTemperatura());
	}

	public Estrela(String nome, String cor, double temperatura) {
		this.nome = nome;
		this.cor = cor;
		this.temperatura = temperatura;
	}

}
