package ex1;

public class Cachorro {
	private Cachorro prox;
	private String nome;
	private String raca;
	private double peso;

	public Cachorro(Cachorro prox, String nome, String raca, double peso) {
		super();
		this.prox = prox;
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
	}

	public Cachorro() {

	}

	public Cachorro getProx() {
		return prox;
	}

	public void setProx(Cachorro prox) {
		this.prox = prox;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
