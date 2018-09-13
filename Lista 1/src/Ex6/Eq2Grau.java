package Ex6;

public class Eq2Grau {
	double a, b, c, d, x1, x2;

	double delta() {
		d = (Math.pow(b, 2)) - (4 * a * c);
		return d;
	}

	double raiz1() {
		x1 = (-b + (Math.sqrt(d))) / 2 * a;
		return x1;
	}

	double raiz2() {
		x2 = (-b - (Math.sqrt(d))) / 2 * a;
		return x2;
	}

	void exibir() {
		System.out.println(d);
		System.out.println(x1);
		System.out.println(x2);
	}

}
