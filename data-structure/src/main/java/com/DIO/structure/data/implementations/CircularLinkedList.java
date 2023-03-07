package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
// import java.util;
import com.DIO.structure.data.interfaces.ICircularLinkedList;

public class CircularLinkedList<T extends Comparable<T>> implements ICircularLinkedList<T> {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	public CircularLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void add(T value) {
		Node<T> node = new Node<>(value);

		if (this.isEmpty()) {
			node.setNextNode(node);
			this.firstNode = node;
			this.lastNode = node;
			this.size++;
			return;
		}

		node.setNextNode(this.firstNode);
		this.lastNode.setNextNode(node);
		this.lastNode = node;

		this.size++;
	}

	public T remove(int index) {
		Node<T> node = this.getNode(index);
		Node<T> previousNode = this.getNode(index-1);

		if (node == null || previousNode == null) {
			return null;
		}

		previousNode.setNextNode(node.getNextNode());

		if ((Math.abs(index) % this.size) == 0) {
			this.firstNode = node.getNextNode();
			this.lastNode.setNextNode(this.firstNode);
		}

		if (this.size == 1) {
			this.firstNode = null;
			this.lastNode = null;
		}

		this.size--;
		return node.getValue();
	}

	public T get(int index) {
		Node<T> node = this.getNode(index);

		if (node == null) {
			return null;
		}

		return node.getValue();
	}

	public int size() {
		return this.size;
	}

	public T first() {
		if (this.firstNode == null) {
			return null;
		}

		return this.firstNode.getValue();
	}

	public T last() {
		if (this.lastNode == null) {
			return null;
		}

		return this.lastNode.getValue();
	}
	
	private Node<T> getNode(int index) {
		if (this.isEmpty()) {
			return null;
		}

		Node<T> node = this.firstNode;

		while ((Math.abs(index) % this.size) > 0) {
			index--;
			node = node.getNextNode();
		}

		return node;
	}

	@Override
	public String toString() {
		String tempString = "{\n\t\"circular_linked_list\": [\n\t\t";

		Node<T> tempNode = this.firstNode;

		int size = this.size;
		while (size > 0) {
			size--;
			tempString += tempNode.toString();
			tempNode = tempNode.getNextNode();

			if (size > 0) {
				tempString += ",\n\t\t";
			}
		}

		tempString += "\n\t]\n}\n";
		return tempString;
	}
}
