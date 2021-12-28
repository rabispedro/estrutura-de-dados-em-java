package com.DIO.structure.data.utils;

public class Node {
	private int data;
	private Node redefenceNode = null;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRedefenceNode() {
		return redefenceNode;
	}

	public void setRedefenceNode(Node redefenceNode) {
		this.redefenceNode = redefenceNode;
	}

	@Override
	public String toString() {
		return ("Node : { data =" + data + " }");
	}	
}
