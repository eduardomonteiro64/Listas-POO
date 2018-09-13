package Ex2;

public class Estado {
	private boolean ligado;
	private int click;

	public boolean isLigado() {
		return ligado;
	}

	public double getClick() {
		return click;
	}

	public void ligar() {
		this.ligado = true;
		click++;
	}

	public void desligar() {
		this.ligado = false;
		click++;
	}

	public Estado(boolean ligado, int click) {
		super();
		this.ligado = ligado;
		this.click = click;
	}

	public void mostrar() {
		System.out.println("Ligado? " + (this.isLigado()));
		System.out.println("Numero de cliques?: " + this.getClick());
	}

	public void estragada() {
		if (this.click > 1000) {
			this.ligado = false;
			System.out.println("Lampada queimada");
			while (click > 1000) {
				this.ligado = false;
			}
		} else {
			System.out.println("Lampada funcional");
		}
	}

}
