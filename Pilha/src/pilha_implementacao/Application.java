package pilha_implementacao;

public class Application {
//last in first out
	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.adicionar(10);
		p.adicionar(12);
		p.adicionar(30);
		p.mostrar();
		p.remover();
		p.mostrar();
	}

}
