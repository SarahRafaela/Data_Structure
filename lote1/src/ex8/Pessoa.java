package ex8;

public class Pessoa {
	private String nome;
	private int idade;

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

	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("Nome: ");
		sb.append(this.getNome());
		sb.append("\nIdade: ");
		sb.append(this.getIdade());

		return sb.toString();
	}
}