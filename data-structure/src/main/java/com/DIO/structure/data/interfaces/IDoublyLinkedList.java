package com.DIO.structure.data.interfaces;

public interface IDoublyLinkedList<T extends Comparable<T>> {
	boolean isEmpty();
	void add(T value);
	void add(T value, int index);
	T remove(int index);
	T get(int index);
	int size();
	T first();
	T last();
}
