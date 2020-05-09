package ex1;

public class Pessoa {
	private Pessoa prox;
	private String nome;
	private int idade;

	public Pessoa() {

	}

	public Pessoa(Pessoa prox, String nome, int idade) {
		super();
		this.prox = prox;
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa getProx() {
		return prox;
	}

	public void setProx(Pessoa prox) {
		this.prox = prox;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
