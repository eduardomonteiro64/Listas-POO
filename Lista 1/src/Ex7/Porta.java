package Ex7;

public class Porta {
	private boolean isOpen;
	private int numAberturas;

	public boolean isOpen() {
		return isOpen;
	}

	public int getNumAberturas() {
		return numAberturas;
	}

	public Porta(boolean isOpen, int numAberturas) {
		super();
		this.isOpen = isOpen;
		this.numAberturas = numAberturas;
	}

	public void abrir() {
		this.isOpen = true;
		this.numAberturas++;
	}

	public void fechar() {
		this.isOpen = false;
	}

	public void exibir() {
		System.out.println("Está aberta?" + this.isOpen);
		System.out.println("Numero de aberturas: " + this.numAberturas);
	}
}