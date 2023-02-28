package com.DIO.structure.data.interfaces;

public interface IDoublyLinkedList<T> {
	public boolean isEmpty();
	public void add(T value);
	public void add(T value, int index);
	public T remove(int index);
	public T get(int index);
	public int size();
	public T first();
	public T last();
}
