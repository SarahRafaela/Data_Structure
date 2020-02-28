package view;

import controller.ListaLigada;
import controller.Livro;

public class Principal {

	public static void main(String[] args) {
	 Livro livro1 = new Livro();
	 
	 ListaLigada list = new ListaLigada(livro1);
	 
	 list.adcionaLivro(livro1);
	 System.out.println(livro1.toString());
	list.ListarLivro();
	}
}
