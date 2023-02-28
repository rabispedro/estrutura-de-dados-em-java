package com.DIO.structure.data.interfaces;

public interface ILinkedList<T> {
	public boolean isEmpty();
	public void add(T value);
	public T remove(int index);
	public T get(int index);
	public int size();
}
