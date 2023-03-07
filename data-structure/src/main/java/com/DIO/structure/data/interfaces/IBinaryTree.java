package com.DIO.structure.data.interfaces;

import com.DIO.structure.data.enums.BinaryTreeOrderEnum;

public interface IBinaryTree<T extends Comparable<T>> {
	boolean isEmpty();
	void add(T value);
	void remove(T value);
	T root();
	void show();
	void show(BinaryTreeOrderEnum order);
}
