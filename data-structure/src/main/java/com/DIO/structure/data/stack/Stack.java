package com.DIO.structure.data.stack;

import com.DIO.structure.data.utils.Node;

public class Stack {
	private Node topNode;

	public Stack() {
		this.topNode = null;
	}

	public boolean isEmpty() {
		return (this.topNode == null ? true : false);
	}

	public Node top() {
		return this.topNode;
	}

	public void push(Node node) {
		Node tempNode = this.topNode;
		this.topNode = node;
		node.setRedefenceNode(tempNode);
	}

	public Node pop() {
		if(!this.isEmpty()) {
			Node tempNode = this.topNode;
			this.topNode = this.topNode.getRedefenceNode();
			return tempNode;
		}
		return null;
	}

	@Override
	public String toString() {
		String tempString = "Stack : {\n\t";
		
		Node tempNode = this.topNode;
		while(tempNode != null) {
			tempString += tempNode.toString();
			tempNode = tempNode.getRedefenceNode();
			if(tempNode != null ) {
				tempString += "\n\t";
			}
		}
		
		tempString += "\n}\n";
		return tempString;
	}

	
}
