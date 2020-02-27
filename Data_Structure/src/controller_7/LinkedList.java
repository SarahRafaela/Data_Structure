package controller_7;

import model_7.Node;

public class LinkedList {

	protected Node head;
	protected Node tail;
	protected long size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}

	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}

	public void insertFirst(Node newNode) {
		// primeiro seto o head atual como próximo do novo Nó
		newNode.setNext(head);
		// depois seto o head como o novo Nó
		head = newNode;
		size++;
		if (size == 1) {
			tail = head;
		}
	}

	public void insertLast(Node newNode) {
		if (isEmpty()) {
			insertFirst(newNode);
		} else {
			// o próx. do tail é sempre vazio então o Nó novo precisa ter essa
			// caracteristica
			newNode.setNext(null);
			// o tail atual vira o penultimo elemento
			tail.setNext(newNode);
			// o newNode precisa ser o novo tail
			tail = newNode;
			size++;
		}

	}

	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedElement = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();
		}
		size--;
		return removedElement;
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedElement = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			Node current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			current.setNext(null);
			tail = current;
			
		}

		size--;
		return removedElement;
	}
	//Exercicio 7
	public Node removeFirst(int position) throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedElement ;
	
		if (position <= size) {
			Node current = head;
			int i = 0;
			while (i != position ) {
				current = current.getNext();
				i++;
			}
			
			
		} else {
			throw new UnderflowException();
		}
		size--;
		return removedElement;
	}

}
