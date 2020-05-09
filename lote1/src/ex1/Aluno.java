package ex1;

public class Aluno {
	private String nome;
	private String numeroDeMatricula;
	private Aluno anterior;

	public Aluno() {

	}

	public Aluno(String nome, String numeroDeMatricula, Aluno anterior) {
		super();
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
		this.anterior = anterior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(String numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public Aluno getAnterior() {
		return anterior;
	}

	public void setAnterior(Aluno anterior) {
		this.anterior = anterior;
	}

}
