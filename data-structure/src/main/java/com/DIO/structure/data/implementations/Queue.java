package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.interfaces.IQueue;

public class Queue<T extends Comparable<T>> implements IQueue<T> {
	private Node<T> lastNode;

	public Queue() {
		this.lastNode = null;
	}

	public boolean isEmpty() {
		return (this.lastNode == null ? true : false);
	}

	public void enqueue(T value) {
		Node<T> node = new Node<>(value);
		node.setNextNode(this.lastNode);
		this.lastNode = node;
	}

	public T dequeue() {
		if (this.isEmpty()) {
			return null;
		}

		Node<T> tempNode = this.lastNode;
		Node<T> previousNode = this.lastNode;

		if (tempNode.getNextNode() == null) {
			this.lastNode = null;
			return tempNode.getValue();
		}
		
		while (tempNode.getNextNode() != null) {
			previousNode = tempNode;
			tempNode = tempNode.getNextNode();
		}

		previousNode.setNextNode(null);
		return tempNode.getValue();
	}

	public T first() {
		if (this.isEmpty()) {
			return null;
		}

		Node<T> tempNode = this.lastNode;
		while (tempNode.getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}

		return tempNode.getValue();
	}

	@Override
	public String toString() {
		String tempString = "{\n\t\"queue\": [\n\t\t";

		Node<T> tempNode = this.lastNode;
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
