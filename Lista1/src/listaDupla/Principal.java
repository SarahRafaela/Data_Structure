package listaDupla;



public class Principal {
	public static void main(String[] args) throws UnderflowException {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		try {
			lista.addInicio(new DNode(1));
			lista.addInicio(new DNode(2));
			lista.addInicio(new DNode(3));
			lista.addInicio(new DNode(4));
			lista.addFim(new DNode(5));
			lista.addPosicao(new DNode(6), 2);
		System.out.println("Retorna o quarto elemento é: " + Integer.toString(lista.getPosicao(3).getElement()));
			lista.removePosicao(3);
			lista.removeInicio();
			lista.removeFim();
			System.out.println("Retorno tamanho: " + lista.RetornaTamanho());
		} catch (UnderflowException e) {
			
		System.out.println("Erro impossivel remover");	
	e.printStackTrace();
		}
		lista.show();
	}
}
