package com.DIO.structure.data;

import com.DIO.structure.data.implementations.Queue;
import com.DIO.structure.data.implementations.Stack;

public class App {
	public static void main(String[] args) {
		System.out.printf("Java Data Structures - DIO\n\n");

		// -------------------------------------------------------------------------

		System.out.printf("-----------------------STACK-----------------------\n\n");
		Stack<String> myStack = new Stack<String>();

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack.toString() + "\n");

		myStack.push("1");
		myStack.push("2");
		myStack.push("3");
		myStack.push("4");
		myStack.push("5");
		myStack.push("6");

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack.toString() + "\n");

		while (!myStack.isEmpty()) {
			System.out.printf("Poped node: " + myStack.pop() + "\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack.toString() + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("-----------------------QUEUE-----------------------\n\n");
		Queue<String> myQueue = new Queue<String>();

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First node of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue.toString() + "\n");

		myQueue.enqueue("First");
		myQueue.enqueue("Second");
		myQueue.enqueue("Third");
		myQueue.enqueue("Fourth");
		myQueue.enqueue("Fifth");
		myQueue.enqueue("Sixth");

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First node of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue.toString());

		System.out.printf("\n");
		
		while(!myQueue.isEmpty()) {
			System.out.printf("Dequeued node: " + myQueue.dequeue() + "\n");
		}

		System.out.printf("\n");

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First node of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue.toString() + "\n");

		// -------------------------------------------------------------------------

	}
}
