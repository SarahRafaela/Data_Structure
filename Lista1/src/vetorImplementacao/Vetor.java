package vetorImplementacao;

public class Vetor {
	private Object[] obj = new Object[100];

	private int totalDeObjetos = 0;

	public void adciona(Object objeto) {
		this.garanteEspaco();
		this.obj[this.totalDeObjetos] = obj;
		this.totalDeObjetos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.obj[i + 1] = this.obj[i];
		}
		this.obj[posicao] = aluno;
		this.totalDeObjetos++;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}

	public Object pega(int posicao) {
		if (this.posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição Inválida");
		return this.obj[posicao];

	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = 0; i < this.totalDeObjetos; i++) {
			this.obj[i] = this.obj[i + 1];
		}
		this.totalDeObjetos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (aluno.equals(this.obj[i])) {
				return true;

			}
		}
		return false;
	}

	private boolean posicaoOcupada(int posicao) {

		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}

	private void garanteEspaco() {
		if (this.totalDeObjetos == this.obj.length) {
			Object[] newArray = new Object[this.obj.length * 2];
			for (int i = 0; i < this.obj.length; i++) {
				newArray[i] = this.obj[i];
			}
			this.obj = newArray;
		}

	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}
	
}
