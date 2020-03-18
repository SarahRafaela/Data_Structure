package vetorez_matrizes;

public class Exercicio_2 {
	public static void main(String[] args) {

		int[] array = new int[5];
		array = carregaVetor(array);

		for (int x = 0; x < array.length; x++) {
			System.out.println(fatorial(array[x]));
		}
	}

	private static int fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		
		return num * fatorial(num - 1);
	}


	public static int[] carregaVetor(int array[]) {

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 10);

			System.out.println(array[i]);

		}

		return array;

	}
}
