package Ex2;

public class Regular extends Cliente {

	public Regular(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public void pagarTarifa() {
		double tarifa = 0.01;
		tarifa = saldo * tarifa;
		saldo -= tarifa;
		System.out.println("Saldo atual: " + this.saldo);
	}

}
