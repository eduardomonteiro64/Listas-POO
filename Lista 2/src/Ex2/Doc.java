package Ex2;

public class Doc {

	void transfere(Cliente a, Cliente b, double valor) {
		if (a.saldo > valor || a.saldo < valor) {
			System.out.println("IMPOSSIVEL FAZER ISSO");
		} else {
			a.saldo -= valor;
			b.saldo += valor;
		}
	}
}
