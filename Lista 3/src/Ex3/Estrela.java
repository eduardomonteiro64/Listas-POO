package Ex3;

public class Estrela {
	private String nome, cor;
	private double temperatura;

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public Estrela(String nome, String cor, double temperatura) {
		this.nome = nome;
		this.cor = cor;
		this.temperatura = temperatura;
	}
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cor: "+this.cor);
		System.out.println("Temperatura: "+this.temperatura);
	}
}
