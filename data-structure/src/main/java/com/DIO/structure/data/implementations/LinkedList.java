package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.interfaces.ILinkedList;

public class LinkedList<T extends Comparable<T>> implements ILinkedList<T> {
	private Node<T> nextNode;
	private int size;

	public LinkedList() {
		this.nextNode = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return (this.nextNode == null);
	}

	public void add(T value) {
		Node<T> node = new Node<>(value);
		Node<T> tempNode = this.nextNode;

		if (this.nextNode == null) {
			this.nextNode = node;
			this.size++;
			return;
		}

		while (tempNode.getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}

		tempNode.setNextNode(node);
		this.size++;
	}

	public T remove(int index) {
		Node<T> node = this.getNode(index);
		Node<T> previousNode = this.getNode(index - 1);

		if (node == null) {
			return null;
		}

		if (previousNode == null) {
			this.nextNode = node.getNextNode();
		} else {
			previousNode.setNextNode(node.getNextNode());
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

	private Node<T> getNode(int index) {
		if (index < 0 || index > this.size) {
			return null;
		}

		Node<T> tempNode = this.nextNode;
		while (index > 0 && tempNode != null) {
			index--;
			tempNode = tempNode.getNextNode();
		}

		return tempNode;
	}

	@Override
	public String toString() {
		String tempString = "{\n\t\"linked_list\": [\n\t\t";

		Node<T> tempNode = this.nextNode;
		while (tempNode != null) {
			tempString += tempNode.toString();
			tempNode = tempNode.getNextNode();

			if (tempNode != null) {
				tempString += ",\n\t\t";
			}
		}

		tempString += "\n\t]\n}\n";
		return tempString;
	}
}
