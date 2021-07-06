package stackDemo;

import java.util.ArrayList;

public class GenericStack<T> {
	ArrayList<T> arr;
	int capacity;
	int top;
	public GenericStack(int capacity) {
		top = -1;
		this.capacity = capacity;
		arr = new ArrayList<T>(capacity);
	}
	
	public void peek() {
		for(int i = top; i >= 0; i--) {
			System.out.println(arr.get(i));
		}
	}
	
	public void push(T element) {
		if(getSize() == capacity - 1) {
			throw new RuntimeException("Stack is full...");
		}
		System.out.println("Push :: " + element);
		top++;
		arr.add(top,element);
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty...");
		}
		T element = arr.remove(top);
		System.out.println("Pop :: " + element);
		top--;
		return element;
	}
	
	boolean isEmpty() {
		return(top == -1);
	}
	
	int getSize() {
		return top;
	}
	
}
