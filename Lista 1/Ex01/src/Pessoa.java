
public class Pessoa {
	private String nome,sexo;
	private int idade;
	private boolean vegetariana;	
	
	
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getIdade() {
		return idade;
	}
	public boolean isVegetariana() {
		return vegetariana;
	}
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	public void verificarConsumo(int idade, boolean vegetariana) {
		double a;
		if(vegetariana==true || idade<=3) {
			System.out.println("Não consome carne");
		}else if(idade>=4 && idade<=12) {
			a=1;
			System.out.println("Consome "+a+"kg de Carne");
		}else if(idade>=13) {
			a=2;
			System.out.println("Consome "+a+"kg de Carne");
		}
	}
	
}
