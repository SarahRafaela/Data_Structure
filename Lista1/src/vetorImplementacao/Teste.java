package vetorImplementacao;

import java.util.ArrayList;

public class Teste {
 public static void main(String[] args) {
	ArrayList<Object> vetor = new ArrayList();
	
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	Aluno aluno3 = new Aluno();
	
	vetor.add(aluno1);
	vetor.add(aluno2);
	vetor.add(aluno3);
	
	int tamanho = vetor.size();
	
	if (tamanho !=3 ) {
		System.out.println("Erro! o tamanho da lista esta errado");
	}
	
	if (!vetor.contains(aluno1)) {
		System.out.println("Erro! N�o achou um aluno que deveria estar na lista");
	}
	
	vetor.remove(0);
	tamanho = vetor.size();
	
	if (tamanho != 2) {
		System.out.println("Erro: O tamanho da lista esta errado");
	}
	if (!vetor.contains(aluno3)) {
		System.out.println("Erro! Achou um aluno que n�o deveria estar na lista");
	}
}
}
