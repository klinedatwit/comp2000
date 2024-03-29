package utils;

public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data, Node<T> nextNode) {
		this.data = data;
		next = nextNode;
	}

	public Node(T data) {
		this(data, null);
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
