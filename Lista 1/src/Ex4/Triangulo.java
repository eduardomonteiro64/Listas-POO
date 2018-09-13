package Ex4;

public class Triangulo {
	private double lado, perimetro, area;

	public double getLado() {
		return lado;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}

	public void calcArea() {
		area = lado * ((Math.sqrt(3)) / 2);
		System.out.println("A área é: " + this.area);
	}

	public void calcPerimetro() {
		perimetro = 3 * lado;
		System.out.println("O perimetro é: " + this.perimetro);
	}

	public Triangulo(double lado) {
		super();
		this.lado = lado;
	}

}
