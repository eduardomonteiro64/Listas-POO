package Ex4;

public class Testes {

	public static void main(String[] args) {
		Livros epub = Livros.EPUB;
		Livros pdf = Livros.PDF;
		Livros fisico = Livros.FISICO;

		Livraria livro = new Livraria("ABC");
		System.out.println("Livro: " + livro.getNome() + " Preço: " + epub.valorLivro);

	}

}
