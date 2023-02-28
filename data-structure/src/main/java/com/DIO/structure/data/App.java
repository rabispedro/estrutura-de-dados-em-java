package com.DIO.structure.data;

import com.DIO.structure.data.implementations.DoublyLinkedList;
import com.DIO.structure.data.implementations.LinkedList;
import com.DIO.structure.data.implementations.Queue;
import com.DIO.structure.data.implementations.Stack;

public class App {
	public static void main(String[] args) {
		System.out.printf("Java Data Structures - DIO\n\n");

		// -------------------------------------------------------------------------

		System.out.printf("[STACK]--------------------------------------------\n\n");
		Stack<String> myStack = new Stack<>();

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack + "\n");

		myStack.push("1");
		myStack.push("2");
		myStack.push("3");
		myStack.push("4");
		myStack.push("5");
		myStack.push("6");

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack + "\n");

		while (!myStack.isEmpty()) {
			System.out.printf("Poped: \"" + myStack.pop() + "\"\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this stack empty? " + myStack.isEmpty() + "\n");
		System.out.printf("Top of the stack: " + myStack.top() + "\n");
		System.out.printf(myStack + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("[QUEUE]--------------------------------------------\n\n");
		Queue<String> myQueue = new Queue<>();

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First value of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue + "\n");

		myQueue.enqueue("First");
		myQueue.enqueue("Second");
		myQueue.enqueue("Third");
		myQueue.enqueue("Fourth");
		myQueue.enqueue("Fifth");
		myQueue.enqueue("Sixth");

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First value of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue + "\n");

		while (!myQueue.isEmpty()) {
			System.out.printf("Dequeued: \"" + myQueue.dequeue() + "\"\n");
		}

		System.out.printf("\n");

		System.out.printf("Is this queue empty? " + myQueue.isEmpty() + "\n");
		System.out.printf("First node of the queue: " + myQueue.first() + "\n");
		System.out.printf(myQueue + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("[LINKED LIST]--------------------------------------\n\n");
		LinkedList<String> myLinkedList = new LinkedList<>();

		System.out.printf("Is this linked list empty? " + myLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the linked list: " + myLinkedList.size() + "\n");
		System.out.printf("First value of the linked list: " + myLinkedList.get(0) + "\n");
		System.out.printf("Last value of the linked list: " + myLinkedList.get(myLinkedList.size()-1) + "\n");
		System.out.printf(myLinkedList + "\n");
		
		myLinkedList.add("D");
		myLinkedList.add("I");
		myLinkedList.add("O");
		myLinkedList.add("-");
		myLinkedList.add("J");
		myLinkedList.add("A");
		myLinkedList.add("V");
		myLinkedList.add("A");
		
		System.out.printf("Is this linked list empty? " + myLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the linked list: " + myLinkedList.size() + "\n");
		System.out.printf("First value of the linked list: " + myLinkedList.get(0) + "\n");
		System.out.printf("Last value of the linked list: " + myLinkedList.get(myLinkedList.size()-1) + "\n");
		System.out.printf(myLinkedList + "\n");

		while (!myLinkedList.isEmpty()) {
			System.out.printf("Removed: \"" + myLinkedList.remove(0) + "\"\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this linked list empty? " + myLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the linked list: " + myLinkedList.size() + "\n");
		System.out.printf("First value of the linked list: " + myLinkedList.get(0) + "\n");
		System.out.printf("Last value of the linked list: " + myLinkedList.get(myLinkedList.size()-1) + "\n");
		System.out.printf(myLinkedList + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("[DOUBLY LINKED LIST]-------------------------------\n\n");
		DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<>();

		System.out.printf("Is this doubly linked list empty? " + myDoublyLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the doubly linked list: " + myDoublyLinkedList.size() + "\n");
		System.out.printf("First value of the doubly linked list: " + myDoublyLinkedList.first() + "\n");
		System.out.printf("Last value of the doubly linked list: " + myDoublyLinkedList.last() + "\n");
		System.out.printf(myDoublyLinkedList + "\n");

		myDoublyLinkedList.add("One Piece");
		myDoublyLinkedList.add("Bleach", 0);
		myDoublyLinkedList.add("Noragami", myDoublyLinkedList.size()-1);
		myDoublyLinkedList.add("Megalobox", 1);
		myDoublyLinkedList.add("Cowboy Beebop", 2);

		System.out.printf("Is this doubly linked list empty? " + myDoublyLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the doubly linked list: " + myDoublyLinkedList.size() + "\n");
		System.out.printf("First value of the doubly linked list: " + myDoublyLinkedList.first() + "\n");
		System.out.printf("Last value of the doubly linked list: " + myDoublyLinkedList.last() + "\n");
		System.out.printf(myDoublyLinkedList + "\n");

		while (!myDoublyLinkedList.isEmpty()) {
			// System.out.printf("Removed: " + myDoublyLinkedList.remove(0) + "\n");
			System.out.printf("Removed: " + myDoublyLinkedList.remove(myDoublyLinkedList.size()-1) + "\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this doubly linked list empty? " + myDoublyLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the doubly linked list: " + myDoublyLinkedList.size() + "\n");
		System.out.printf("First value of the doubly linked list: " + myDoublyLinkedList.first() + "\n");
		System.out.printf("Last value of the doubly linked list: " + myDoublyLinkedList.last() + "\n");
		System.out.printf(myDoublyLinkedList + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("[CIRCULAR LINKED LIST]-------------------------------\n\n");

		// -------------------------------------------------------------------------

		
	}
}
