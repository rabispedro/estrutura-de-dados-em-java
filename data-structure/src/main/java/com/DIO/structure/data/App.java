package com.DIO.structure.data;

import com.DIO.structure.data.enums.BinaryTreeOrderEnum;
import com.DIO.structure.data.implementations.BinaryTree;
import com.DIO.structure.data.implementations.CircularLinkedList;
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
			System.out.printf("Removed: " + myDoublyLinkedList.remove(0) + "\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this doubly linked list empty? " + myDoublyLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the doubly linked list: " + myDoublyLinkedList.size() + "\n");
		System.out.printf("First value of the doubly linked list: " + myDoublyLinkedList.first() + "\n");
		System.out.printf("Last value of the doubly linked list: " + myDoublyLinkedList.last() + "\n");
		System.out.printf(myDoublyLinkedList + "\n");

		// -------------------------------------------------------------------------

		System.out.printf("[CIRCULAR LINKED LIST]-------------------------------\n\n");
		CircularLinkedList<String> myCircularLinkedList = new CircularLinkedList<>();

		System.out.printf("Is this circular linked list empty? " + myCircularLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the circular linked list: " + myCircularLinkedList.size() + "\n");
		System.out.printf("First value of the circular linked list: " + myCircularLinkedList.first() + "\n");
		System.out.printf("Last value of the circular linked list: " + myCircularLinkedList.last() + "\n");
		System.out.printf(myCircularLinkedList + "\n");

		myCircularLinkedList.add("♣️");
		myCircularLinkedList.add("♥️");
		myCircularLinkedList.add("♠️");
		myCircularLinkedList.add("♦️");

		System.out.printf("Is this circular linked list empty? " + myCircularLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the circular linked list: " + myCircularLinkedList.size() + "\n");
		System.out.printf("First value of the circular linked list: " + myCircularLinkedList.first() + "\n");
		System.out.printf("Last value of the circular linked list: " + myCircularLinkedList.last() + "\n");
		System.out.printf(myCircularLinkedList + "\n");

		while (!myCircularLinkedList.isEmpty()) {
			System.out.printf("Removed:" + myCircularLinkedList.remove(0) + "\n");
		}
		System.out.printf("\n");

		System.out.printf("Is this circular linked list empty? " + myCircularLinkedList.isEmpty() + "\n");
		System.out.printf("Size of the circular linked list: " + myCircularLinkedList.size() + "\n");
		System.out.printf("First value of the circular linked list: " + myCircularLinkedList.first() + "\n");
		System.out.printf("Last value of the circular linked list: " + myCircularLinkedList.last() + "\n");
		System.out.printf(myCircularLinkedList + "\n");

		// -------------------------------------------------------------------------
		System.out.printf("[BINARY TREE]--------------------------------------\n\n");
		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();

		System.out.printf("Is this binary tree empty? " + myBinaryTree.isEmpty() + "\n");
		System.out.printf("Root of this binary tree: " + myBinaryTree.root() + "\n");
		myBinaryTree.show(BinaryTreeOrderEnum.IN_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.PRE_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.POS_ORDER);
		System.out.printf("\n\n");

		myBinaryTree.add(13);
		myBinaryTree.add(10);
		myBinaryTree.add(25);
		myBinaryTree.add(2);
		myBinaryTree.add(12);
		myBinaryTree.add(20);
		myBinaryTree.add(31);
		myBinaryTree.add(29);

		System.out.printf("Is this binary tree empty? " + myBinaryTree.isEmpty() + "\n");
		System.out.printf("Root of this binary tree: " + myBinaryTree.root() + "\n");
		myBinaryTree.show(BinaryTreeOrderEnum.IN_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.PRE_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.POS_ORDER);
		System.out.printf("\n\n");

		while (!myBinaryTree.isEmpty()) {
			System.out.printf("Removed: " + myBinaryTree.root() + " \n");
			myBinaryTree.remove(myBinaryTree.root());
		}
		System.out.printf("\n");

		System.out.printf("Is this binary tree empty? " + myBinaryTree.isEmpty() + "\n");
		System.out.printf("Root of this binary tree: " + myBinaryTree.root() + "\n");
		myBinaryTree.show(BinaryTreeOrderEnum.IN_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.PRE_ORDER);
		System.out.printf("\n");
		myBinaryTree.show(BinaryTreeOrderEnum.POS_ORDER);
		System.out.printf("\n\n");
	}
}
