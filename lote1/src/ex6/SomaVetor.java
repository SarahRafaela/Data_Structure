package ex6;

import javax.swing.JOptionPane;

public class SomaVetor {

	public static void main(String[] args) {
		double[] v1 = new double[10];
		double[] v2 = new double[10];
		double[] v3 = new double[10];

		for (int i = 0; i < v1.length; i++) {
			v1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
			System.out.print(" V1[" + v1[i] + "] ");
		}

		for (int i = 0; i < v2.length; i++) {
			v2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
			System.out.print(" V2[" + v2[i] + "] ");
		}

		for (int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] + v2[i];
		}

		System.out.println("\n\n Resultado Soma...\n");
		for (int i = 0; i < v3.length; i++) {
			System.out.println(" Vetor[" + i + "] = " + v3[i]);
		}

		for (int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] - v2[i];
		}

		System.out.println("\n\n Resultado Subtração...\n");
		for (int i = 0; i < v3.length; i++) {
			System.out.println(" Vetor[" + i + "] = " + v3[i]);
		}

		for (int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] * v2[i];
		}

		System.out.println("\n\n Resultado Multiplicação...\n");
		for (int i = 0; i < v3.length; i++) {
			System.out.println(" Vetor[" + i + "] = " + v3[i]);
		}

		for (int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] / v2[i];
		}

		System.out.println("\n\n Resultado Divisão...\n");
		for (int i = 0; i < v3.length; i++) {
			System.out.println(" Vetor[" + i + "] = " + v3[i]);
		}
	}

}
