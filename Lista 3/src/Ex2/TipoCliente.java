package Ex2;

public enum TipoCliente {
	VIP(4), PREMIUM(2), REGULAR(1);

	public int valorTarifa;

	TipoCliente(int valor) {
		valorTarifa = valor;
	}
}
