package com.DIO.structure.data.interfaces;

public interface IQueue<T> {
	public boolean isEmpty();
	public T first();
	public void enqueue(T value);
	public T dequeue();
}
