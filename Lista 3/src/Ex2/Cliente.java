package Ex2;

public class Cliente {
	private String nome;
	protected double saldo;

	public Cliente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}	

	public void pagarTarifa() {
		double tarifa = 0;
		saldo-=tarifa;
	}

}
