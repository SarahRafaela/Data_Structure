package ex7;

import javax.swing.JOptionPane;

public class BuscaVetor {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int cont = 0;
		int cont1 = 0;
		int aux = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		}

		int x = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um dos números digitados anteriormente para iniciar a busca: "));

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == x) {
				cont++;
				System.out.println("Número encontrado na posição: V[" + i + "] e o FOR foi executado: " + cont);
			}
			cont++;
		}

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("V" + i + "[" + vetor[i] + "]");
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == x) {
				cont1++;
				System.out.println("Número encontrado na posição: V[" + i + "] e o FOR foi executado: " + cont1);
			}
			cont1++;
		}

	}

}
