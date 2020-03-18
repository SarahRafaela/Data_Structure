package listaSimples;

public class ListaSimplesmenteEncadeada {
	protected Node head;
	protected Node tail;
	protected long size;

	public ListaSimplesmenteEncadeada() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Verifca se esta vazio
	public boolean isEmpty() {
		return head == null;
	}

	// Adicionar um dado elemento no inicio da Lista.
	public void addInicio(Node novoNode) {
		novoNode.setProx(head);
		head = novoNode;
		size++;
		if (size == 1) {
			tail = head;
		}

	}

	// Adicionar um dado elemento no fim da Lista.
	public void addFim(Node novoNode) {
		if (isEmpty()) {
			addInicio(novoNode);
		} else {

			novoNode.setProx(null);
			// o penultimo é o ultimo atual
			tail.setProx(novoNode);
			// o ultimo vira o novo Nó
			tail = novoNode;
			size++;
		}
	}

	// Adicionar um dado elemento em uma dada posição.

	public void addPosicao(Node novoNo, int posicao) {
		if (posicao == 0) {
			addInicio(novoNo);
		} else if (isEmpty()) {
			addInicio(novoNo);
		} else {
			Node atual = head;
			Node anterior = null;
			int i = 0;

			if (posicao <= size) {
				while (i != posicao) {
					anterior = atual;
					atual = atual.getProx();
					i++;
				}
				anterior.setProx(novoNo);
				novoNo.setProx(atual);

				size++;
			}
		}
	}

	// Pegar o elemento da primeira posição.
	public Node getPrimeiro() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();

		}
		return head;
	}

	// Pegar o elemento da ultima posição.
	public Node getUltimo() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();

		}
		return tail;
	}

	// Pegar o elemento de uma determinada posição.
	public Node getPosicao(int posicao) throws UnderflowException {
		Node atual = head;
		if (isEmpty()) {
			throw new UnderflowException();

		} else {

			if (posicao <= size) {
				if (posicao == 0) {
					return head;
				}
				int i = 0;

				while (i != posicao) {
					atual = atual.getProx();
					i++;
				}
			}
		}

		return atual;
	}
	
	// Adicionar um dado elemento no inicio da Lista.
	public Node removeInicio() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getProx();
		}
		size--;
		return removedItem;
	}

	// Adicionar um dado elemento no fim da Lista.
	public Node removeFim() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			Node atual = head;
			while (atual.getProx() != tail) {
				atual = atual.getProx();
			}
			tail = atual;
			atual.setProx(null);
		}
		size--;
		return removedItem;
	}

	// Remover o elemento de uma determinada posição.
	public Node removePosicao(int posicao) throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node atual = head;
		if (posicao <= size) {
			if (posicao == 0) {
				removeInicio();
			}
			int i = 0;
			while (i != posicao) {
				atual = atual.getProx();
				i++;
			}
			Node removedItem = atual;
		}

		return atual;

	}

	// Verificar se um elemento está armazenado.
	public boolean contemElemento(Object element) {
		Node atual = head;

		while (atual != null) {

			atual = atual.getProx();

			if (atual.getElemento().equals(element)) {
				return true;
			}
		}

		return false;
	}

	// Informar o número de elementos armazenados.
	public long RetornaTamanho() {
		return size;
	}

	// Mostra lista
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			System.out.println("A lista é: ");
			Node atual = head;
			while (atual != null) {
				System.out.print(atual.getElemento().toString() + " ");
				atual = atual.getProx();
			}
			System.out.println("\n");

		}
	}
}
