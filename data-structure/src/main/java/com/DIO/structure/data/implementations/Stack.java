package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.interfaces.IStack;

public class Stack<T> implements IStack<T> {
	private Node<T> topNode;

	public Stack() {
		this.topNode = null;
	}

	public boolean isEmpty() {
		return (this.topNode == null);
	}

	public T top() {
		return (this.topNode == null ? null : this.topNode.getValue());
	}

	public void push(T value) {
		Node<T> node = new Node<>(value);
		Node<T> tempNode = this.topNode;
		this.topNode = node;
		node.setNextNode(tempNode);
	}

	public T pop() {
		if (this.isEmpty()) {
			return null;
		}

		Node<T> tempNode = this.topNode;
		this.topNode = this.topNode.getNextNode();

		return tempNode.getValue();
	}

	@Override
	public String toString() {
		String tempString = "{\n\t\"stack\": [\n\t\t";
		
		Node<T> tempNode = this.topNode;
		while (tempNode != null) {
			tempString += tempNode.toString();
			tempNode = tempNode.getNextNode();

			if (tempNode != null ) {
				tempString += ",\n\t\t";
			}
		}

		tempString += "\n\t]\n}\n";
		return tempString;
	}
}
