package ex4;

public class Dividir {

	public static void main(String[] args) {

		int a = 4;

		int b = 2;

		System.out.println(divisao(a, b));

	}

	private static int divisao(int a, int b) {

		if (a == 0 || b == 0) {

			return 0;

		}

		if ((a - b) < b) {

			return 1;

		} else {

			return (divisao(a - b, b) + 1);

		}

	}

}
