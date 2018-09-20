package Ex2;

public class ContaCorrente {
	private String nome;
	private double saldo;
	TipoCliente cliente;

	public ContaCorrente(String nome,double saldo,TipoCliente cliente) {
		this.nome = nome;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoCliente getCliente() {
		return cliente;
	}
	
}
