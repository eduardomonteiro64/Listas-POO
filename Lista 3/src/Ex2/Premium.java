package Ex2;

public class Premium extends Cliente {

	public Premium(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public void pagarTarifa() {
		double tarifa = 0.02;
		tarifa = saldo * tarifa;
		saldo -= tarifa;
		System.out.println("Saldo atual: " + this.saldo);
	}

}
