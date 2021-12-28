package com.DIO.structure.data.queue;

import com.DIO.structure.data.utils.Node;

public class Queue <T> {
	private Node<T> startNode;

	public Queue() {
		this.startNode = null;
	}

	public boolean isEmpty() {
		return (this.startNode == null ? true : false);
	}

	public void enqueue(T value) {
		Node<T> node = new Node<T>(value);
		node.setReferenceNode(this.startNode);
		this.startNode = node;
	}

	public T dequeue() {
		if(!this.isEmpty()) {
			Node<T> tempNode = this.startNode;
			Node<T> previousNode = this.startNode;

			if(tempNode.getReferenceNode() == null) {
				this.startNode = null;
				return tempNode.getData();
			}
			
			while(tempNode.getReferenceNode() != null) {
				previousNode = tempNode;
				tempNode = tempNode.getReferenceNode();
			}

			previousNode.setReferenceNode(null);

			return tempNode.getData();
		}
		return null;
	}

	public T first() {
		if(!this.isEmpty()) {
			Node<T> tempNode = this.startNode;

			while(tempNode.getReferenceNode() != null) {
				tempNode = tempNode.getReferenceNode();
			}

			return tempNode.getData();
		}
		return null;
	}

	@Override
	public String toString() {
		String tempString = "Queue : {\n\t";
		
		Node<T> tempNode = this.startNode;
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
