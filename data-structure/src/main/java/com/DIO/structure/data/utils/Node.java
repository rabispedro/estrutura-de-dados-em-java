package com.DIO.structure.data.utils;

public class Node <T> {
	private T data;
	private Node<T> referenceNode;

	public Node() {

	}

	public Node(T data) {
		this.data = data;
		this.referenceNode = null;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getReferenceNode() {
		return this.referenceNode;
	}

	public void setReferenceNode(Node redefenceNode) {
		this.referenceNode = redefenceNode;
	}

	@Override
	public String toString() {
		return ("Node : { data : " + this.data + " } ");
	}	
}
