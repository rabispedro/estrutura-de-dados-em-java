package com.DIO.structure.data.interfaces;

public interface IStack<T extends Comparable<T>> {
	boolean isEmpty();
	T top();
	void push(T value);
	T pop();
}
