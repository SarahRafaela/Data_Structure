package model_7;

public class Node {

	int element;
	Node next;

	public Node(int e, Node n) {
		element = e;
		next = n;
	}

	public Node(int element) {
		this(element, null);
	}

	public int getElement() {
		return element;
	}

	public void setElement(int newElement) {
		element = newElement;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNext) {
		next = newNext;
	}
}
