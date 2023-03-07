package com.DIO.structure.data;

public class Node<T extends Comparable<T>> {
	private T value;
	private Node<T> nextNode;
	private Node<T> previousNode;

	public Node() {
		this.nextNode = null;
		this.previousNode = null;
	}

	public Node(T value) {
		this.value = value;
		this.nextNode = null;
		this.previousNode = null;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextNode() {
		return this.nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getPreviousNode() {
		return this.previousNode;
	}

	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public String toString() {
		return ("{ \"value\": \"" + this.value + "\" }");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
