package ex8;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		ListaPessoa lista = new ListaPessoa();

		pessoa.setNome("Lucas");
		pessoa.setIdade(20);
		lista.adicionaInicio(pessoa);

		Pessoa pessoa1 = new Pessoa();

		pessoa1.setNome("Carol");
		pessoa1.setIdade(22);
		lista.adicionaInicio(pessoa1);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.setNome("Julia");
		pessoa2.setIdade(19);
		lista.adicionaPos(pessoa2, 1);

		lista.exibir();
	}

}
