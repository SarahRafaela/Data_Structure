package listaCircularSimples;

public class Principal {
	public static void main(String[] args) {
		
		ListaCircularSimples lista = new ListaCircularSimples();
		try {
			lista.addInicio(new Node("A"));
			lista.addInicio(new Node("B"));
			lista.addInicio(new Node("C"));
			lista.addInicio(new Node("D"));
			lista.addFim(new Node("E"));
			lista.addPosicao(new Node("L"), 0);
		
			System.out.println("Retorna o quarto elemento " + lista.getPosicao(3).getElemento());
			
			lista.removeFim();
			System.out.println("Ultimo elemento tail "+ lista.getUltimo().getElemento().toString()+" aponta para head " + lista.getUltimo().getProx().getElemento().toString());
		} catch (UnderflowException e) {
			System.out.println("Impossível remover!");
			e.printStackTrace();
		}
		lista.show();
	}
}
