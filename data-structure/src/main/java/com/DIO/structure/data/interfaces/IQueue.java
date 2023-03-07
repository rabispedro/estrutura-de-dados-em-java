package com.DIO.structure.data.interfaces;

public interface IQueue<T extends Comparable<T>> {
	boolean isEmpty();
	T first();
	void enqueue(T value);
	T dequeue();
}
