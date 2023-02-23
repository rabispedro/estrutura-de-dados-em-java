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
		if (!this.isEmpty()) {
			Node<T> tempNode = this.topNode;
			this.topNode = this.topNode.getNextNode();

			return tempNode.getValue();
		}

		return null;
	}

	@Override
	public String toString() {
		String tempString = "Stack : {\n\t";
		
		Node<T> tempNode = this.topNode;
		while (tempNode != null) {
			tempString += tempNode.toString();
			tempNode = tempNode.getNextNode();

			if (tempNode != null ) {
				tempString += "\n\t";
			}
		}

		tempString += "\n}\n";
		return tempString;
	}
}
