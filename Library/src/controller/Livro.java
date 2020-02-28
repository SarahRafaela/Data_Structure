package controller;

public class Livro {
	private int numreg;
	private String titulo;
	private String autor;
	private double preco;
	private Livro anterior;
	
	public Livro (int numreg, String titulo, String autor, double preco, Livro anterior ) {
		this.anterior = anterior;
		this.autor = autor;
		this.titulo = titulo;
		this.preco =preco;
		this.numreg = numreg;
		
	}

	public Livro() {
		
	}

	public int getNumreg() {
		return numreg;
	}

	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Livro getAnterior() {
		return anterior;
	}

	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
}
