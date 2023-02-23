package com.DIO.structure.data.interfaces;

public interface IStack<T> {
	public boolean isEmpty();
	public T top();
	public void push(T value);
	public T pop();
}
