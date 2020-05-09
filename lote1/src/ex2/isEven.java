package ex2;

import javax.swing.JOptionPane;

public class isEven {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número: "));
		verNumPar(n);
	}

	private static void verNumPar(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		if (verPar(n) == true) {
			JOptionPane.showMessageDialog(null, 1);
		} else {
			JOptionPane.showMessageDialog(null, 0);
		}

	}

	private static boolean verPar(int n) {
		return (n % 2 == 0) ? true : false;
	}
}
