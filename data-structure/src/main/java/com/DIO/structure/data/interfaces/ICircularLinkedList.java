package com.DIO.structure.data.interfaces;

public interface ICircularLinkedList<T extends Comparable<T>> {
	boolean isEmpty();
	void add(T value);
	T remove(int index);
	T get(int index);
	int size();
	T first();
	T last();
}
