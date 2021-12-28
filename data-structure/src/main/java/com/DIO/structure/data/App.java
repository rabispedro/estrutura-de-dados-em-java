package com.DIO.structure.data;

import com.DIO.structure.data.stack.Stack;
import com.DIO.structure.data.utils.Node;

public class App {
	public static void main(String[] args) {
		System.out.printf("Data Structure - DIO\n\n");

		////////////////////////////////////////////////////////////////////////////

		//	Data for general use
		Node node1 = new Node(9);
		Node node2 = new Node(5);
		Node node3 = new Node(4);
		Node node4 = new Node(7);
		Node node5 = new Node(5);
		Node node6 = new Node(3);
		
		////////////////////////////////////////////////////////////////////////////
		
		System.out.printf("STACK:\n\n");
		Stack myStack = new Stack();

		myStack.push(node1);
		myStack.push(node2);
		myStack.push(node3);
		myStack.push(node4);
		myStack.push(node5);
		myStack.push(node6);

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack.toString());

		System.out.printf("\n");
		
		while(!myStack.isEmpty()) {
			System.out.printf("Poped node: " + myStack.pop() + "\n");
		}

		System.out.printf("\n");

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack.toString());

		System.out.printf("\n");

		////////////////////////////////////////////////////////////////////////////

		System.out.printf("QUEUE:\n\n");




		////////////////////////////////////////////////////////////////////////////

		
		// System.out.printf("STACK:\n");



		// System.out.printf("STACK:\n");
	}
}
