package com.DIO.structure.data;

public class Node <T> {
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
}
