package me.boukadi.generics;

public class GenericClass<T> {
	private T[] items = (T[]) new Object[10];
	private int counter = 0;
	
	public void add(T item) {
		items[counter] = item;
		counter++;
	}
	
	public T get(int index) {
		return items[index];
	}
}
