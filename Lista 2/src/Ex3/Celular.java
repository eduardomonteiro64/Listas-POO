package Ex3;

public class Celular {
	private int identificador, bateria;
	private String nomeUsuario;
	private boolean ligado;

	public boolean isLigado() {
		return ligado;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public int getBateria() {
		return bateria;
	}

	public Celular(int identificador, String nomeUsuario, int bateria, boolean ligado) {
		this.identificador = identificador;
		this.nomeUsuario = nomeUsuario;
		this.bateria = bateria;
		this.ligado = ligado;
	}

	public void ligar() {
		if (this.ligado == false) {
			if (bateria > 0 && bateria > 20) {
				System.out.println("Ligando");
				System.out.println("Nome: " + this.getNomeUsuario());
				this.ligado = true;
				this.bateria -= 20;
			} else if (bateria <= 20) {
				System.out.println("Ligando");
				System.out.println("Bateria fraca");
				this.ligado = true;
			}
		}else {
			System.out.println("Celular ligado");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			if (bateria > 20) {
				System.out.println("Desligando");
				this.ligado = false;
				this.bateria -= 10;
			} else {
				this.ligado = false;
				this.bateria -= 10;
			}
		}else {
			System.out.println("Celular ligado");
		}
	}

	public void tocarSom() {
		if (this.ligado == true && this.bateria >= 10) {
			System.out.println("Tocando ferrugem");
		} else {
			System.out.println("Bateria fraca p/ isso");
		}
	}

	public void trocarBateria(int bat) {
		this.bateria = 0;
		this.bateria = bat;
		System.out.println("Bateria trocada");
	}
}