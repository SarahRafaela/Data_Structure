package aeroporto;



public class AeroportoList {
	protected Aeroporto  head;
	protected Aeroporto  tail;
	protected long size;

	public AeroportoList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Verifca se esta vazio
	public boolean isEmpty() {
		return head == null;
	}

	// Adicionar um dado elemento no inicio da Lista.
	public void addInicio(Aeroporto novoAeroporto) {
		novoAeroporto .setProx(head);
		head = novoAeroporto ;
		size++;
		if (size == 1) {
			tail = head;
		}

	}

	// Adicionar um dado elemento no fim da Lista.
	public void addFim(Aeroporto novoAeroporto) {
		if (isEmpty()) {
			addInicio(novoAeroporto );
		} else {

			novoAeroporto .setProx(null);
			// o penultimo é o ultimo atual
			tail.setProx(novoAeroporto );
			// o ultimo vira o novo Nó
			tail = novoAeroporto ;
			size++;
		}
	}

	// Adicionar um dado elemento em uma dada posição.

	public void addPosicao(Aeroporto  novoNo, int posicao) {
		if (posicao == 0) {
			addInicio(novoNo);
		} else if (isEmpty()) {
			addInicio(novoNo);
		} else {
			Aeroporto  atual = head;
			Aeroporto  anterior = null;
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
	public Aeroporto  getPrimeiro() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();

		}
		return head;
	}

	// Pegar o elemento da ultima posição.
	public Aeroporto  getUltimo() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();

		}
		return tail;
	}

	// Pegar o elemento de uma determinada posição.
	public Aeroporto  getPosicao(int posicao) throws UnderflowException {
		Aeroporto  atual = head;
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
	public Aeroporto  removeInicio() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		Aeroporto  removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getProx();
		}
		size--;
		return removedItem;
	}

	// Adicionar um dado elemento no fim da Lista.
	public Aeroporto  removeFim() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		Aeroporto  removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			Aeroporto  atual = head;
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
	public Aeroporto  removePosicao(int posicao) throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Aeroporto  atual = head;
		if (posicao <= size) {
			if (posicao == 0) {
				removeInicio();
			}
			int i = 0;
			while (i != posicao) {
				atual = atual.getProx();
				i++;
			}
			Aeroporto  removedItem = atual;
		}

		return atual;

	}

	// Verificar se um elemento está armazenado.
	public boolean contemSigla(Object element) {
		Aeroporto  atual = head;

		while (atual != null) {

			atual = atual.getProx();

			if (atual.getSigla().equals(element)) {
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
			System.out.println("A lista de Aeroportos fechados é: ");
			Aeroporto  atual = head;
			while (atual != null) {
				System.out.println(atual.getSigla().toString() + "  ");
				atual = atual.getProx();
			}
			System.out.println("\n");

		}
	}
}

