package Ex1;

public class Livros {
	private String nome, autor;
	private int ano;
	Categoria categoria;

	public Livros(String nome, String autor, int ano, Categoria categoria) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void exibirLivro() {
		System.out.println("Nome do livro: " + nome);
		System.out.println("Autor: " + autor);
		System.out.println("Ano: " + ano);
		System.out.println("Categoria: " + categoria);
	}
}