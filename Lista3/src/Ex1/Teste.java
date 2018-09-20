package Ex1;

public class Teste {

	public static void main(String[] args) {
		Livros a = new Livros("Bible", "Jesus", 33, Categoria.FILOSOFIA);
		Livros b = new Livros("Amem", "God", 1990, Categoria.CIENCIA);
		Livros c = new Livros("Etec", "Degenal", 1998, Categoria.CIENCIA);

		Estante Filosofia = new Estante("01", Categoria.FILOSOFIA);
		Filosofia.inserirLivro(a);

		Estante Ciencia = new Estante("02", Categoria.CIENCIA);
		Ciencia.inserirLivro(b);
		Ciencia.inserirLivro(c);

		Biblioteca Saraiva = new Biblioteca();
		Saraiva.inserirEstante(Filosofia);
		Saraiva.inserirEstante(Ciencia);
		
		Ciencia.exibirEstantes();
	}
}
