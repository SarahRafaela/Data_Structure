package alunoLista;

public class Celula {
//Node da professora
	private Celula prox;
	private Object element;

	public Celula(Celula prox, Object element) {
		this.prox = prox;
		this.element = element;

	}

	public Celula(Object element) {
		this.element = element;
	}

	public Celula(Celula prox) {
		this.prox = prox;

	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}
}
