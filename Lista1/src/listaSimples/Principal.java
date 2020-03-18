package listaSimples;

public class Principal {
	public static void main(String[] args) throws UnderflowException {
		ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
		try {
			lista.addInicio(new Node("A"));
			lista.addInicio(new Node("B"));
			lista.addInicio(new Node("C"));
			lista.addInicio(new Node("D"));
			lista.addFim(new Node("E"));
			lista.addPosicao(new Node("L"), 0);
			System.out.println("Retorna o quarto elemento" + lista.getPosicao(3).getElemento());
			lista.removeFim();
		} catch (UnderflowException e) {
			System.out.println("Impossível remover!");
			e.printStackTrace();
		}
		lista.show();
	}
}
