package com.DIO.structure.data.stack;

import com.DIO.structure.data.utils.Node;

public class Stack <T> {
	private Node<T> topNode;

	public Stack() {
		this.topNode = null;
	}

	public boolean isEmpty() {
		return (this.topNode == null ? true : false);
	}

	public T top() {
		return (this.topNode == null ? null : this.topNode.getData());
	}

	public void push(T value) {
		Node<T> node = new Node<T>(value);
		Node<T> tempNode = this.topNode;
		this.topNode = node;
		node.setReferenceNode(tempNode);
	}

	public T pop() {
		if(!this.isEmpty()) {
			Node<T> tempNode = this.topNode;
			this.topNode = this.topNode.getReferenceNode();
			return tempNode.getData();
		}
		return null;
	}

	@Override
	public String toString() {
		String tempString = "Stack : {\n\t";
		
		Node<T> tempNode = this.topNode;
		while(tempNode != null) {
			tempString += tempNode.toString();
			tempNode = tempNode.getReferenceNode();
			if(tempNode != null ) {
				tempString += "\n\t";
			}
		}
		
		tempString += "\n}\n";
		return tempString;
	}
}
