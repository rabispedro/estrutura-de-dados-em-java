package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.interfaces.IQueue;

public class Queue<T> implements IQueue<T> {
	private Node<T> startNode;

	public Queue() {
		this.startNode = null;
	}

	public boolean isEmpty() {
		return (this.startNode == null ? true : false);
	}

	public void enqueue(T value) {
		Node<T> node = new Node<>(value);
		node.setNextNode(this.startNode);
		this.startNode = node;
	}

	public T dequeue() {
		if (!this.isEmpty()) {
			Node<T> tempNode = this.startNode;
			Node<T> previousNode = this.startNode;

			if (tempNode.getNextNode() == null) {
				this.startNode = null;
				return tempNode.getValue();
			}
			
			while (tempNode.getNextNode() != null) {
				previousNode = tempNode;
				tempNode = tempNode.getNextNode();
			}

			previousNode.setNextNode(null);
			return tempNode.getValue();
		}

		return null;
	}

	public T first() {
		if (!this.isEmpty()) {
			Node<T> tempNode = this.startNode;

			while (tempNode.getNextNode() != null) {
				tempNode = tempNode.getNextNode();
			}

			return tempNode.getValue();
		}

		return null;
	}

	@Override
	public String toString() {
		String tempString = "Queue : {\n\t";

		Node<T> tempNode = this.startNode;
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
