package pilha_implementacao;

import javax.swing.JOptionPane;

public class Pilha {
	int inicio;
	int fim;
	int tamanho;
	int qtdeElementos;
	int p[];

	public Pilha() {
		inicio = fim = -1;
		tamanho = 100;
		p = new int[tamanho];
		qtdeElementos = 0;
	}

	public boolean estaVazia() {
		if (qtdeElementos == 0) {
			return true;
		}
		return false;
	}

	public boolean estaCheia() {
		if (qtdeElementos == tamanho - 1) {
			return true;
		}
		return false;
	}

	public void adicionar(int e) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			p[fim] = e;
			qtdeElementos++;
		}
	}

	public void remover() {
		if (!estaVazia()) {
			fim--;
			qtdeElementos--;
		}
	}

	public void mostrar() {
		String elementos = "";
		for (int i = fim; i >= 0; i--) {
			elementos += p[i] + " - ";
		}
		JOptionPane.showMessageDialog(null, elementos);
	}

}
