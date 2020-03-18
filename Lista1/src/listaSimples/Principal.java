package listaSimples;

public class Principal {
	public static void main(String[] args) throws UnderflowException {
		ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
		try {
			lista.addInicio(new Node ("A"));
			lista.addInicio(new Node ("B"));
			lista.addInicio(new Node ("C"));
			lista.addInicio(new Node ("D"));
			lista.addFim(new Node ("E"));
			//lista.addPosicao(new Node ("L"), 2);
			System.out.println(lista.getPosicao(2).getElemento());
		 lista.RemoveFim();
		} catch(UnderflowException e) {
			System.out.println("Impossível remover!");
			e.printStackTrace();
		}
		lista.show();
	}
}
