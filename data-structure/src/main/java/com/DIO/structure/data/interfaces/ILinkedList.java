package com.DIO.structure.data.interfaces;

public interface ILinkedList<T> {
	public boolean isEmpty();
	public T first();
	public T last();
	public void add(T value);
	public int size();
}
