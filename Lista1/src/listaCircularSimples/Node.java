package listaCircularSimples;

public class Node {
	private String elemento;
	private Node prox;
	
	public Node () {
		
	}
	public Node(String elemento) {
		this.elemento = elemento;
		}

	
	public Node (String e, Node p) {
		this.elemento = e;
		this.prox = p;
	}
	
	
	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}
	

}
