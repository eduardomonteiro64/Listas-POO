package Ex2;

public class Cliente {
	private String nome;
	protected double saldo;
	private double limite;

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public Cliente(String nome, double saldo, double limite) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void sacar(double val) {
		if (val < saldo + limite || val > saldo + limite) {
			System.out.println("Impossivel sacar");
		} else {
			this.saldo -= val;
			System.out.println("Saque efetuado c/ sucesso");
		}
	}

	public void depositar(double val) {
		this.saldo += val;
	}

	public void checarSaldo() {
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.getLimite());

	}

}
