package Ex4;

public enum Livros {
	EPUB(20),PDF(40),FISICO(80);
	
	public double valorLivro;
	Livros(double valor){
		valorLivro = valor;
	}
}
