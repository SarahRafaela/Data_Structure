package ex5;

import javax.swing.JOptionPane;

public class Ordenar {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));
		ordemCrescente(1, n);
		ordemDecrescente(n);
	}

	private static int ordemCrescente(int i, int n) {
		if (n == 0 || n == 1) {
			System.out.println(n);
			return n;
		}
		if (i <= n) {
			System.out.println(i);
			return ordemCrescente((i + 1), n);
		}
		return 0;

	}

	public static int ordemDecrescente(int n) {
		if (n == 0) {
			return 1;
		} else {
			System.out.println(n);
			return n = ordemDecrescente(n - 1);
		}
	}

}
