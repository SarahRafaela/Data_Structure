package listaDupla;

public class DNode {
	private int element;
	private DNode prox;
	private DNode ant;

	public DNode() {

	}
	public DNode(int e) {
		this.element = e;
	}
	public DNode(int e, DNode p, DNode a) {
		this.element=e;
		this.prox=p;
		this.ant=a;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public DNode getProx() {
		return prox;
	}

	public void setProx(DNode prox) {
		this.prox = prox;
	}

	public DNode getAnt() {
		return ant;
	}

	public void setAnt(DNode ant) {
		this.ant = ant;
	}
	
}
