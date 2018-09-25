package Ex2;

public class Principal {

	public static void main(String[] args) {
		VIP a = new VIP("Eduardo", 1000);
		a.pagarTarifa();
		Regular b = new Regular("Claudio",1000);
		b.pagarTarifa();
		Premium c = new Premium("Derp",1000);
		c.pagarTarifa();
	}

}
