package Ex1;

public class Churrasco {

	public static void main(String[] args) {
		Pessoa a1 = new Pessoa("Eduardo", "Masculino", 5, false);
		a1.verificarConsumo(a1.getIdade(), a1.isVegetariana());

		Pessoa a2 = new Pessoa("Edu", "Masculino", 2, false);
		a2.verificarConsumo(a2.getIdade(), a2.isVegetariana());

		Pessoa a3 = new Pessoa("Dudu", "Masculino", 24, false);
		a3.verificarConsumo(a3.getIdade(), a3.isVegetariana());

		Pessoa a4 = new Pessoa("Du", "Masculino", 24, true);
		a4.verificarConsumo(a4.getIdade(), a4.isVegetariana());
	}

}