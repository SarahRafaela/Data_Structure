package controller;

public class ListaLigada {
	private Livro fim;

	public ListaLigada(Livro fim) {
		
		this.fim = null;
		

	}

	public void adcionaLivro(Livro novo_livro) {
		
		novo_livro.setTitulo("Harry Potter");
		novo_livro.setAutor("JK Rowling");
		novo_livro.setAnterior(fim);
		fim = novo_livro;

	}

	public void ListarLivro() {
	
		Livro atual = fim;
		while (atual != null) {
			System.out.println("Titulo: " + atual.getTitulo());
			System.out.println("Autor: " + atual.getTitulo());
			
			atual = atual.getAnterior();
		}
	}
	
}
