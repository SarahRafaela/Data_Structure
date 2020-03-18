package listaDupla;

import listaSimples.Node;
import listaSimples.UnderflowException;

public class ListaDuplamenteEncadeada {
	protected DNode head;
	protected DNode tail;
	protected long size;

	public ListaDuplamenteEncadeada() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Verifca se esta vazio
	public boolean isEmpty() {
		return head == null;
	}

	public void addInicio(DNode novoNode) {

		if (isEmpty()) {
			tail = head = novoNode;
			size++;
		} else {
			novoNode.setProx(head);
			head.setProx(novoNode);
			head = novoNode;
			size++;
		}

	}

	// Adicionar um dado elemento no fim da Lista.
	public void addFim(DNode novoNode) {
		if (isEmpty()) {
			addInicio(novoNode);
		} else {
			tail.setProx(novoNode);
			novoNode.setAnt(tail);
			novoNode.setProx(null);
			size++;
		}
	}

	// Adicionar um dado elemento em uma dada posi��o.

	public void addPosicao(DNode novoNo, int posicao) {
		if (posicao == 0) {
			addInicio(novoNo);
		} else {
			DNode atual = head;
			DNode anterior = null;
			int i = 0;

			if (posicao <= size) {
				while (i != posicao) {
					anterior = atual;
					atual = atual.getProx();
					i++;
				}

				anterior.setProx(novoNo);
				novoNo.setProx(atual);
				novoNo.setAnt(anterior);
				atual.setAnt(novoNo);

				size++;
			}
		}
	}

	// Pegar o elemento da primeira posi��o.
	public DNode getPrimeiro() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();

		}
		return head;
	}

	// Pegar o elemento da ultima posi��o.
	public DNode getUltimo() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();

		}
		return tail;
	}

	// Pegar o elemento de uma determinada posi��o.
	public DNode getPosicao(int posicao) throws UnderflowException {
		DNode atual = head;
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
	public DNode removeInicio() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		DNode removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head.getProx().setAnt(null);
			head = head.getProx();
		}
		size--;
		if (isEmpty()) {
			throw new UnderflowException();
		}

		return removedItem;
	}

	// Adicionar um dado elemento no fim da Lista.
	public DNode removeFim() throws UnderflowException {

		if (isEmpty()) {
			throw new UnderflowException();
		}
		DNode removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			tail.getAnt().setProx(null);
			tail = tail.getAnt();
		}
		size--;
		return removedItem;
	}

	// Remover o elemento de uma determinada posi��o.
	public DNode removePosicao(int posicao) throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		DNode atual = head;
		DNode anterior = null;
		if (posicao <= size) {
			if (posicao == 0) {
				removeInicio();
			}
			int i = 0;
			while (i != posicao) {
				anterior = atual;
				atual = atual.getProx();
				i++;
			}
			anterior.setProx(atual.getProx());
			atual.getProx().setAnt(anterior);

		}

		size--;
		DNode removedItem = atual;
		return removedItem;

	}

	// Verificar se um elemento est� armazenado.
	public boolean contemElemento(int element) {
		DNode atual = head;

		while (atual != null) {

			atual = atual.getProx();

			if (atual.getElement() == element) {
				return true;
			}
		}

		return false;
	}

	// Informar o n�mero de elementos armazenados.
	public long RetornaTamanho() {
		return size;
	}

	// Mostra lista
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			System.out.println("A lista �: ");
			DNode atual = head;
			while (atual != null) {
				System.out.print( Integer.toString(atual.getElement()) + " ");
				atual = atual.getProx();
			}
			System.out.println("\n");

		}
	}
}
