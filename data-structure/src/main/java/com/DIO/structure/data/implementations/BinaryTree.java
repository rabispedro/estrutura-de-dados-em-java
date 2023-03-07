package com.DIO.structure.data.implementations;

import com.DIO.structure.data.Node;
import com.DIO.structure.data.enums.BinaryTreeOrderEnum;
import com.DIO.structure.data.interfaces.IBinaryTree;

public class BinaryTree<T extends Comparable<T>> implements IBinaryTree<T>{
	private Node<T> rootNode;

	public BinaryTree() {
		this.rootNode = null;
	}

	public boolean isEmpty() {
		return (this.rootNode == null);
	}

	public void add(T value) {
		Node<T> newNode = new Node<>(value);
		this.rootNode = this.addNode(this.rootNode, newNode);
	}

	public void remove(T value) {
		Node<T> parentNode = null;
		Node<T> childNode = null;
		Node<T> temporaryNode = null;
		Node<T> node = this.rootNode;
		
		while (node != null && !node.getValue().equals(value)) {
			parentNode = node;

			if (value.compareTo(node.getValue()) < 0) {
				node = node.getPreviousNode();
			} else {
				node = node.getNextNode();
			}
		}

		if (node == null) {
			return;
		}

		if (parentNode == null) {
			if (node.getNextNode() == null) {
				this.rootNode = node.getPreviousNode();
			} else if (node.getPreviousNode() == null){
				this.rootNode = node.getNextNode();
			} else {
				temporaryNode = node;
				childNode = node.getPreviousNode();

				while (childNode.getNextNode() != null) {
					if (childNode != node.getPreviousNode()) {
						temporaryNode.setNextNode(childNode.getPreviousNode());
						childNode.setPreviousNode(this.rootNode.getPreviousNode());
					}

					temporaryNode = childNode;
					childNode = childNode.getPreviousNode();
				}

				childNode.setNextNode(this.rootNode.getNextNode());
				this.rootNode = childNode;
			}
		} else if (node.getNextNode() == null) {
			if (parentNode.getPreviousNode() == node) {
				parentNode.setPreviousNode(node.getPreviousNode());
			} else {
				parentNode.setNextNode(node.getPreviousNode());
			}
		} else if (node.getPreviousNode() == null) {
			if (parentNode.getPreviousNode() == node) {
				parentNode.setPreviousNode(node.getNextNode());
			} else {
				parentNode.setNextNode(node.getNextNode());
			}
		} else {
			temporaryNode = node;
			childNode = node.getPreviousNode();

			while (childNode.getNextNode() != null) {
				if (childNode != node.getPreviousNode()) {
					temporaryNode.setNextNode(childNode.getPreviousNode());
					childNode.setPreviousNode(node.getPreviousNode());
				}
				childNode.setNextNode(node.getNextNode());

				if (parentNode.getPreviousNode() == node) {
					parentNode.setPreviousNode(childNode);
				} else {
					parentNode.setNextNode(childNode);
				}

				temporaryNode = childNode;
				childNode = childNode.getNextNode();
			}
		}

		node.setNextNode(null);
		node.setPreviousNode(null);
		return;
	}

	public T root() {
		if (this.rootNode == null) {
			return null;
		}

		return this.rootNode.getValue();
	}


	public void show() {
		this.show(BinaryTreeOrderEnum.IN_ORDER);
	}

	public void show(BinaryTreeOrderEnum order) {
		switch (order) {
			case IN_ORDER:
			System.out.printf("{\n\t\"in_order_binary_tree\": [\n");
			break;
			case POS_ORDER: 
			System.out.printf("{\n\t\"pos_order_binary_tree\": [\n");
			break;
			case PRE_ORDER:
			System.out.printf("{\n\t\"pre_order_binary_tree\": [\n");
				break;
			default:
				break; 
		}

		this.showNodes(order, this.rootNode);

		if (!this.isEmpty()) {
			Node<T> node = new Node<>();
			System.out.printf("\t\t" + node.toString());
		}

		System.out.printf("\n\t]\n}\n");
	}

	private Node<T> addNode(Node<T> node, Node<T> newNode) {
		if (node == null) {
			return newNode;
		}

		if (newNode.getValue().compareTo(node.getValue()) < 0) {
			node.setPreviousNode(this.addNode(node.getPreviousNode(), newNode));
		} else {
			node.setNextNode(this.addNode(node.getNextNode(), newNode));
		}

		return node;
	}

	private void showNodes(BinaryTreeOrderEnum order, Node<T> node) {
		if (node == null) {
			return;
		}

		switch (order) {
			case IN_ORDER:
				this.showNodes(order, node.getPreviousNode());
				System.out.print("\t\t" + node.toString() + ",\n");
				this.showNodes(order, node.getNextNode());
				break;
			case POS_ORDER:
				this.showNodes(order, node.getPreviousNode());
				this.showNodes(order, node.getNextNode());
				System.out.print("\t\t" + node.toString() + ",\n");
				break;
			case PRE_ORDER:
				System.out.print("\t\t" + node.toString() + ",\n");
				this.showNodes(order, node.getPreviousNode());
				this.showNodes(order, node.getNextNode());
				break;
			default:
				break;
		}
	}
}
