package exAluno;



public class Aluno {
	private String nome;
	private String numeroDeMatricula ;
	private String disciplina;
	private float notaP1;
	private float notaP2;
	private float notaSub;
	private float notaEx;
	private Aluno prox;
	
	
	public Aluno(String nome, String numeroDeMatricula, String disciplina, float notaP1, float notaP2, float notaSub,
			float notaEx, Aluno prox) {
		
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
		this.disciplina = disciplina;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaSub = notaSub;
		this.notaEx = notaEx;
		this.prox = prox;
	}
	
	public Aluno() {
		
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

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(float notaP1) {
		this.notaP1 = notaP1;
	}

	public float getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(float notaP2) {
		this.notaP2 = notaP2;
	}

	public float getNotaSub() {
		return notaSub;
	}

	public void setNotaSub(float notaSub) {
		this.notaSub = notaSub;
	}

	public float getNotaEx() {
		return notaEx;
	}

	public void setNotaEx(float notaEx) {
		this.notaEx = notaEx;
	}

	public Aluno getProx() {
		return prox;
	}

	public void setProx(Aluno prox) {
		this.prox = prox;
	}

	
	
	
}
