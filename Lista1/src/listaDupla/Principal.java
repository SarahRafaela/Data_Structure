package listaDupla;

public class Principal {
	public static void main(String[] args) throws UnderflowException {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		//try {
			lista.addInicio(new DNode(1));
			lista.addInicio(new DNode(2));
			lista.addInicio(new DNode(3));
			lista.addInicio(new DNode(4));
			//lista.addFim(new DNode(5));
			//lista.addPosicao(new DNode(6), 2);
			//System.out.println("Retorna o quarto elemento" + Integer.toString(lista.getPosicao(3).getElement()));
			//lista.removeFim();
	//	} catch (listaSimples.UnderflowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	//	}
		lista.show();
	}
}
