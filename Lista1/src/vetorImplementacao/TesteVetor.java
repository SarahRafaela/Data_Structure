package vetorImplementacao;

public class TesteVetor {
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		vetor.adciona(aluno1);
		vetor.adciona(aluno2);
		vetor.adciona(aluno3);
		
		int tamanho = vetor.tamanho();
		
		if (tamanho !=3 ) {
			System.out.println("Erro! o tamanho da lista esta errado");
		}
		
		if (!vetor.contem(aluno1)) {
			System.out.println("Erro! Não achou um aluno que deveria estar na lista");
		}
		
		vetor.remove(0);
		tamanho = vetor.tamanho();
		
		if (tamanho != 2) {
			System.out.println("Erro: O tamanho da lista esta errado");
		}
		if (!vetor.contem(aluno3)) {
			System.out.println("Erro! Achou um aluno que não deveria estar na lista");
		}
	}
}
