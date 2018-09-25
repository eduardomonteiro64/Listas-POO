package Ex1;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	ArrayList<Estante> estantes;
	ArrayList<Livros> livros;

	public Biblioteca() {
		this.nome = nome;
		this.estantes = new ArrayList<Estante>();
		this.livros = new ArrayList<Livros>();
	}

	public String getNome() {
		return nome;
	}

	public void inserirEstante(Estante e) {
		if (e != null && !estantes.contains(e)) {
			estantes.add(e);
		} else {
			System.out.println("Erro");
		}
	}

	public void listarEstantes() {
		for (Estante estante : estantes) {
			estante.exibirEstantes();
		}
	}

	/*public void listarTudo() {
		for (Estante estante : estantes) {
			for (Livros livro : livros) {
				livro.exibirLivro();
			}
		}
	}*/

	public int contarCiencia() {
		int aux = 0;
		for (Estante estante : estantes) {
			for (Livros livro : livros) {
				if (livro.getCategoria() == Categoria.CIENCIA) {
					aux++;
				}
			}
			System.out.println(aux);
		}
		return aux;
	}
}