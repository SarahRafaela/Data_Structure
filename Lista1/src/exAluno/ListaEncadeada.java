package exAluno;

import javax.swing.JOptionPane;

public class ListaEncadeada {
	private Aluno fim;
	private long tamanho;

	public ListaEncadeada() {

		this.fim = null;
		this.tamanho = 0;

	}

	public void adcionaAluno(Aluno novo_aluno) {

		if (estaVazia()) {
			fim = novo_aluno;
			tamanho++;
		} else {
			novo_aluno.setAnterior(fim);
			fim = novo_aluno;
			tamanho++;
		}
	}

	public void ListarAluno() {
		String lista = " A lista de alunos é: \n";
		Aluno atual = fim;
		while (atual != null) {
			lista += "Nome do Aluno:" + atual.getNome().toString() + "\n Numero Matrícula"
					+ atual.getNumeroDeMatricula().toString() + "\n Disciplina" + atual.getDisciplina().toString()
					+ "\n " + "************************************************************************\n" + "\n";
			atual = atual.getAnterior();
		}
		JOptionPane.showMessageDialog(null, lista);

	}

	public String removeAluno(String aluno_nome) {
		String resultado = "Não encontrado! Não foi possível remover porque não existe";

		if (estaVazia()) {
			return "Lista vazia";
		} else {
			if (tamanho == 1) {
				fim = null;
				resultado = "Removido!";
				return resultado;
			}
			Aluno atual = fim;
			int cont = 0;
			while (atual != null) {
				if (atual.getNome().equals(aluno_nome)) {
					resultado = "Removido!";
					int i = 0;
					Aluno prox = fim;
					while (i < cont) {
						prox = prox.getAnterior();
						i++;
					}
					prox.setAnterior(atual.getAnterior());
					tamanho--;
					break;
				}
				atual.getAnterior();
				cont++;

			}
			return resultado;

		}
	}

	public boolean estaVazia() {
		if (tamanho == 0)
			return true;
		return false;

	}

	public void obterMediaAluno(String nome_aluno) throws UnderflowException {
		Aluno atual = fim;
		if (estaVazia()) {
			throw new UnderflowException();
		} else {
			while (atual != null) {
				if (atual.getNome().equals(nome_aluno)) {

					break;
				}
				atual.getAnterior();
			}
		}
		if (atual == fim && !atual.getNome().equals(nome_aluno)) {
			throw new UnderflowException();
		} else {
			if (atual.getNotaP1() + atual.getNotaP2() >= 12) {
			float media = (atual.getNotaP1() + atual.getNotaP2()) / 2;
			if (media <= 10) {
				JOptionPane.showMessageDialog(null, "Media P1 + P2 " + media);
				
			}
			//depois eu faço o calculo com sub mas esse é o conceito!
			}
		}
		

	}
}
