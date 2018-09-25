package Ex2;

public class VIP extends Cliente {

	public VIP(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public void pagarTarifa() {
		double tarifa = 0.04;
		tarifa = saldo * tarifa;
		saldo -= tarifa;
		System.out.println("Saldo atual: " + this.saldo);
	}

}
