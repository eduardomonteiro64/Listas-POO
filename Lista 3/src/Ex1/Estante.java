package Ex1;
import java.util.ArrayList;

public class Estante {
	private String nome;
	Categoria categoria;
	ArrayList<Livros> livros;

	public Estante(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.livros = new ArrayList<Livros>();
	}

	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public ArrayList<Livros> getLivros() {
		return livros;
	}

	public void inserirLivro(Livros l) {
		if (l != null && !livros.contains(l)) {
			livros.add(l);
		} else {
			System.out.println("ERRO");
		}
	}

	public void removerLivro(Livros l) {
		if (l != null && livros.contains(l)) {
			livros.remove(l);
		} else {
			System.out.println("ERRO");
		}
	}

	public void listarLivros(Categoria categoria) {
		for (Livros livro : livros) {
			if (livro.getCategoria() == categoria) {
				livro.exibirLivro();
			}
		}
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro encontrado");
		}
	}

	public void listarFilosofia() {
		for (Livros livro : livros) {
			if (livro.getCategoria() == categoria.FILOSOFIA) {
				livro.exibirLivro();
			}
		}
	}

	public void exibirEstantes() {
		System.out.println("Estante: " + nome);
		System.out.println("Categoria: " + categoria);
		listarLivros(categoria);
	}
}