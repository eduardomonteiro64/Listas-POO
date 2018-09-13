package Ex2;

import org.omg.Messaging.SyncScopeHelper;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Edu", 1000, 0);
		Cliente c2 = new Cliente("Dududu", 400, 0);
		Doc x = new Doc();

		x.transfere(c1, c2, 1200);
		c2.checarSaldo();
		c1.checarSaldo();
	}

}
