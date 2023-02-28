package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.interfaces.IDoublyLinkedList;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	public DoublyLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return (this.firstNode == null);
	}

	public void add(T value) {
		Node<T> node = new Node<>(value);
		node.setPreviousNode(this.lastNode);
		this.size++;

		if (this.firstNode == null) {
			this.firstNode = node;
			this.lastNode = node;
			return;
		}

		this.lastNode.setNextNode(node);
		this.lastNode = node;
	}

	public void add(T value, int index) {
		Node<T> newNode = new Node<>(value);
		Node<T> node = this.getNode(index);

		if (node == null) {
			return;
		}

		newNode.setNextNode(node);
		newNode.setPreviousNode(node.getPreviousNode());
		
		if (node.getPreviousNode() != null) {
			node.getPreviousNode().setNextNode(newNode);
		}
		node.setPreviousNode(newNode);

		if (index == 0) {
			this.firstNode = newNode;
		}

		this.size++;
	}

	public T remove(int index) {
		Node<T> node = this.getNode(index);

		if (node == null) {
			return null;
		}

		if (index == 0) {
			this.firstNode = node.getNextNode();
		}
		if (index == this.size-1) {
			this.lastNode = node.getPreviousNode();
		}

		if (node.getNextNode() != null) {
			node.getNextNode().setPreviousNode(node.getPreviousNode());
		}
		if (node.getPreviousNode() != null) {
			node.getPreviousNode().setNextNode(node.getNextNode());
		}

		node.setNextNode(null);
		node.setPreviousNode(null);

		this.size--;
		return node.getValue();
	}

	public T get(int index) {
		Node<T> tempNode = this.getNode(index);

		if (tempNode == null) {
			return null;
		}

		return tempNode.getValue();
	}

	public int size() {
		return this.size;
	}

	private Node<T> getNode(int index) {
		if (index < 0 || index > this.size) {
			return null;
		}

		Node<T> tempNode = this.firstNode;
		while (index > 0 && tempNode != null) {
			index--;
			tempNode = tempNode.getNextNode();
		}

		return tempNode;
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

	@Override
	public String toString() {
		String tempString = "{\n\t\"doubly_linked_list\": [\n\t\t";

		Node<T> tempNode = this.firstNode;
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
